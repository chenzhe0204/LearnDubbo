package com.chen.beta.dubbo.consumer.login;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component("login")
@RestController("/hello")
public class Login {
    @Reference
    private Log

    @RequestMapping("hello")
    public String Hello(){
        String name = this.login.login();
        return "hello"+name;
    }
}
