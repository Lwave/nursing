package com.ssm.service;

import com.ssm.entity.Information;
import com.ssm.entity.InformationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InformationService {


    List<Information> selectByExample(InformationExample example);

    Information selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    int insertSelective(Information record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Information record);

    int updateByPrimaryKeyWithBLOBs(Information record);





}
