package com.chen.beta.dubbo.consumer.logincontroller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.chen.beta.dubbo.api.entity.Users;
import com.chen.beta.dubbo.api.loginservice.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class LoginController {

    @Reference
    private LoginService loginService;

    @RequestMapping("/hello")
    public String Hello(Model model){
        List<Users> users = loginService.login();
        model.addAttribute("users",users);
        return "login";
    }
}
