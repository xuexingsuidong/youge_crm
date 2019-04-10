package com.youge.ssm.mapper;

import com.youge.ssm.pojo.DataAccess;
import com.youge.ssm.pojo.DataAccessQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataAccessDao {
    int countByExample(DataAccessQuery example);

    int deleteByExample(DataAccessQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataAccess record);

    int insertSelective(DataAccess record);

    List<DataAccess> selectByExample(DataAccessQuery example);

    DataAccess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataAccess record, @Param("example") DataAccessQuery example);

    int updateByExample(@Param("record") DataAccess record, @Param("example") DataAccessQuery example);

    int updateByPrimaryKeySelective(DataAccess record);

    int updateByPrimaryKey(DataAccess record);
}