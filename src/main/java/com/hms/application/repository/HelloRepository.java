package com.hms.application.repository;

import com.hms.application.entity.InfoUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA数据库交互接口，具体用法参照spring data JPA官方文档
 */
public interface HelloRepository extends JpaRepository<InfoUser,String> {

    List<InfoUser>findByUserWechat(String userWechat);
}
