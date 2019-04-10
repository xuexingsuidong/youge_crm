package com.youge.ssm.mapper;

import com.youge.ssm.pojo.Roles;
import com.youge.ssm.pojo.RolesQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolesDao {
    int countByExample(RolesQuery example);

    int deleteByExample(RolesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExample(RolesQuery example);

    List<Roles> selectByPrimaryKeys(List<Integer> ids);

    Roles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesQuery example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesQuery example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}