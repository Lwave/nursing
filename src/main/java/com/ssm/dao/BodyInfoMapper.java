package com.ssm.dao;

import com.ssm.entity.BodyInfo;
import com.ssm.entity.BodyInfoExample;
import com.ssm.entity.UserAndBodyinfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BodyInfoMapper {

    @Select("select b.*,a.userName,a.gender,a.age,a.phone,a.role from user a,bodyinfo b where a.id = b.uid")
    List<UserAndBodyinfo> findAll();

    @Select("select b.*,a.userName,a.gender,a.age,a.phone,a.role from user a,bodyinfo b where a.id = b.uid and b.id=#{id}")
    UserAndBodyinfo findAllById(@Param("id") int id);

    long countByExample(BodyInfoExample example);

    int deleteByExample(BodyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BodyInfo record);

    int insertSelective(BodyInfo record);

    List<BodyInfo> selectByExample(BodyInfoExample example);

    BodyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BodyInfo record, @Param("example") BodyInfoExample example);

    int updateByExample(@Param("record") BodyInfo record, @Param("example") BodyInfoExample example);

    int updateByPrimaryKeySelective(BodyInfo record);

    int updateByPrimaryKey(BodyInfo record);
}