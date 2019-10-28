package com.chen.beta.dubbo.consumer.logincontroller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.chen.beta.dubbo.api.loginservice.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Reference
    private LoginService loginService;

    @RequestMapping("/hello")
    public String Hello(){
        String name = this.loginService.login();
        return "hello"+name;
    }
}
