package com.ssm.controller;

import com.ssm.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @Autowired
    private InformationService informationService;
    /**
     * 判断是否经过登录
     */
    public static Integer ss;


    @RequestMapping(value = "/loginn")
    public String loginn() {
        return "login";
    }

    /**
     * 登录后进入首页
     */
    @RequestMapping(value = "/index")
    public String index(HttpSession session) {
        ss = null;
        session.setAttribute("ss", ss);
        return "forward:/index.jsp";
    }

    /**
     * 未登录直接进入首页
     */
    @RequestMapping(value = "/indexx")
    public String index1(HttpSession session) {
        session.removeAttribute("user");
        ss = 0;
        session.setAttribute("ss", ss);
        return "forward:/index.jsp";
    }

    @RequestMapping(value = "/admin-add")
    public String admin_add() {
        return "admin-add";
    }

    @RequestMapping(value = "/elderly-add")
    public String elderly_add() {
        return "elderly-add";
    }

    @RequestMapping(value = "/ouster-add")
    public String ouster() {
        return "ouster-add";
    }



}
