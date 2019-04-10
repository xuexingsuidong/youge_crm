package com.youge.ssm.mapper;

import com.youge.ssm.pojo.Area;
import com.youge.ssm.pojo.AreaQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaDao {
    int countByExample(AreaQuery example);

    int deleteByExample(AreaQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaQuery example);

    Area selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaQuery example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaQuery example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}