package com.youge.ssm.service;

import com.youge.ssm.pojo.Roles;

import java.util.List;

public interface RolesService {

    List<Roles> queryRoleListByActorsId(Integer id) throws Exception;
}
