package com.ssm.service.impl;

import com.ssm.dao.InformationMapper;
import com.ssm.entity.Information;
import com.ssm.entity.InformationExample;
import com.ssm.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    InformationMapper informationMapper;

    @Override
    public List<Information> selectByExample(InformationExample example)  {

        return informationMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public Information selectByPrimaryKey(Integer id) {
        return informationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Information record, InformationExample example) {
        return informationMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int insertSelective(Information record) {
        return informationMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return informationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Information record) {
        return informationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Information record) {
        return informationMapper.updateByPrimaryKeyWithBLOBs(record);
    }
}
