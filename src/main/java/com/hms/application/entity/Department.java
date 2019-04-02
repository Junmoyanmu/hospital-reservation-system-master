package com.hms.application.entity;

import javax.persistence.*;

/**
 * 科室实体类
 */

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;                                 // 科室ID，主键，自增

    @Column(length = 32)
    private String departmentNumber;                              // 科室编号

    @Column
    private String departmentName;                                // 科室名称

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
