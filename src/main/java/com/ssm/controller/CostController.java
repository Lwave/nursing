package com.ssm.controller;

import com.ssm.entity.Cost;
import com.ssm.entity.User;
import com.ssm.service.BedService;
import com.ssm.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CostController {

    @Autowired
    private CostService costService;
    @Autowired
    private BedService bedService;

    @RequestMapping("/CostUserCissify")
    public String CostUserCissify(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
     /*   CostExample costExample = new CostExample();
        CostExample.Criteria or = costExample.or();
        or.andUidEqualTo(user.getId());*/
        //根据sessionUserid查询cost表为uid的所有信息和user表中的用户名
       List<Cost> costs = costService.selectCostByUid(user.getId());
        model.addAttribute("cost", costs);
        return "cost";
    }

    /*查询所有的用户费用信息*/
    @RequestMapping("/CostUserAll")
    public String CostUserAll(Model model, HttpSession session) {

        model.addAttribute("cost", costService.CostbedUser());
        return "costUserAll";
    }

    /*更新支付状态*/
    @RequestMapping("/updateStatus")
    @ResponseBody
    public Map updateBedStatus(@RequestParam("id") int id, @RequestParam("bid") int bid, HttpSession session) {
        //设计Map集合存储需要给页面的对象数据
        HashMap<Object, Object> result = new HashMap<>();
        Cost cost1 = costService.selectByPrimaryKey(id);
        if(cost1.getOrderstatus() == 1){
            result.put("success","1");
        }else if(cost1.getOrderstatus() == 0) {
            Cost cost = new Cost();
            cost.setId(id);
            cost.setOrderstatus(1);
            costService.updateOrderStatus(cost);

           /* Bed bed = new Bed();
            bed.setId(bid);
            bed.setStatus(1);
            bedService.updateBedStatus(bed);*/
            result.put("success","2");
        }else if(cost1.getOrderstatus() == 2){
            cost1.setOrderstatus(1);
            costService.updateOrderStatus(cost1);
            result.put("success","2");
        }
       return result;
    }

}
