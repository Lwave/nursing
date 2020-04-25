package com.ssm.service;

import com.ssm.entity.Bed;
import com.ssm.entity.BedExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BedService {

    /*
     * 通过id删除
     * */

    int deleteByPrimaryKey(Integer id);
    /*
     * 查询所有床信息
     * */

    List<Bed> selectAllBed();

    /*
     *
     * 查询条数
     * */
    long countByExample(BedExample example);


    int updateBedStatus(Bed bed);

    int selectBedCount();

    List<Bed> selectBedNoUser();

    List<Bed> selectByExample(BedExample example);

    List<Bed> selectSigleBed();

    /*
     *添加床数据
     * */
    int insert(Bed record);

    /*根据id查询床信息*/
    Bed selectByPrimaryKey(Integer id);

    /*根据id进行更新*/
    int updateByPrimaryKeySelective(Bed record);

    int insertSelective(Bed record);


}
