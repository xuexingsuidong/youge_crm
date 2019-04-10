package com.youge.ssm.mapper;

import com.youge.ssm.pojo.RolesMap;
import com.youge.ssm.pojo.RolesMapQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolesMapDao {
    int countByExample(RolesMapQuery example);

    int deleteByExample(RolesMapQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolesMap record);

    int insertSelective(RolesMap record);

    List<RolesMap> selectByExample(RolesMapQuery example);

    RolesMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolesMap record, @Param("example") RolesMapQuery example);

    int updateByExample(@Param("record") RolesMap record, @Param("example") RolesMapQuery example);

    int updateByPrimaryKeySelective(RolesMap record);

    int updateByPrimaryKey(RolesMap record);
}