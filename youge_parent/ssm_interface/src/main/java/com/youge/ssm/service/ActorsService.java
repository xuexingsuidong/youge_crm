package com.youge.ssm.service;

import com.youge.ssm.pojo.Actors;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ActorsService extends UserDetailsService {

    void addActors(Actors actors);
}
