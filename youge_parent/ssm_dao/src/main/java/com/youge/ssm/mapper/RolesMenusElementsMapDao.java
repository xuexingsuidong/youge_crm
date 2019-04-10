package com.youge.ssm.mapper;

import com.youge.ssm.pojo.RolesMenusElementsMap;
import com.youge.ssm.pojo.RolesMenusElementsMapQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolesMenusElementsMapDao {
    int countByExample(RolesMenusElementsMapQuery example);

    int deleteByExample(RolesMenusElementsMapQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolesMenusElementsMap record);

    int insertSelective(RolesMenusElementsMap record);

    List<RolesMenusElementsMap> selectByExample(RolesMenusElementsMapQuery example);

    RolesMenusElementsMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolesMenusElementsMap record, @Param("example") RolesMenusElementsMapQuery example);

    int updateByExample(@Param("record") RolesMenusElementsMap record, @Param("example") RolesMenusElementsMapQuery example);

    int updateByPrimaryKeySelective(RolesMenusElementsMap record);

    int updateByPrimaryKey(RolesMenusElementsMap record);
}