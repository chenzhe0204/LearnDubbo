package com.chen.beta.dubbo.provider.loginservice.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.chen.beta.dubbo.api.loginservice.LoginService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Service
public class LoginServiceImpl implements LoginService {

    @Value("${name}")
    private String userName;

    @Override
    public String login() {
        return userName;
    }
}
