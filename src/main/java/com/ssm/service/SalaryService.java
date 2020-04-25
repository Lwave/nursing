package com.ssm.service;

import com.ssm.entity.Month;
import com.ssm.entity.MonthExample;
import com.ssm.entity.Salary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SalaryService {

    Salary getUserMonthSingle(int uid, int mid);

    List<Month> selectByExample(MonthExample example);

    int insertSelective(Salary record);

    List<Salary> getAllSalary();

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Salary record);

    int deleteByPrimaryKey(Integer id);





}
