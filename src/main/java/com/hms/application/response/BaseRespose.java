package com.hms.application.response;


import com.hms.application.errors.ErrorEnum;

/**
 * Create by ly on 2019/03/27
 * 封装响应内容
 */
public class BaseRespose<T> {

    private int errCode;

    private String errMsg;

    private T data;

    public BaseRespose() {
        this.errCode = 0;
        this.errMsg = "成功";
    }

    public BaseRespose(T data) {
        this();
        this.data = data;
    }

    public BaseRespose(ErrorEnum e) {
        this.errCode = e.getErrCode();
        this.errMsg = e.getErrMsg();
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}