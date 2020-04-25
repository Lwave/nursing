package com.ssm.controller;

import com.ssm.entity.Information;
import com.ssm.entity.InformationExample;
import com.ssm.service.InformationService;
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
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class InformationController {

    @Autowired
    InformationService informationService;

    @RequestMapping("/delinfor")
    @ResponseBody
    public int delinfor(@RequestParam("id") int id) {
        return informationService.deleteByPrimaryKey(id);
    }


    @RequestMapping("/informationList")
    public String informationList(InformationExample informationExample, Model model) {
        List<Information> info = informationService.selectByExample(informationExample);
        model.addAttribute("information", info);
        return "information";
    }


    @RequestMapping(value = "/informationFix")
    public String informationFix(InformationExample informationExample, Model model) {
        List<Information> info = informationService.selectByExample(informationExample);
        model.addAttribute("information", info);
        return "informationFix";
    }


    @RequestMapping("/informationById")
    public String informationList(@RequestParam("id") int id, Model model) {
        Information information = informationService.selectByPrimaryKey(id);
        Date createtime = information.getCreatetime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(createtime);
        model.addAttribute("time", format);
        model.addAttribute("infoo", information);
        System.out.println("time" + information.getCreatetime());
        return "informationById";
    }

    @RequestMapping("/inforList")
    public String inforList(InformationExample informationExample, Model model) {
        List<Information> inforr = informationService.selectByExample(informationExample);
        model.addAttribute("inforr", inforr);
        return "inforList";
    }


    @RequestMapping(value = "/informationAdd")
    public String informationShowAdd() {
        return "informationAdd";
    }

    @RequestMapping(value = "/inforShow")
    @ResponseBody
    public String informationAdd(@RequestParam(value = "icon") String icon, @RequestParam(value = "title") String title, @RequestParam(value = "createTime") String createTime, @RequestParam(value = "content") String content) {
        try {

            Information information = new Information();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parse = simpleDateFormat.parse(createTime);
            String[] content1 = content.split(",");
            String[] title1 = title.split(",");
            information.setCreatetime(parse);
            information.setContent(content1[0]);
            information.setPic(icon);
            information.setTitle(title1[0]);
            informationService.insertSelective(information);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }


    @RequestMapping("/editInformation")
    public String editInfomation(@RequestParam("id") int id, Model model) {
        Information information = informationService.selectByPrimaryKey(id);
        model.addAttribute("mation", information);
        return "editInformation";
    }


    @RequestMapping(value = "/editShow")
    @ResponseBody
    public String editShow(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content) {

        Information information = informationService.selectByPrimaryKey(id);
        String[] content1 = content.split(",");
        System.out.println(Arrays.deepToString(content1));
        System.out.println(content1[0]);
        String[] title1 = title.split(",");
        information.setContent(content1[0]);
        information.setTitle(title1[0]);
        System.out.println(information + "===");
        informationService.updateByPrimaryKeyWithBLOBs(information);
        return "success";

    }

    /*上传图片*/
    @RequestMapping(value = "/upload")
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

}
