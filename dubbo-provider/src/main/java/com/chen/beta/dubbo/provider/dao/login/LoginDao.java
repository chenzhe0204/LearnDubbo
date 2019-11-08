package com.chen.beta.dubbo.provider.dao.login;

import com.chen.beta.dubbo.api.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface LoginDao {
    public List<Users> getUsers();
}
