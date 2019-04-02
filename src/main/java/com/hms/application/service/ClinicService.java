package com.hms.application.service;

import com.hms.application.entity.Clinic;

import java.util.List;

/**
 * 分诊所业务功能接口
 */
public interface ClinicService {

    List<Clinic> findAll();

//    根据诊所名称查找
    Clinic findOneByClinicNumber(String clinicNumber);

//    插入一条数据
    Clinic saveAndFlush(Clinic clinic);
}
