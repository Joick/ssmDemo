package com.simpledemo.exception;

/**
 * 库存不足异常
 *
 * @author Administrator
 */
public class RepeatAppointException extends RuntimeException {

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
