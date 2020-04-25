package com.ssm.controller;/*
package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.entity.UserExample;
import com.ssm.service.UserService;
import com.ssm.service.impl.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisService redisService;

    @Autowired
    UserService userService;

    @RequestMapping("/str")
    public String str() {
        boolean result = redisService.set("name2", "tom");
        System.out.println(result);
        boolean result1 = redisService.set("name3", "tom",20L);
        System.out.println(result1);
        if(redisService.exists("name3")){
            Object name3 = redisService.get("name3");
            System.out.println(name3);
        }
        //字符串类型
        */
/*ValueOperations<String, String> vo = redisTemplate.opsForValue();
        vo.set("name1", "tom");
        String name1 = vo.get("name1");
        System.out.println(name1);
        vo.append("name1", " hello!");
        String old = vo.getAndSet("name1", "new");
        System.out.println("old:" + old + "---new:" + vo.get("name1") + "--size:" + vo.size("name1"));*//*

        return "index";
    }

    //不会频繁改变数据---》假设商品表不变
    //首次查询到所有的商品---缓存到redis
    //下一次再访问所有商品时，直接从缓存获取
    @RequestMapping("/allpros")
    @ResponseBody
    public List<User> all(){
        //改写方法---redisTemplate--->redisService
        List<User> pross = new ArrayList<>();
        //判断redis是否缓存了数据
        //ListOperations<String, Object> soo = redisTemplate.opsForList();
        List<Object> list = redisService.lRange("all", 0, -1);
        if(list != null && list.size() > 0){
            for(Object obj:list){
                pross = (List<User>) obj;
            }
        }else {
            UserExample example = new UserExample();
            pross = userService.findAllUser(example);
            redisService.lPush("all", pross);
            //遍历redis中的集合
            List<Object> all1 = redisService.lRange("all", 0, -1);
            System.out.println(all1);//list
            System.out.println(all1.size());//1
        }
        return pross;
    }
    //redis操作hash类型---存储和读取

    //redis操作Set--存储和读取

    //redis操作zset--存储和读取
}*/
