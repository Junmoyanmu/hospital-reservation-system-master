package com.hms.application.service;

import com.hms.application.entity.InfoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 页面业务功能接口
 */
public interface HelloService {

    List<InfoUser> findByUserWechat(String userWechat);


}
