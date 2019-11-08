package com.chen.beta.dubbo.provider.loginservice.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.chen.beta.dubbo.api.entity.Users;
import com.chen.beta.dubbo.api.loginservice.LoginService;
import com.chen.beta.dubbo.provider.dao.login.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public List<Users> login() {
        List<Users> users = loginDao.getUsers();
        return users;
    }
}
