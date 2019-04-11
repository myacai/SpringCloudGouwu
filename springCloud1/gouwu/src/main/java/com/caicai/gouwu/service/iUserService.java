package com.caicai.gouwu.service;

import com.caicai.gouwu.pojo.User;

import java.util.List;

public interface iUserService {
    User getUserByName(String username);
    List<User> getUserAll();
    String getUsernameById();
}
