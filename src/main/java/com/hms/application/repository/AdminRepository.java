package com.hms.application.repository;

import com.hms.application.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA数据库交互接口，具体用法参照spring data JPA官方文档
 */

//JpaRepository类实现数据访问，模板第一个参数表示对应的实体类，第二个参数表示主键
public interface AdminRepository extends JpaRepository<Admin, String> {

    // 根据管理员账号查找管理员
    List<Admin> findByAdminAccount(String adminAccount);
}
