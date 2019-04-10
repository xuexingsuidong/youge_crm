package com.youge.ssm.service;

import com.youge.ssm.mapper.ActorsDao;
import com.youge.ssm.pojo.Actors;
import com.youge.ssm.pojo.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class ActorsServiceImpl implements ActorsService {
    @Autowired
    private ActorsDao actorsDao;

    @Autowired
    private RolesService rolesService;
    /*注入Bcrypt加密算法工具类对象*/
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //从数据库查询数据,返回(根据用户名查询用户记录)
        User user = null;
        try {
            Actors actors1 = actorsDao.selectByUserAccount(username);
            Integer id = actors1.getId();
            //根据id查询用户的角色的list集合加进去
            List<Roles> rolesList = rolesService.queryRoleListByActorsId(id);

            List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
            if (rolesList != null && rolesList.size()>0) {
                for (Roles roles : rolesList) {
                    System.out.println(roles.getRoleName());
                    grantedAuthorityList.add(new SimpleGrantedAuthority(roles.getRoleName()));
                }
            }
            user = new User(username, actors1.getPassword(), grantedAuthorityList);
        }catch (Exception e){
                e.printStackTrace();
        }
        return user;
    }

    //保存用户
    @Override
    public void addActors(Actors actors) {
        // 把password进行加密处理（使用加密工具类）
        // encode方法进行具体的加密动作
        String encodePassword = bCryptPasswordEncoder.encode(actors.getPassword());
        actors.setPassword(encodePassword);
        actorsDao.insert(actors);
    }
}
