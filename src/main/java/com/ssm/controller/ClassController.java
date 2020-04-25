package com.ssm.controller;

import com.ssm.entity.Class;
import com.ssm.entity.User;
import com.ssm.service.ClassService;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClassController {

    @Autowired
    ClassService classService;
    @Autowired
    UserService userService;


    @RequestMapping("/employeeService")
    public ModelAndView getEmployeeService(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("classInfo");
        List<Class> employeeService = classService.getEmployeeService();
        mv.addObject("cc", employeeService);
        return mv;
    }


    @RequestMapping("/addClass")
    public ModelAndView addClass(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addClass");
        List<User> employeeName = userService.findUserByRole2();
        System.out.println(employeeName);
        mv.addObject("employeeName", employeeName);
        List<User> userByRole = userService.findUserByRole3();
        mv.addObject("oldName", userByRole);
        return mv;
    }

    @RequestMapping("/classAdd1")
    @ResponseBody
    public String classAdd1(@RequestParam(value = "id") int id, @RequestParam(value = "uresp") int uresp, @RequestParam(value = "position") String position, @RequestParam(value = "classInfo") String classInfo, @RequestParam(value = "classHour") String classHour, @RequestParam(value = "className") String className) {
        // System.out.println(id+"--------"+uresp+"--"+classHour+"--"+className);
        try {
            Class c = new Class();
            String[] hour = classHour.split(",");
            String[] name = className.split(",");
            String[] info = classInfo.split(",");
            String[] p = position.split(",");
            c.setClasshour(hour[0]);
            c.setClassinfo(info[0]);
            c.setClassname(name[0]);
            c.setPosition(p[0]);
            c.setUid(id);
            classService.insertSelective(c);
            if (uresp != 0) {
                User user = userService.findUserById(id);
                user.setUresp(uresp);
                userService.updateUserById(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }


    @RequestMapping("/classEdit1")
    @ResponseBody
    public String classEdit1(@RequestParam(value = "id") int id, @RequestParam(value = "uresp") int uresp, @RequestParam(value = "position") String position, @RequestParam(value = "classInfo") String classInfo, @RequestParam(value = "classHour") String classHour, @RequestParam(value = "className") String className, @RequestParam(value = "situation") String situation, @RequestParam(value = "uid") int uid) {
        try {
            Class c = classService.selectByPrimaryKey(id);
            String[] hour = classHour.split(",");
            String[] name = className.split(",");
            String[] info = classInfo.split(",");
            String[] p = position.split(",");
            String[] f = situation.split(",");
            c.setClasshour(hour[0]);
            c.setClassinfo(info[0]);
            c.setClassname(name[0]);
            c.setPosition(p[0]);
            c.setSituation(f[0]);
            classService.updateByPrimaryKeySelective(c);
            User user = userService.findUserById(uid);
            user.setUresp(uresp);
            userService.updateUserById(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }


    @RequestMapping("/editClass")
    public ModelAndView editClass(Model model, @RequestParam("id") int id) {
        System.out.println(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editClass");
        Class employeeEdit = classService.getEmployeeEdit(id);
        System.out.println(employeeEdit);
        System.out.println(employeeEdit);
        mv.addObject("employeeName", employeeEdit);
        List<User> userByRole = userService.findUserByRole3();
        mv.addObject("oldName", userByRole);
        return mv;
    }


    @RequestMapping("/singleClass")
    public ModelAndView singleClass(Model model, HttpSession session) {

        ModelAndView mv = new ModelAndView();
        User user = (User) session.getAttribute("user");
        try {
            int id = classService.getClass(user.getId());
            if (String.valueOf(id) != null) {
                Class employeeEdit = classService.getEmployeeSingle(id);
                System.out.println(employeeEdit);
                mv.addObject("singleClass", employeeEdit);
                mv.setViewName("singleClass");
            } else {
                mv.setViewName("classBySingle");
            }

        } catch (Exception e) {
            //异常处理页面
            mv.setViewName("classBySingle");
        }
        return mv;
    }


    @RequestMapping("/singleInfo")
    public ModelAndView singleInfo(Model model, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        User user = (User) session.getAttribute("user");
        User user1 = userService.selectByPrimaryKey(user.getId());
        mv.setViewName("singleInfo");
        mv.addObject("user", user1);
        return mv;
    }


    @RequestMapping("/delClass")
    @ResponseBody
    public Map delClass(@RequestParam("id") int id) {
        HashMap<Object, Object> map = new HashMap<>();
        if ( classService.deleteByPrimaryKey(id) == 1){
            map.put("success","1");
            return map;
        }
       return null;
    }


}
