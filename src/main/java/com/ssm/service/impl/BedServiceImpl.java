package com.ssm.service.impl;

import com.ssm.dao.BedMapper;
import com.ssm.entity.Bed;
import com.ssm.entity.BedExample;
import com.ssm.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService {

    @Autowired
    private BedMapper bedMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bedMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Bed> selectAllBed() {
        return bedMapper.selectAllBed();
    }

    @Override
    public long countByExample(BedExample example) {
        return bedMapper.countByExample(example);
    }

    @Override
    public int updateBedStatus(Bed bed) {
        return bedMapper.updateByPrimaryKeySelective(bed);
    }


    @Override
    public int selectBedCount() {
        return bedMapper.selectBedCount();
    }

    @Override
    public List<Bed> selectBedNoUser() {
        return bedMapper.selectBedNoUser();
    }

    @Override
    public List<Bed> selectByExample(BedExample example) {
        return bedMapper.selectByExample(example);
    }

    @Override
    public List<Bed> selectSigleBed() {
        return bedMapper.selectSigleBed();
    }


    @Override
    public int insert(Bed record) {
        return bedMapper.insertSelective(record);
    }

    @Override
    public Bed selectByPrimaryKey(Integer id) {
        return bedMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Bed record) {
        return bedMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Bed record) {
        return bedMapper.insertSelective(record);
    }

}
