package com.ssm.service.impl;

import com.ssm.dao.DormitoryMapper;
import com.ssm.entity.Dormitory;
import com.ssm.entity.DormitoryExample;
import com.ssm.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    private DormitoryMapper dormitoryMapper;

    @Override
    public List<Dormitory> selectByExample(DormitoryExample example) {
        return dormitoryMapper.selectByExample(example);
    }

    @Override
    public Dormitory selectByPrimaryKey(Integer id) {
        return dormitoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Dormitory record) {
        return dormitoryMapper.updateByPrimaryKey(record);
    }
}
