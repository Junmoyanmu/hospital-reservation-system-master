package com.hms.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description ToDo
 * @Author Ly
 * @Date 2019/3/26 19:30
 * 普通用户信息实体类
 **/

@Entity
@Table(name = "info_user")
public class InfoUser {
    @Id
    private String userId;      //用户表主键

    private String userName;    //用户姓名

    private String userWechat;  //用户关联微信

    private String userPhone;   //用户电话号码

    private String userSex;     //性别

    private String userType;    //用户类型

    private String creationTime;//创建日期

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
