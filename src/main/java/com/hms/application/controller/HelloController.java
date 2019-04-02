package com.hms.application.controller;

import com.hms.application.entity.InfoUser;
import com.hms.application.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description ToDo
 * @Author Ly
 * @Date 2019/3/26 23:16
 * 页面控制器
 **/

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello world!!!";
    }

    @RequestMapping("hello2")
    public String hello2() {
        List<InfoUser> list = helloService.findByUserWechat("lyg0506f");
        return "index";
    }

}

