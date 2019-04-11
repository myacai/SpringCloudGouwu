package com.caicai.web.controller;

import com.caicai.web.pojo.User;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RefreshScope
public class WebController {
    //final String webPort = "10.218.220.180:7888";


    @RequestMapping(value = "/")
    public String hi(Model model, HttpServletRequest request, HttpServletResponse response){
        //model.addAttribute("webPort",webPort);
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String hostAddress = address.getHostAddress();
        System.out.println("ip地址"+hostAddress);
        String webPort = "http://"+hostAddress;
        model.addAttribute("webPort",webPort);
        model.addAttribute("username","xxx");


        try{
            //User user = (User) request.getSession().getAttribute("user");
            String username = (String) request.getSession().getAttribute("username");
            model.addAttribute("username",username);
        } catch (Exception ee){
            System.out.println("user 为空!");
            model.addAttribute("username","xxx");
        }
        return "index";
    }
}
