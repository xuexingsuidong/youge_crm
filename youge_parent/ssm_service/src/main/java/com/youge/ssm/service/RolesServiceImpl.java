package com.youge.ssm.service;

import com.youge.ssm.mapper.ActorsRolesMapDao;
import com.youge.ssm.mapper.RolesDao;
import com.youge.ssm.pojo.ActorsRolesMap;
import com.youge.ssm.pojo.ActorsRolesMapQuery;
import com.youge.ssm.pojo.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesDao rolesDao;
    @Autowired
    private ActorsRolesMapDao actorsRolesMapDao;

    //根据Actors的id查询用户的角色
    @Override
    public List<Roles> queryRoleListByActorsId(Integer id) throws Exception {
        //根据ActorsID查询用户角色关联表
        ActorsRolesMapQuery actorsRolesMapQuery = new ActorsRolesMapQuery();
        ActorsRolesMapQuery.Criteria criteria = actorsRolesMapQuery.createCriteria();
        criteria.andActorIdEqualTo(id);
        List<ActorsRolesMap> actorsRolesMapList = actorsRolesMapDao.selectByExample(actorsRolesMapQuery);

        ArrayList<Integer> ids = new ArrayList<>();
        for (ActorsRolesMap actorsRolesMap : actorsRolesMapList) {
            ids.add(actorsRolesMap.getId());
        }
        //根据rolesId查询角色信息
        List<Roles> rolesList = rolesDao.selectByPrimaryKeys(ids);
        return rolesList;
    }
}
