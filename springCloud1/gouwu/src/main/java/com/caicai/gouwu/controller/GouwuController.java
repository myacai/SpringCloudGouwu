package com.caicai.gouwu.controller;


import com.caicai.gouwu.pojo.Product;
import com.caicai.gouwu.pojo.Resource;
import com.caicai.gouwu.service.iGouwuListService;
import com.caicai.gouwu.service.iProductService;
import com.caicai.gouwu.service.iResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

@Controller
@RefreshScope
public class GouwuController {

    @Autowired
    private iProductService productService;

    @Autowired
    private iResourceService resourceService;

    @RequestMapping(value = "/hi")
    public String hi(ModelAndView modelAndView){
        return "gouwu hi";
    }

    @RequestMapping(value = "/gouwu")
    public String gouwu(Model model){
        //List<FirstAppGouwulist> firstAppGouwulists =  gouwuListService.getAllGouwuList();
        //modelAndView.addObject("list", firstAppGouwulists);
        //model.addAttribute("list", firstAppGouwulists);

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
        return "index";

    }

    @RequestMapping(value = "login")
    public String login(Model model, HttpServletRequest request,HttpServletResponse response){
        String path=request.getContextPath();
        //String basePath=request.getScheme()+"://"+request.getServerName()+":"
        //        +request.getServerPort()+path+"/static/";
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        System.out.println(basePath);
        model.addAttribute("basePath", basePath);
        String refUrl = request.getHeader("Referer");
        System.out.println(refUrl);
        model.addAttribute("refUrl", refUrl);



        return "loginFrom";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String productDatail(Model model,HttpServletRequest request,HttpServletResponse response){
        String productName = request.getParameter("productName");
        Product product = productService.getProductByName(productName);

        System.out.println(product.toString());
        model.addAttribute("product",product);

        List<Resource> resources = resourceService.getResourceByIndexProductId(product.getId());
        model.addAttribute("resources",resources);

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
        return "preview";
    }


}
