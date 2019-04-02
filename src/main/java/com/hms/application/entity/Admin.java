package com.hms.application.entity;



import javax.persistence.*;

/**
 * 管理员信息实体类
 */

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(length = 64)
    private String adminId;                        // 主键，管理员ID

    @Column(length = 64)
    private String adminName;                      // 管理员姓名

    @Column(length = 64)
    private String adminAccount;                   // 管理员账号（用于登录）

    @Column(length = 64)
    private String adminPassword;                  // 管理员密码

    @Column(length = 64)
    private String adminPhone;                     // 管理员手机号码

    public String getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }
}
