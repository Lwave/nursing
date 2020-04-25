package com.ssm.controller;

import com.ssm.entity.Dormitory;
import com.ssm.entity.DormitoryExample;
import com.ssm.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;

    @RequestMapping("/insertBed")
    public String roomNum(DormitoryExample dormitoryExample, Model model) {
        List<Dormitory> dormitories = dormitoryService.selectByExample(dormitoryExample);
       /* Dormitory dormitory1 = new Dormitory();
        for (Dormitory dormitory : dormitories) {
            dormitory1.setId(dormitory.getId());
        }*/

       /* for(Dormitory d:dormitories){
            String s = String.valueOf(d.getId());
            System.out.println(s);
        }
*/
        model.addAttribute("dormitorys", dormitories);
        return "bedAdd";
    }

    @RequestMapping("/list")
    public String upload( HttpSession session) {
        String file = session.getServletContext().getRealPath("file");
        return "welcome";
    }
}
