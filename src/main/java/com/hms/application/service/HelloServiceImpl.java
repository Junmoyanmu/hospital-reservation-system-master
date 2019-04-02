package com.hms.application.service;

import com.hms.application.entity.InfoUser;
import com.hms.application.repository.HelloRepository;
import com.hms.application.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description ToDo
 * @Author Ly
 * @Date 2019/3/27 12:08
 * 业务功能实现类
 **/

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    HelloRepository helloRepository;

    @Override
    public List<InfoUser> findByUserWechat(String userWechat) {
        return helloRepository.findByUserWechat(userWechat);
    }
}
