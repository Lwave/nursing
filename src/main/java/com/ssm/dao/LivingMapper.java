package com.ssm.dao;

import com.ssm.entity.Living;
import com.ssm.entity.LivingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LivingMapper {
    long countByExample(LivingExample example);

    int deleteByExample(LivingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Living record);

    int insertSelective(Living record);

    List<Living> selectByExample(LivingExample example);

    Living selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Living record, @Param("example") LivingExample example);

    int updateByExample(@Param("record") Living record, @Param("example") LivingExample example);

    int updateByPrimaryKeySelective(Living record);

    int updateByPrimaryKey(Living record);
}