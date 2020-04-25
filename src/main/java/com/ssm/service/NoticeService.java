package com.ssm.service;

import com.ssm.entity.Notice;
import com.ssm.entity.NoticeExample;

import java.util.List;


public interface NoticeService {
    List<Notice> selectByExample(NoticeExample example);
}
