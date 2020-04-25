package com.ssm.service;

import com.ssm.entity.Class;

import java.util.List;

public interface ClassService{

    List<Class> getEmployeeService();

    int insertSelective(Class record);

    Class getEmployeeEdit(int id);

    Class selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Class record);

    int getClass(int id);

    Class getEmployeeSingle(int id);

    int deleteByPrimaryKey(Integer id);



}
