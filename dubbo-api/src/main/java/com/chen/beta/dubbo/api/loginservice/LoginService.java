package com.chen.beta.dubbo.api.loginservice;

import com.chen.beta.dubbo.api.entity.Users;

import java.util.List;

public interface LoginService {
    public List<Users> login();
}
