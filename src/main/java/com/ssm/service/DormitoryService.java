package com.ssm.service;

import com.ssm.entity.Dormitory;
import com.ssm.entity.DormitoryExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DormitoryService {
    List<Dormitory> selectByExample(DormitoryExample example);

    Dormitory selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Dormitory record);


}
