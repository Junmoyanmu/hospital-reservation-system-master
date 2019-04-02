package com.hms.application.handle;


import com.hms.application.exception.BaseException;
import com.hms.application.response.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {


        Result result = new Result();
        if (e instanceof BaseException) {
            BaseException girlException = (BaseException) e;
            result.setErrCode(girlException.getErrCode());
            result.setErrMsg(girlException.getMessage());
            return result;
        }

        result.setErrCode(-1);
        result.setErrMsg("未知错误！");
        return result;
    }

}
