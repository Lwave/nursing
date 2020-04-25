package com.ssm.service;

import com.ssm.entity.Cost;
import com.ssm.entity.CostExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CostService {


    List<Cost> CostbedUser();

    int updateOrderStatus(Cost cost);

    List<Cost> selectByExample(CostExample example);

    int insertSelective(Cost cost);

    List<Cost> selectCostByUid(int uid);

    Cost selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);



}

