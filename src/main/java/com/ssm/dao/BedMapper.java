package com.ssm.dao;

import com.ssm.entity.Bed;
import com.ssm.entity.BedExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BedMapper {
    long countByExample(BedExample example);

    int deleteByExample(BedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bed record);

    int insertSelective(Bed record);

    List<Bed> selectByExample(BedExample example);

    Bed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bed record, @Param("example") BedExample example);

    int updateByExample(@Param("record") Bed record, @Param("example") BedExample example);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);

    /*查询所有床信息三表关联*/
    List<Bed> selectAllBed();

    /*
    查询楼和床 两表查询
    * */
    List<Bed> selectBedNoUser();

    /*查询总数*/
    int selectBedCount();

    /*
     * 查询床表
     * */
    List<Bed> selectSigleBed();

    /*
     * 更新床的状态
     * */
    int updateBedStatus(Bed bed);

}