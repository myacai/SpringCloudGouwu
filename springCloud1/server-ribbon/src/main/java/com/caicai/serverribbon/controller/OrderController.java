package com.caicai.serverribbon.controller;

import com.caicai.serverribbon.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/getOrderUserAll" ,method = RequestMethod.GET)
    public List<String> getOrderByUserList() {
        System.out.println("订单服务开始调用用户服务");
        return memberService.getOrderByUserList();
    }

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return memberService.hiService(name);
    }
}
