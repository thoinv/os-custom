package com.xiaojinzi.component.error;

public class ServiceRepeatCreateException extends RuntimeException {
    public ServiceRepeatCreateException() {
    }

    public ServiceRepeatCreateException(String str) {
        super(str);
    }
}