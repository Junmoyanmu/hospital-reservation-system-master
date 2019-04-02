package com.hms.application.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 分诊所管理实体类
 */
@Entity
@Table(name = "clinic")
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clinicId;                                 // 主键，分诊所Id，自增

    @Column(length = 32)
    private String clinicNumber;                              // 分诊所编号

    @Column(length = 64)
    private String docClinic;                                 // 分诊所名称

    private String clinicAddress;                             // 分诊所地址

    private Date clinicTime;                                  // 分诊所创建时间

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public void setDocClinic(String docClinic) {
        this.docClinic = docClinic;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public void setClinicTime(Date clinicTime) {
        this.clinicTime = clinicTime;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public String getDocClinic() {
        return docClinic;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public Date getClinicTime() {
        return clinicTime;
    }
}
