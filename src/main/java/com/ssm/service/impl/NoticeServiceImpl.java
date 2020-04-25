package com.ssm.service.impl;

import com.ssm.dao.NoticeMapper;
import com.ssm.entity.Notice;
import com.ssm.entity.NoticeExample;
import com.ssm.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectByExample(NoticeExample example) {
        return noticeMapper.selectByExample(example);
    }
}
