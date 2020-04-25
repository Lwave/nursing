package com.ssm.service.impl;

import com.ssm.dao.MonthMapper;
import com.ssm.dao.SalaryMapper;
import com.ssm.entity.Month;
import com.ssm.entity.MonthExample;
import com.ssm.entity.Salary;
import com.ssm.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    SalaryMapper salaryMapper;

    @Autowired
    MonthMapper monthMapper;


    @Override
    public Salary getUserMonthSingle(int uid, int mid) {
        return salaryMapper.getUserMonthSingle(uid,mid);
    }

    @Override
    public List<Month> selectByExample(MonthExample example) {
        return monthMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(Salary record) {
        return salaryMapper.insertSelective(record);
    }

    @Override
    public List<Salary> getAllSalary() {
        return salaryMapper.getAllSalary();
    }

    @Override
    public Salary selectByPrimaryKey(Integer id) {
        return salaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Salary record) {
        return salaryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }


}
