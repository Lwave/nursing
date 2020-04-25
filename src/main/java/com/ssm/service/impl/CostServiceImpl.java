package com.ssm.service.impl;

import com.ssm.dao.CostMapper;
import com.ssm.entity.Cost;
import com.ssm.entity.CostExample;
import com.ssm.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostServiceImpl implements CostService {
    @Autowired

    private CostMapper costMapper;


    @Override
    public List<Cost> CostbedUser() {
        return costMapper.CostbedUser();
    }

    @Override
    public int updateOrderStatus(Cost cost) {
        return costMapper.updateByPrimaryKeySelective(cost);
    }

    @Override
    public List<Cost> selectByExample(CostExample example) {
        return costMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(Cost cost) {
        return costMapper.insertSelective(cost);
    }

    @Override
    public List<Cost> selectCostByUid(int uid) {
        return costMapper.selectCostByUid(uid);
    }

    @Override
    public Cost selectByPrimaryKey(Integer id) {
        return costMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return costMapper.deleteByPrimaryKey(id);
    }
}
