package com.ssm.controller;

import com.ssm.entity.Bed;
import com.ssm.entity.Cost;
import com.ssm.entity.Dormitory;
import com.ssm.entity.User;
import com.ssm.service.BedService;
import com.ssm.service.CostService;
import com.ssm.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class BedController {
    /*bed属性注入*/
    @Autowired
    private BedService bedService;
    /*cost属性注入*/
    @Autowired
    private CostService costService;

    @Autowired
    private DormitoryService dormitoryService;

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    /*
     *单条数据删除
     * */
    @RequestMapping("/delBed")
    @ResponseBody
    public int delById(Bed bed) {
        Integer id = bed.getId();
        int i = bedService.deleteByPrimaryKey(id);
        return i;
    }

    /*
     * 实现批量删除功能
     * */
    @RequestMapping(value = "/batchDelBed")
    @ResponseBody
    public String batchDelUser(@RequestParam("bedId") String id) {
        int index = id.lastIndexOf(",");
        String userId = id.substring(0, index);
        for (String s : userId.split(",")) {
            bedService.deleteByPrimaryKey(Integer.valueOf(s));
        }
        return "success";
    }

    /*
     * 插入床信息数据
     * */
    @RequestMapping("/bed")
    @ResponseBody
    public Map<String, Object> bedAdd1(Bed bed) {
        Map<String, Object> result = new HashMap<>();
        try {
            bedService.insert(bed);
            result.put("success", true);
        } catch (Exception e) {
            result.put("success", false);
        }

        return result;
    }

    /*
    通过条件(三表查询与两表查询，查询所有床的信息列表)
    */
    @RequestMapping("/changeBed")
    public String bedAdd1(Model model) {

        List<Bed> list = new ArrayList<Bed>();
        /*BedExample bedExample = new BedExample();
        UserExample userExample = new UserExample();*/
        /*查床的所有信息，床的单表查询*/
        List<Bed> beds3 = bedService.selectSigleBed();

        /*三表查询楼舍表，用户表，床表*/
        List<Bed> beds = bedService.selectAllBed();

        for (Bed bed1 : beds) {
            list.add(bed1);
        }
        /*    HashSet<Bed> hs = new HashSet<>(list); //此时已经去掉重复的数据保存在hashset中*/
        /*二表查询楼舍表，床表*/
        List<Bed> beds1 = bedService.selectBedNoUser();

        for (Bed bed4 : beds1) {
            list.add(bed4);
        }
        model.addAttribute("bed", list);
        return "bedList";

    }

    @RequestMapping("/bedInfo")
    public String bedInfo(Model model, HttpSession session) {
        /*User user = new User();
        user.setId(3);
        session.setAttribute("user", user);*/
        List<Bed> beds = bedService.selectBedNoUser();
        model.addAttribute("beds", beds);
        return "orderBed";
    }

    /*判断是否已入住 */
    @RequestMapping("/updateBedStatus")
    @ResponseBody
    public Map<String, Object> updateBedStatus(@RequestParam("id") int id,
                                               @RequestParam("dormid") int dormid,
                                               HttpSession session) throws ParseException {
        //设计Map集合存储需要给页面的对象数据
        Map<String, Object> result = new HashMap<>();

        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                result.put("success", "0");
            } else {
                Bed bed = new Bed();
                bed.setId(id);
                session.setAttribute("id", id);
                bed.setUid(user.getId());
                List<Bed> listBed = bedService.selectSigleBed();
                if (dormitoryService.selectByPrimaryKey(dormid).getBedcount() > 0) {
                    boolean flag = false;
          /*  for (Bed bedss : listBed) {
                if (bedss.getUid() == user.getId()) {
                    flag = true;
                    bed.setStatus(0);
                    result.put("success", "0");
                    break;
                }

            }*/
                    if (!flag) {

                        //给花费表新增一条记录
                        Cost cost = new Cost();
                        cost.setBid(id);
                        cost.setUid(user.getId());
                        cost.setOrderstatus(0);
                        Date date = new Date();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                        String datee = dateFormat.format(date);
                        cost.setCostdate(dateFormat.parse(datee));
                        cost.setEaxmcost(1500.00);
                        cost.setFoodcost(2500.00);
                        cost.setLinecost(600.00);
                        costService.insertSelective(cost);
                        bed.setStatus(2);
                        bedService.updateBedStatus(bed);
                        if (bed.getStatus() == 1 || bed.getStatus() == 2) {
                            Dormitory dormitory = dormitoryService.selectByPrimaryKey(dormid);
                            dormitory.setBedcount(dormitory.getBedcount() - 1);
                            dormitoryService.updateByPrimaryKey(dormitory);

                        }
                        result.put("success", "1");
                    }
                } else {
                    result.put("success", "2");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    //跳转编辑页面回显数据
    @RequestMapping("/editBed")
    public String singleBed(@RequestParam("id") int id, Model model) {
        Bed bed = bedService.selectByPrimaryKey(id);
        Dormitory dormitory = dormitoryService.selectByPrimaryKey(bed.getDormid());
        model.addAttribute("bed", bed);
        model.addAttribute("dormitory", dormitory);
        return "editBed";
    }


    /*对数据进行修改*/
    @RequestMapping("/updateBedById")
    @ResponseBody
    public String bedAdd(Bed bed, Dormitory dormitory) {

        bed.setId(bed.getId());
        bedService.updateByPrimaryKeySelective(bed);
        Bed bed1 = bedService.selectByPrimaryKey(bed.getId());
        Dormitory dormitory1 = dormitoryService.selectByPrimaryKey(bed1.getDormid());
        System.out.println(dormitory1);
        dormitory1.setId(bed1.getDormid());
        dormitory1.setBedcount(dormitory.getBedcount());
        dormitoryService.updateByPrimaryKey(dormitory1);

        return "success";
    }

    /*增加床信息*/
    //如果添加页面的name属性=bed类的属性，bed得到所有床信息   icon得到图片地址
    @RequestMapping(value = "/bedAdd1")
    @ResponseBody
    public String bedAdd(@RequestParam(value = "domid") String domid, @RequestParam(value = "price") Double price, @RequestParam(value = "des") String des, @RequestParam(value = "icon") String icon) {
        Bed bed = new Bed();
        int i = Integer.parseInt(domid);
        bed.setDormid(i);
        bed.setStatus(0);
        bed.setDescrible(des);
        bed.setPrice(price);
        bed.setIcon(icon);
        System.out.println(des);
        bedService.insert(bed);
        Dormitory dormitory = dormitoryService.selectByPrimaryKey(i);
        List<Bed> beds = bedService.selectSigleBed();
        try {
            if (des.equals("单人间")) {
                dormitory.setId(i);
                dormitory.setBedcount(1);
                dormitoryService.updateByPrimaryKey(dormitory);
            } else if (des.equals("二人间")) {
                dormitory.setId(i);

                dormitory.setBedcount(2);
                dormitoryService.updateByPrimaryKey(dormitory);
            } else if (des.equals("三人间")) {
                dormitory.setId(i);
                dormitory.setBedcount(3);
                dormitoryService.updateByPrimaryKey(dormitory);
            } else if (des.equals("四人间")) {
                dormitory.setId(i);
                dormitory.setBedcount(4);
                dormitoryService.updateByPrimaryKey(dormitory);
            } else if (des.equals("六人间")) {
                dormitory.setId(i);
                dormitory.setBedcount(6);
                dormitoryService.updateByPrimaryKey(dormitory);
            } else if (des.equals("八人间")) {
                dormitory.setId(i);
                dormitory.setBedcount(8);
                dormitoryService.updateByPrimaryKey(dormitory);
            }
            return "success";
        } catch (Exception e) {
            return null;
        }
    }

    /*上传图片*/
    @RequestMapping(value = "/uploader")
    @ResponseBody
    public String uploader(@RequestParam MultipartFile file, HttpSession session, HttpServletRequest request) throws IOException {
        System.out.println("收到图片!");
        // 如果文件不为空，写入上传路径，进行文件上传
        if (!file.isEmpty()) {
            // 构建上传文件的存放路径
            //String path = request.getServletContext().getRealPath("/static/upload/h-ui.admin");
            //String path = System.getProperty("user.dir")+"/src/main/resources/upload/h-ui.admin/";
            String path = session.getServletContext().getRealPath("file");
            System.out.println("path = " + path);

            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String filename = file.getOriginalFilename();

            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }

            // 将上传文件保存到目标文件目录
            file.transferTo(new File(path + File.separator + filename));

            //返回的文件路径(target路径)
            // @RequestParam(
            //value = "icon")接收到这个地址
            String url = "http://localhost:8080/file/" + filename;
            return url;
        } else {
            return "error";
        }
    }


    /*对数据进行修改*/
    @RequestMapping("/cancleOrder")
    @ResponseBody
    public Map<String, Object> cancleOrder(@RequestParam("costid") Integer costid, @RequestParam("dormId") int dormId, @RequestParam("bedid") int bedid) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            System.out.println(costid + "---" + dormId + "--" + bedid);
            Dormitory dormitory = dormitoryService.selectByPrimaryKey(dormId);
            dormitory.setBedcount(dormitory.getBedcount() + 1);
            dormitoryService.updateByPrimaryKey(dormitory);
            //更新dormitory
            costService.deleteByPrimaryKey(costid);
            Bed bed = bedService.selectByPrimaryKey(bedid);
            bed.setStatus(0);
            bed.setUid(0);
            bedService.updateBedStatus(bed);
            result.put("success", "1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    /*对数据进行修改*/
    @RequestMapping("/onlyOrderMoney")
    @ResponseBody
    public Map<String, Object> onlyOrderMoney(@RequestParam("costid") Integer costid) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            Cost cost = costService.selectByPrimaryKey(costid);
            cost.setOrderstatus(2);
            costService.updateOrderStatus(cost);
            result.put("success", "1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
