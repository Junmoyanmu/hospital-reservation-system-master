package com.hms.application.service;

import com.hms.application.entity.Clinic;
import com.hms.application.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分诊所业务功能实现类
 */

@Service
public class ClinicServiceImpl implements ClinicService{
    @Autowired
    ClinicRepository clinicRepository;

    @Override
    public List<Clinic> findAll() {
        return clinicRepository.findAll();
    }

    @Override
    public Clinic findOneByClinicNumber(String clinicNumber) {
        return clinicRepository.findOneByClinicNumber(clinicNumber);
    }

    @Override
    public Clinic saveAndFlush(Clinic clinic) {
        return clinicRepository.saveAndFlush(clinic);
    }
}
