package com.hms.application.repository;

import com.hms.application.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA接口
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findOneByDepartmentNumber(String departmentNumber);

    List<Department> findAll();

//    插入一条记录
    Department saveAndFlush(Department department);
}
