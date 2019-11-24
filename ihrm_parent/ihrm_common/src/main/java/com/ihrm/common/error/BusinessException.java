package com.ihrm.common.error;

import org.omg.SendingContext.RunTime;

// 包装器业务异常类实现
public class BusinessException extends RuntimeException implements CommonError {

    private CommonError commonError;

    public BusinessException(CommonError commonError){
        // 千万记住 一定要调用supper   因为Exception 有自身的构造方法需要
        super();
        this.commonError = commonError;
    }

    public BusinessException(CommonError commonError, String errMsg){
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}