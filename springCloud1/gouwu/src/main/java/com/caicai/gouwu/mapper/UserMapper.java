package com.caicai.gouwu.mapper;

import com.caicai.gouwu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "userMapper")
public interface UserMapper {
    User getUserByName(@Param("username")String username);
    List<User> getUserAll();
    String getUsernameById();
}
