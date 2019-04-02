package com.hms.application.controller;

import com.hms.application.entity.Admin;
import com.hms.application.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 管理员控制器
 */

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = {"/admin", "/admin/login", "/admin/login.html"})
    public String login() {
        return "admin/login";
    }

//    登录校验
    @PostMapping(value = "/admin/submit")
//    方法执行前，获取请求参数，然后查找数据库，检验数据
    public String loginRequest(@RequestParam("adminAccount") String adminAccount,
                               @RequestParam("adminPassword") String adminPassword,
                               Map<String, Object> map) {
        List<Admin> adminList = adminService.findByAdminAccount(adminAccount);
        if (!adminList.isEmpty()) {
            Admin admin = adminList.get(0);
            if (adminPassword.equals(admin.getAdminPassword())) {
                map.put("admin", adminAccount);
                return "admin/main";
            }
//            密码错误
            else {
                map.put("msg", "密码错误");
                return "admin/login";
            }
        }
//        账户不存在
        else {
            map.put("msg", "账户不存在");
            return "admin/login";
        }
    }

    @RequestMapping(value = "/admin/main.html")
    public String main() {
        return "admin/main";
    }
}
