package com.simpledemo.dto;

/**
 * 封装json对象,所有返回结果都使用它
 *
 * @author Administrator
 */
public class Result<T> {

    private String code;
    private String message;
    private T data;

    public Result() {
    }

    public void success(T data) {
        this.setCode("000");
        this.setMessage("处理成功");
        this.setData(data);
    }

    public void fail(String message) {
        this.setCode("500");
        this.setMessage(message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /*public boolean success; // 是否成功标识
    private T data; // 成功时返回的数据
    private String error; // 错误信息

    public Result() {
    }

    // 成功时的构造器
    public Result(boolean success, T data) {
        this.data = data;
        this.success = success;
    }

    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }*/
}
