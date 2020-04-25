package com.ssm.dao;

import com.ssm.entity.Class;
import com.ssm.entity.ClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {
    long countByExample(ClassExample example);

    int deleteByExample(ClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Class record);

    int insertSelective(Class record);

    List<Class> selectByExample(ClassExample example);

    Class selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);

    List<Class> getEmployeeService();

    String getEmployeeUsername(int id);

    String getEmployeeRespUsername(int id);

    Class getEmployeeEdit(int id);

    int getUresp(int uresp);

    String getEmployeeUsername1(int id);

    int getClass1(int id);

    String getEmployeeUsername2(int id);

    Class getEmployeeSingle(int id);
}