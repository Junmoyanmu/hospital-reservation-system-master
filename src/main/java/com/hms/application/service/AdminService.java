package com.hms.application.service;

import com.hms.application.entity.Admin;

import java.util.List;

/**
 * 管理员业务功能接口
 */
public interface AdminService {

//    根据管理员账号查找管理员
    List<Admin> findByAdminAccount(String adminAccount);
}
