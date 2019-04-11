package com.caicai.gouwu.service.Impl;

import com.caicai.gouwu.mapper.UserMapper;
import com.caicai.gouwu.pojo.User;
import com.caicai.gouwu.service.iUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements iUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        User user = userMapper.getUserByName(username);
        System.out.println("getUserByName service");
        return user;
    }

    @Override
    public List<User> getUserAll() {
        List<User> userList = userMapper.getUserAll();
        return userList;
    }

    @Override
    public String getUsernameById() {
        String username = userMapper.getUsernameById();
        return username;
    }
}
