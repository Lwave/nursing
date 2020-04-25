package com.ssm.service.impl;

import com.ssm.dao.ClassMapper;
import com.ssm.entity.Class;
import com.ssm.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassMapper classMapper;

    @Override
    public List<Class> getEmployeeService() {
        return classMapper.getEmployeeService();
    }

    @Override
    public int insertSelective(Class record) {
        return classMapper.insertSelective(record);
    }

    @Override
    public Class getEmployeeEdit(int id) {
        return classMapper.getEmployeeEdit(id);
    }

    @Override
    public Class selectByPrimaryKey(Integer id) {
        return classMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Class record) {
        return classMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int getClass(int id) {
        return classMapper.getClass1(id);
    }

    @Override
    public Class getEmployeeSingle(int id) {
        return classMapper.getEmployeeSingle(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return classMapper.deleteByPrimaryKey(id);
    }


}
