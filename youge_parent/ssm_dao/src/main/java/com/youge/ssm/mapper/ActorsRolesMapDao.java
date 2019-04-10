package com.youge.ssm.mapper;

import com.youge.ssm.pojo.ActorsRolesMap;
import com.youge.ssm.pojo.ActorsRolesMapQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActorsRolesMapDao {
    int countByExample(ActorsRolesMapQuery example);

    int deleteByExample(ActorsRolesMapQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActorsRolesMap record);

    int insertSelective(ActorsRolesMap record);

    List<ActorsRolesMap> selectByExample(ActorsRolesMapQuery example);

    ActorsRolesMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActorsRolesMap record, @Param("example") ActorsRolesMapQuery example);

    int updateByExample(@Param("record") ActorsRolesMap record, @Param("example") ActorsRolesMapQuery example);

    int updateByPrimaryKeySelective(ActorsRolesMap record);

    int updateByPrimaryKey(ActorsRolesMap record);
}