package com.hms.application.repository;

import com.hms.application.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA数据库交互接口
 */
public interface ClinicRepository extends JpaRepository<Clinic, Integer> {

    List<Clinic> findAll();

//    根据诊所名称查找
    Clinic findOneByClinicNumber(String clinicNumber);

//    插入一条数据
    Clinic saveAndFlush(Clinic clinic);
}
