package com.ssm.dao;

import com.ssm.entity.Month;
import com.ssm.entity.Salary;
import com.ssm.entity.SalaryExample;
import com.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalaryMapper {
    long countByExample(SalaryExample example);

    int deleteByExample(SalaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> selectByExample(SalaryExample example);

    Salary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    Salary getUserMonthSingle(@Param("uid") int uid, @Param("mid") int mid);

    User getUser(int id);

    Month getMonth(int id);

    List<Salary> getAllSalary();
}