package com.feng.ssm.controller;


import com.feng.ssm.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by feng on 2017/2/23.
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String getUser(){
        return "index";
    }
    @Resource(name = "userServiceImpl")
    private UserServiceImpl userService;
    @RequestMapping("/name")
    public String getName(){
        return userService.getName();
    }
}
