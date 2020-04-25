package com.ssm.service;

import com.ssm.entity.BodyInfo;
import com.ssm.entity.BodyInfoExample;
import com.ssm.entity.UserAndBodyinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BodyinfoService {

    List<BodyInfo> findAll(BodyInfoExample bodyinfoExample);

    int updateInfoById(BodyInfo bodyInfo);

    int insertInfo(BodyInfo bodyInfo);

    List<UserAndBodyinfo> findAll();

    UserAndBodyinfo findAllById(int id);

    int delBodyinfoById(int id);
}
