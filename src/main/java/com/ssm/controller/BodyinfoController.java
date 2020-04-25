package com.ssm.controller;

import com.ssm.entity.BodyInfo;
import com.ssm.entity.BodyInfoExample;
import com.ssm.entity.User;
import com.ssm.entity.UserAndBodyinfo;
import com.ssm.service.BodyinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BodyinfoController {

    @Autowired
    private BodyinfoService bodyinfoService;

    @RequestMapping(value = "/bodyInfo")
    public String bodyInfo(ModelMap map, HttpSession session){
        BodyInfoExample bodyinfoExample = new BodyInfoExample();
        List<BodyInfo> all = bodyinfoService.findAll(bodyinfoExample);
        User user = (User)session.getAttribute("user");
        for(BodyInfo b : all){
            if(b.getUid() == user.getId()){
                map.addAttribute("bId",b.getId());
                map.addAttribute("have",1);
                return "bodyInfo";
            }else {
                map.addAttribute("have",0);
            }
        }
        return "bodyInfo";
    }

    @RequestMapping(value = "/changeBodyInfo",method = RequestMethod.POST)
    @ResponseBody
    public String changeBodyInfo(@RequestParam("state")int state, BodyInfo bodyInfo){

        //state=1更新   state=0新增
        if(state == 1){
            int i = bodyinfoService.updateInfoById(bodyInfo);
            System.out.println(i);
            return "renew";
        }else {
            int i = bodyinfoService.insertInfo(bodyInfo);
            System.out.println(i);
            return "finishAdd";
        }
    }

    @RequestMapping(value = "/bodyInfo-list")
    public String bodyInfo_list(ModelMap map){
        List<UserAndBodyinfo> all = bodyinfoService.findAll();
        map.addAttribute("all",all);
        return "bodyInfo-list";
    }

    @RequestMapping(value = "/detailed")
    public String detailed(@RequestParam("id")int id, ModelMap map){
        UserAndBodyinfo allById = bodyinfoService.findAllById(id);
        map.addAttribute("allById",allById);
        return "detailed";
    }

    @RequestMapping(value = "/delBodyinfo")
    @ResponseBody
    public String delBodyinfo(@RequestParam("id")int id){
        bodyinfoService.delBodyinfoById(id);
        return "success";
    }

    @RequestMapping(value = "/batchDelBodyinfo")
    @ResponseBody
    public String batchDelBodyinfo(@RequestParam("bodyinfoIds")String id){
        int index = id.lastIndexOf(",");
        String userId = id.substring(0,index);
        for(String s : userId.split(",")){
            bodyinfoService.delBodyinfoById(Integer.valueOf(s));
        }
        return "success";
    }

}
