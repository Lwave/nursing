package com.ssm.controller;

import com.ssm.dao.MonthMapper;
import com.ssm.entity.MonthExample;
import com.ssm.entity.Salary;
import com.ssm.entity.User;
import com.ssm.service.SalaryService;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @Autowired
    UserService userService;

    @Autowired
    MonthMapper monthMapper;

    @RequestMapping("/show")
    public String getUserMonthSingle(Model model, @RequestParam("uid") int uid, @RequestParam("mid") int mid) {
        try {
            Salary userMonthSingle = salaryService.getUserMonthSingle(uid, mid);
            model.addAttribute("salary", userMonthSingle);
            return "salaryByUidAndMid";
        } catch (Exception e) {
            return "无工资";
        }
    }

    @RequestMapping("/getUserMonthSingle")
    public String getUserMonthSingle() {
        return "getUserMonthSingle";
    }

    //显示添加页面
    @RequestMapping("/showInsertView")
    public String showInsertView(Model model) {
        List<User> user67 = userService.findUserByRole2();
        model.addAttribute("user67", user67);
        MonthExample monthExample = new MonthExample();
        model.addAttribute("month", monthMapper.selectByExample(monthExample));
        return "showInsertView";
    }

    //管理员添加工资
    @RequestMapping("/insertSalary")
    @ResponseBody
    public String insertSalary(Salary salary) {
        if (salaryService.insertSelective(salary) == 1) {
            return "success";
        }
        return "error";
    }


    //显示所有员工
    @RequestMapping("/getAllSalary")
    public String getAllSalary(Model model) {
        List<Salary> allSalary = salaryService.getAllSalary();
        model.addAttribute("all", allSalary);
        return "getAllSalary";
    }

    //编辑工资
    @RequestMapping("/editShowEverySalary")
    public String editShowEverySalary(@RequestParam("id") int id, Model model) {
        Salary salary = salaryService.selectByPrimaryKey(id);
        model.addAttribute("ss", salary);
        return "editShowEverySalary";
    }


    @RequestMapping("/updateSalary")
    @ResponseBody
    public String updateSalary(Salary salary) {
        System.out.println(salary);
        if (salaryService.updateByPrimaryKey(salary) == 1) {
            return "success";
        }
        return "error";
    }


    @RequestMapping("/delSalary")
    @ResponseBody
    public int delSalary(@RequestParam("id") int id) {
        System.out.println(id);
        return salaryService.deleteByPrimaryKey(id);
    }

}
