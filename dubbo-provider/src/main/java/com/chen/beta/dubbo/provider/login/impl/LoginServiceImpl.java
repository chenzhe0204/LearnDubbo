package com.chen.beta.dubbo.provider.login.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;



@Service(version = "1.0")
public class LoginServiceImpl {

    @Value("name")
    private String name;

    public String login() {
        return name;
    }
}
