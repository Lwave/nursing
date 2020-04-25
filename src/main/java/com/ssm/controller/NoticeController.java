package com.ssm.controller;

import com.ssm.entity.Notice;
import com.ssm.entity.NoticeExample;
import com.ssm.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @RequestMapping("/noticeList")
    public String noticeList(Model model) {
        NoticeExample noticeExample = new NoticeExample();
    /*    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = simpleDateFormat.parse(notice.getNotecreatedate());*/
        List<Notice> notices = noticeService.selectByExample(noticeExample);
        model.addAttribute("notices", notices);
        return "noticeList";
    }


}
