package com.youge.ssm.mapper;

import com.youge.ssm.pojo.MenusElements;
import com.youge.ssm.pojo.MenusElementsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenusElementsDao {
    int countByExample(MenusElementsQuery example);

    int deleteByExample(MenusElementsQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenusElements record);

    int insertSelective(MenusElements record);

    List<MenusElements> selectByExample(MenusElementsQuery example);

    MenusElements selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MenusElements record, @Param("example") MenusElementsQuery example);

    int updateByExample(@Param("record") MenusElements record, @Param("example") MenusElementsQuery example);

    int updateByPrimaryKeySelective(MenusElements record);

    int updateByPrimaryKey(MenusElements record);
}