package com.hms.application.exception;


import com.hms.application.errors.ErrorEnum;

public class BaseException extends RuntimeException {

    private int errCode;

    public BaseException(int errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
    }

    public BaseException(ErrorEnum e) {
        this(e.getErrCode(), e.getErrMsg());
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

}
