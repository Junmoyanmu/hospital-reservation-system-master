package com.hms.application.service;

import com.hms.application.entity.Department;
import com.hms.application.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 科室业务功能实现类
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;


    @Override
    public Department findOneByDepartmentNumber(String departmentNumber) {
        return departmentRepository.findOneByDepartmentNumber(departmentNumber);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department saveAndFlush(Department department) {
        return departmentRepository.saveAndFlush(department);
    }
}
