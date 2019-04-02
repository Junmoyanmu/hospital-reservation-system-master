package com.hms.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description ToDo
 * @Author Ly
 * @Date 2019/3/26 22:05
 * 医生信息实体类
 **/

@Entity
@Table(name = "info_doc")
public class infoDoc {
    @Id
    private String pkDoc;       //医生编号

    private String docName;     //医生姓名

    private String docID;       //医生身份证号

    private String docPhone;    //医生电话号码

    @Column(length = 64)
    private String docUrl;      //医生照片地址

    private String docEmail;    //医生邮箱

    private String docDegree;   //医生最高学位

    private String docType;     //医生科室

    @Column(length = 64)
    private String docClinic;   //医生所属分诊所

    private String docSubject;  //医生门诊科目

    private String docMoney;    //医生预约费用

    private String creationTime;//创建日期

    private String dm;           //删除标记

    public String getPkDoc() {
        return pkDoc;
    }

    public void setPkDoc(String pkDoc) {
        this.pkDoc = pkDoc;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getDocPhone() {
        return docPhone;
    }

    public void setDocPhone(String docPhone) {
        this.docPhone = docPhone;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getDocEmail() {
        return docEmail;
    }

    public void setDocEmail(String docEmail) {
        this.docEmail = docEmail;
    }

    public String getDocDegree() {
        return docDegree;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocClinic() {
        return docClinic;
    }

    public void setDocClinic(String docClinic) {
        this.docClinic = docClinic;
    }

    public String getDocSubject() {
        return docSubject;
    }

    public void setDocSubject(String docSubject) {
        this.docSubject = docSubject;
    }

    public String getDocMoney() {
        return docMoney;
    }

    public void setDocMoney(String docMoney) {
        this.docMoney = docMoney;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }
}
