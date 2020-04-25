package com.ssm.dao;

import com.ssm.entity.Month;
import com.ssm.entity.MonthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MonthMapper {
    long countByExample(MonthExample example);

    int deleteByExample(MonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Month record);

    int insertSelective(Month record);

    List<Month> selectByExample(MonthExample example);

    Month selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Month record, @Param("example") MonthExample example);

    int updateByExample(@Param("record") Month record, @Param("example") MonthExample example);

    int updateByPrimaryKeySelective(Month record);

    int updateByPrimaryKey(Month record);
}