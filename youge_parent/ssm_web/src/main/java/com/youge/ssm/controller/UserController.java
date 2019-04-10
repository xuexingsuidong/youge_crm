package com.youge.ssm.controller;

import com.youge.ssm.pojo.Actors;
import com.youge.ssm.service.ActorsService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ActorsService actorsService;

    @RequestMapping("/name")
    public String name(){
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            System.out.println(authority.getAuthority());
        }
        return null;
    }
    //添加用户
    @RequestMapping("/addActors")
    public Result addActors(){
        try {
            Actors actors = new Actors();
            actors.setUserAccount("admin");
            actors.setPassword("123456");
            actorsService.addActors(actors);
            return new Result(true, "添加成功");
        }catch (Exception e){
            return new Result(false, "添加失败");
        }
    }
}
