package com.caicai.serverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SuppressWarnings("unchecked")
@Service
public class MemberService {
    @Autowired
    RestTemplate restTemplate;

    public List<String>  getOrderByUserList() {
        return restTemplate.getForObject("http://server-member/getUserList", List.class);
        //return restTemplate.getForObject("http://server-member/hi?name="+name, String.class);
    }

    public String hiService(String name) {
        //return restTemplate.getForObject("http://server-member/getUserList", List.class);
        return restTemplate.getForObject("http://server-member/hi?name="+name, String.class);
    }
}