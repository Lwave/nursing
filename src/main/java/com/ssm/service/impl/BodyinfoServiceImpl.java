package com.ssm.service.impl;

import com.ssm.dao.BodyInfoMapper;
import com.ssm.entity.BodyInfo;
import com.ssm.entity.BodyInfoExample;
import com.ssm.entity.UserAndBodyinfo;
import com.ssm.service.BodyinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyinfoServiceImpl implements BodyinfoService {

    @Autowired
    private BodyInfoMapper bodyInfoMapper;


    @Override
    public List<BodyInfo> findAll(BodyInfoExample bodyinfoExample) {
        return bodyInfoMapper.selectByExample(bodyinfoExample);
    }

    @Override
    public int updateInfoById(BodyInfo bodyInfo) {
        return bodyInfoMapper.updateByPrimaryKeySelective(bodyInfo);
    }

    @Override
    public int insertInfo(BodyInfo bodyInfo) {
        return bodyInfoMapper.insertSelective(bodyInfo);
    }

    @Override
    public List<UserAndBodyinfo> findAll() {
        return bodyInfoMapper.findAll();
    }

    @Override
    public UserAndBodyinfo findAllById(int id) {
        return bodyInfoMapper.findAllById(id);
    }

    @Override
    public int delBodyinfoById(int id) {
        return bodyInfoMapper.deleteByPrimaryKey(id);
    }


}
