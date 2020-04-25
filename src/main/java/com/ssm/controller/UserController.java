package com.ssm.controller;

import com.ssm.dao.UserMapper;
import com.ssm.entity.ExcelBean;
import com.ssm.entity.User;
import com.ssm.entity.UserExample;
import com.ssm.service.UserService;
import com.ssm.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/login")
    public String login(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user.getRole() == 2) {
            user.setRole(3);
            userService.updateUserById(user);
        } else if (user.getRole() == 4) {
            user.setRole(5);
            userService.updateUserById(user);
        }else if(user.getRole() == 6){
            user.setRole(7);
            userService.updateUserById(user);
        }
        session.invalidate();
        return "login";
    }

    /**
     * 中英转换
     */
    @RequestMapping(value = "/transform")
    public String test1(HttpServletRequest request, HttpSession session) {

        String z = request.getParameter("prefix");
        String y = request.getParameter("suffix");
        Locale locale = new Locale(z, y); // Locale代表当前语言地区和国家
        //第一种方法
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
        //第二种方法
        //ResourceBundle bundle = ResourceBundle.getBundle("message",locale);
        //mv.addObject("bundle",bundle);
        return "login";
    }


    @RequestMapping(value = "/ulogin", method = RequestMethod.POST)
    @ResponseBody
    public String login(User user, HttpSession session) {
        int flag = userService.findAll(user, session);
        if (flag == 1) {
            return "admin";
        } else if (flag == 2) {
            return "user";
        } else if(flag == 3){
            return "user";
        }else {
            return "error";
        }
    }



    @RequestMapping(value = "/uregister", method = RequestMethod.POST)
    @ResponseBody
    public String register(User user) throws ParseException {
        //查询所有用户
        List<User> allByName = userService.findAllByName(user);
        System.out.println(allByName);
        if (allByName == null || allByName.size() == 0) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String datee = dateFormat.format(date);
            user.setCreatedate(dateFormat.parse(datee));
            user.setRole(user.getRole());
            user.setGender(0);
            user.setUresp(0);
            Date date1 = dateFormat.parse("2019-10-31");
            user.setBirthday(date1);
            userService.insertUser(user);
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/admin-list")
    public String admin_list(ModelMap map) {
        List<User> admin = userService.findAdmin();
        map.addAttribute("admin", admin);
        return "admin-list";
    }

    @RequestMapping(value = "/admin-addd", method = RequestMethod.POST)
    @ResponseBody
    public String admin_add(User user) throws ParseException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String datee = dateFormat.format(date);
        user.setCreatedate(dateFormat.parse(datee));
        userService.insertUser(user);
        return "success";
    }

    @RequestMapping(value = "/admin-editt")
    public String admin_editt(@RequestParam("id") int id, ModelMap map) {
        User adminById = userService.findUserById(id);
        map.addAttribute("adminId", adminById);
        return "admin-edit";
    }

    /**
     * 编辑前数据回显
     *
     * @param id 被编辑的用户的id
     * @return 编辑页面
     */
    @RequestMapping(value = "/admin-role-edit")
    public String admin_role_edit(@RequestParam("id") int id, ModelMap map) {
        User adminById = userService.findUserById(id);
        map.addAttribute("adminRoleId", adminById);
        return "admin-role-edit";
    }

    /**
     * 修改管理员密码
     *
     * @param user 管理员信息
     */
    @RequestMapping(value = "/admin-role-editt")
    @ResponseBody
    public String admin_role_editt(User user) {
        userService.updateUserById(user);
        return "success";
    }

    @RequestMapping(value = "/admin-edit")
    @ResponseBody
    public String admin_edit(User user, ModelMap map) {
        user.setId(user.getId());
        userService.updateUserById(user);
        return "success";
    }

    @RequestMapping(value = "/employeeInfo")
    public String employeeInfo(ModelMap map) {
        List<User> userByRole = userService.findUserByRole2();
        map.addAttribute("role6",userByRole);
        return "employeeInfo";
    }




    @RequestMapping(value = "/elderly-list-is")
    public String elderly_list_is(ModelMap map) {
        List<User> userByRole = userService.findUserByRole();
        map.addAttribute("userByRole", userByRole);
        return "elderly-list-is";
    }


    @RequestMapping(value = "/ouster-list-is")
    public String ouster_list_is(ModelMap map) {
        List<User> userByRole = userService.findUserByRole1();
        map.addAttribute("userByRole", userByRole);
        return "ouster-list-is";
    }

    @RequestMapping(value = "/user-edit")
    public String user_edit(@RequestParam("id") int id, ModelMap map) {
        User userById = userService.findUserById(id);
        map.addAttribute("userById", userById);
        return "user-edit";
    }

    @RequestMapping(value = "/delElderly")
    @ResponseBody
    public String delElderly(@RequestParam("id") int id) {
        userService.delUserById(id);
        return "success";
    }

    @RequestMapping(value = "/batchDelUser")
    @ResponseBody
    public String batchDelUser(@RequestParam("elderlyIds") String id) {
        int index = id.lastIndexOf(",");
        String userId = id.substring(0, index);
        for (String s : userId.split(",")) {
            userService.delUserById(Integer.valueOf(s));
        }
        return "success";
    }

    @RequestMapping(value = "/elderly-addd")
    @ResponseBody
    public String elderly_add(User user, ModelMap map) {
        userService.insertUser(user);
        return "success";
    }

    @RequestMapping(value = "/export", method = RequestMethod.GET)
    @ResponseBody
    public void exportUser(HttpServletRequest req, HttpServletResponse reps) throws IOException, Exception {
        reps.reset(); // 清除buffer缓存
        // 指定下载的文件名，浏览器都会使用本地编码，即GBK，浏览器收到这个文件名后，用ISO-8859-1来解码，然后用GBK来显示
        // 所以我们用GBK解码，ISO-8859-1来编码，在浏览器那边会反过来执行。
        reps.setHeader("Content-Disposition",
                "attachment;filename=" + new String("注册老人一览表.xlsx".getBytes("UTF-8"), "ISO-8859-1"));
        reps.setContentType("application/vnd.ms-excel;charset=UTF-8");
        reps.setHeader("Pragma", "no-cache");
        reps.setHeader("Cache-Control", "no-cache");
        reps.setDateHeader("Expires", 0);
        //查询所有字段
        List<User> userList = userService.findUserByRole();
        // 导出Excel对象
        OutputStream output;
        List<ExcelBean> excel = new ArrayList<>();
        Map<Integer, List<ExcelBean>> map = new LinkedHashMap<>();
        //设置标题栏
        excel.add(new ExcelBean("编号", "id", 0));
        excel.add(new ExcelBean("用户名", "username", 0));
        excel.add(new ExcelBean("昵称", "nickname", 0));
        excel.add(new ExcelBean("民族", "nation", 0));
        excel.add(new ExcelBean("身份证号", "idcard", 0));
        excel.add(new ExcelBean("地址", "address", 0));
        excel.add(new ExcelBean("性别", "gender", 0));
        excel.add(new ExcelBean("个人电话", "phone", 0));
        excel.add(new ExcelBean("亲属电话", "realationtele", 0));
        excel.add(new ExcelBean("邮箱", "email", 0));
        excel.add(new ExcelBean("年龄", "age", 0));
        excel.add(new ExcelBean("加入时间", "createdate", 0));
        excel.add(new ExcelBean("用户状态", "role", 0));
        map.put(0, excel);
        String sheetName = "注册老人一览";
        //调用ExcelUtil的方法
        XSSFWorkbook workbook = ExcelUtil.createExcelFile(User.class, userList, map, sheetName);
        try {
            output = reps.getOutputStream();
            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
            bufferedOutPut.flush();
            workbook.write(bufferedOutPut);
            bufferedOutPut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/export1", method = RequestMethod.GET)
    @ResponseBody
    public void exportEmployee(HttpServletRequest req, HttpServletResponse reps) throws IOException, Exception {
        reps.reset(); // 清除buffer缓存
        // 指定下载的文件名，浏览器都会使用本地编码，即GBK，浏览器收到这个文件名后，用ISO-8859-1来解码，然后用GBK来显示
        // 所以我们用GBK解码，ISO-8859-1来编码，在浏览器那边会反过来执行。
        reps.setHeader("Content-Disposition",
                "attachment;filename=" + new String("员工信息一览表.xlsx".getBytes("UTF-8"), "ISO-8859-1"));
        reps.setContentType("application/vnd.ms-excel;charset=UTF-8");
        reps.setHeader("Pragma", "no-cache");
        reps.setHeader("Cache-Control", "no-cache");
        reps.setDateHeader("Expires", 0);
        //查询所有字段
        List<User> userList = userService.findUserByRole2();
        // 导出Excel对象
        OutputStream output;
        List<ExcelBean> excel = new ArrayList<>();
        Map<Integer, List<ExcelBean>> map = new LinkedHashMap<>();
        //设置标题栏
        excel.add(new ExcelBean("编号", "id", 0));
        excel.add(new ExcelBean("用户名", "username", 0));
        excel.add(new ExcelBean("昵称", "nickname", 0));
        excel.add(new ExcelBean("民族", "nation", 0));
        excel.add(new ExcelBean("身份证号", "idcard", 0));
        excel.add(new ExcelBean("工资卡号", "salarycard", 0));
        excel.add(new ExcelBean("地址", "address", 0));
        excel.add(new ExcelBean("性别", "gender", 0));
        excel.add(new ExcelBean("个人电话", "phone", 0));
        excel.add(new ExcelBean("亲属电话", "realationtele", 0));
        excel.add(new ExcelBean("邮箱", "email", 0));
        excel.add(new ExcelBean("年龄", "age", 0));
        excel.add(new ExcelBean("加入时间", "createdate", 0));
        excel.add(new ExcelBean("用户状态", "role", 0));
        map.put(0, excel);
        String sheetName = "员工信息一览";
        //调用ExcelUtil的方法
        XSSFWorkbook workbook = ExcelUtil.createExcelFile(User.class, userList, map, sheetName);
        try {
            output = reps.getOutputStream();
            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
            bufferedOutPut.flush();
            workbook.write(bufferedOutPut);
            bufferedOutPut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/pieChart")
    public String pieChart(ModelMap map) {
        UserExample userExample = new UserExample();
        UserExample.Criteria or = userExample.or();
        or.andRoleEqualTo(2);
        long count = userService.count(userExample);
        map.addAttribute("log", count);

        UserExample userExample1 = new UserExample();
        UserExample.Criteria or1 = userExample1.or();
        or1.andRoleEqualTo(3);
        long count1 = userService.count(userExample1);
        map.addAttribute("nlog", count1);

        UserExample userExample2 = new UserExample();
        UserExample.Criteria or2 = userExample2.or();
        or2.andRoleEqualTo(1);
        long count2 = userService.count(userExample2);
        map.addAttribute("ad", count2);

        UserExample userExample3 = new UserExample();
        UserExample.Criteria or3 = userExample.or();
        or3.andRoleEqualTo(6);
        long count3 = userService.count(userExample);
        map.addAttribute("u1", count3);

        UserExample userExample4 = new UserExample();
        UserExample.Criteria or4 = userExample1.or();
        or4.andRoleEqualTo(7);
        long count4 = userService.count(userExample1);
        map.addAttribute("u2", count4);

       /* String[] legend = {"老人登录人数", "老人未登录人数", "管理员人数", "员工登录人数", "员工未登录人数"};
        map.addAttribute("legend", legend);*/

        //String s = JSON.toJSONString(userByRole);
        return "pieChart";
    }

    @RequestMapping(value = "/personInfo")
    public String personInfo(HttpSession session,ModelMap map) {
        User user = (User) session.getAttribute("user");
        map.addAttribute("info",userService.selectByPrimaryKey(user.getId()));
        return "personInfo";
    }


}
