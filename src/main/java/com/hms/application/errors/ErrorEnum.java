package com.hms.application.errors;

public enum ErrorEnum {
    OPERATION_FAIL(-999, "操作失败"),
    INSERT_FAIL(-1000, "添加失败"),
    UPDATE_FAIL(-1001, "更新失败"),
    DELETE_FAIL(-1002, "删除失败"),
    FILE_UNLOAD_FILE(-1005, "文件上传失败"),
    FILE_BROWSE_FILE(-1006, "文件浏览失败"),
    EXCEL_IN__FAIL(-1003, "Excel导入错误"),
    EXCEL_OUT__FAIL(-1004, "Excel导出错误");

    private int errCode;
    private String errMsg;

    ErrorEnum(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
