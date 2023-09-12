package com.yagiz.commonservice.exceptionUtils.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
