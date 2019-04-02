package com.hms.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description ToDo
 * @Author Ly
 * @Date 2019/3/26 22:43
 * 工作流实体类
 **/

@Entity
@Table(name = "info_workflow")
public class infoWorkflow {
    @Id
    private String billId;      //单据号

    private String sendCode;    //发起流程的医生编号

    private String acceptCode;  //收到流程消息的治疗师编号

    private String isExecute;   //是否执行完毕标志

    private String lastModified;//最后修改时间

    private String dm;           //是否删除标志

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getSendCode() {
        return sendCode;
    }

    public void setSendCode(String sendCode) {
        this.sendCode = sendCode;
    }

    public String getAcceptCode() {
        return acceptCode;
    }

    public void setAcceptCode(String acceptCode) {
        this.acceptCode = acceptCode;
    }

    public String getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(String isExecute) {
        this.isExecute = isExecute;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }
}
