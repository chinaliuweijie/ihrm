package com.ihrm.common.base;

import com.ihrm.common.entity.Result;
import com.ihrm.common.error.BusinessException;
import com.ihrm.common.error.EmBusinessError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    // 定义 exceptionhandler 解决未被 controller 层吸收的 exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex){

        Map<String, Object> responseData = new HashMap<>();

        if(ex instanceof BusinessException){
            BusinessException businessException = (BusinessException)ex;
            return Result.create(ex.getMessage(), businessException.getErrCode(), false,businessException.getErrMsg());
        }else{
            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrCode());
            responseData.put("errMsg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
            return Result.create(ex.getMessage(), EmBusinessError.UNKNOWN_ERROR.getErrCode(), false,EmBusinessError.UNKNOWN_ERROR.getErrMsg());
        }
    }
}
