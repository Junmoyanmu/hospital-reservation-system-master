package com.hms.application.service;

import com.hms.application.entity.Admin;
import com.hms.application.repository.AdminRepository;
import com.hms.application.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员业务功能实现类
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;

//    根据管理员账号查找管理员
    @Override
    public List<Admin> findByAdminAccount(String adminAccount) {
        return adminRepository.findByAdminAccount(adminAccount);
    }
}
