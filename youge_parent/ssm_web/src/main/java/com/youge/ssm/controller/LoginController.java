package com.youge.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    //登录跳转
    @RequestMapping("/login")
    public String login(Model model)
    {
        System.err.println(1234);
       //model.addAttribute("username","xudehang");
       return "redirect:admin/index.jsp";
//        return "login";
    }

}
