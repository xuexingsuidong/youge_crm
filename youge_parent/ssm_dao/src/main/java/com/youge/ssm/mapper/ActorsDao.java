package com.youge.ssm.mapper;

import com.youge.ssm.pojo.Actors;
import com.youge.ssm.pojo.ActorsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActorsDao {
    int countByExample(ActorsQuery example);

    int deleteByExample(ActorsQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Actors record);

    int insertSelective(Actors record);

    List<Actors> selectByExample(ActorsQuery example);

    Actors selectByPrimaryKey(Integer id);

    Actors selectByUserAccount(String username);

    int updateByExampleSelective(@Param("record") Actors record, @Param("example") ActorsQuery example);

    int updateByExample(@Param("record") Actors record, @Param("example") ActorsQuery example);

    int updateByPrimaryKeySelective(Actors record);

    int updateByPrimaryKey(Actors record);
}