package com.caicai.gouwu.controller;

import com.alibaba.fastjson.JSONObject;
import com.caicai.gouwu.pojo.Resource;
import com.caicai.gouwu.pojo.User;
import com.caicai.gouwu.service.iGouwuListService;
import com.caicai.gouwu.service.iResourceService;
import com.caicai.gouwu.service.iUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JsonController {

    @Autowired
    private iUserService userService;

    @Autowired
    private iResourceService resourceService;

    /*
    @RequestMapping(value = "/products")
    public List<FirstAppGouwulist> getProducts(){
        List<FirstAppGouwulist> firstAppGouwulists =  gouwuListService.getAllGouwuList();

        return firstAppGouwulists;
    }
    */

    @RequestMapping(value = "/userAll")
    public List<User> getUsers(){
        List<User> userList = userService.getUserAll();
        return userList;
    }

    @RequestMapping(value = "/text")
    public String getUsername(){
        //String username = userService.getUsernameById();
        User user = userService.getUserByName("一号");
        String pass = user.getPassword();
        return pass;
    }

    @RequestMapping(value = "loginVerify", method = RequestMethod.POST)
    public String loginVerify(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("loginVerify");
        Map<String, Object> map = new HashMap<String, Object>();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String referUrl = request.getParameter("referUrl");
        System.out.println(username);
        System.out.println(password);
        User user = userService.getUserByName(username);
        System.out.println(user.getPassword());
        if(user == null){
            map.put("code",0);
            map.put("msg","用户名无效！");

        }else if(!user.getPassword().equals(password)){
            map.put("code",0);
            map.put("msg","密码错误！");
            //map.put("referUrl",referUrl);
        }else {
            //登录成功
            map.put("code",1);
            map.put("msg","");
            //map.put("referUrl",referUrl);
            //添加session
            request.getSession().setAttribute("user", user);
            request.getSession().setAttribute("username", username);
            //添加cookie
            Cookie nameCookie = new Cookie("username", username);
            //设置Cookie的有效期为3天
            nameCookie.setMaxAge(60 * 60 * 24 * 3);
            Cookie pwdCookie = new Cookie("password", password);
            pwdCookie.setMaxAge(60 * 60 * 24 * 3);
            response.addCookie(nameCookie);
            response.addCookie(pwdCookie);
            //System.out.println(referUrl);
            //response.sendRedirect(referUrl);
        }
        String result = new JSONObject(map).toString();
        return result;
    }


    @RequestMapping(value = "/download")
    public String downloadFile(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        String indexStr = request.getParameter("index");
        Integer index = Integer.valueOf(indexStr);
        String productIdStr = request.getParameter("productId");
        Integer productId = Integer.valueOf(productIdStr);
        Resource resource = resourceService.getResourceDownByIndexProductId(index,productId);
        System.out.println(resource.toString());
        String fileName = resource.getFileName();
        if( fileName != null && !fileName.equals("")){
            String realPath = "E:\\JavaText\\springCloud1\\gouwu\\src\\main\\resources\\static\\download\\" + resource.getProductId();
            File file = new File(realPath , fileName);
            if (file.exists()){
                //System.out.println("文件存在！");
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName="
                        + URLEncoder.encode(fileName,"UTF-8"));// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("success");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
        return null;
    }

}
