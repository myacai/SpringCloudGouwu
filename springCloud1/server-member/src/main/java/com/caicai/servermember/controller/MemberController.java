package com.caicai.servermember.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RefreshScope
public class MemberController {
    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/getUserList" ,method = RequestMethod.GET)
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        System.out.println("getUserList用户服务");

        return listUser;

    }

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        //return foo;
        return "hi "+name+",i am from port:" +port;
    }


}