package com.gateway.loginservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LoginController {

    /*
    测试
     */
    @GetMapping("login")
    public String login(String name,String pwd){
        System.out.println(name+pwd);
        String token = UUID.randomUUID().toString();
        return token;

    }
}
