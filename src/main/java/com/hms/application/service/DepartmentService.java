package com.hms.application.service;

import com.hms.application.entity.Department;

import java.util.List;

/**
 * 科室业务功能接口
 */
public interface DepartmentService {
    Department findOneByDepartmentNumber(String departmentNumber);

    List<Department> findAll();
//    插入一条记录
    Department saveAndFlush(Department department);
}
