package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.DormitoryService;
import com.ssm.util.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RestController
public class EmailController {

    @Autowired
    DormitoryService dormitoryService;

    @RequestMapping("/email")
    public Map sendEmail(HttpSession session, @RequestParam("dormid") int dormid) {
        System.out.println(dormid);
        HashMap<Object, Object> map = new HashMap<>();
        User user = (User) session.getAttribute("user");
        String email = user.getEmail();
        String username = user.getUsername();
        System.out.println(email);
        // 获取库存
        // 每隔一秒监听库存值 重复执行
        // 线程池：很多线程(核心线程：一直是启动的，其他的线程会有存活时间)
        // 发送邮件
        ScheduledThreadPoolExecutor s = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);
        s.scheduleAtFixedRate(new Task(dormid, s, email,username), 0, 1, TimeUnit.SECONDS);
        map.put("success", "1");
        return map;

    }
}
