package com.simpledemo.utility;

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

    public void success(){
        this.setCode("000");
        this.setMessage("处理成功");
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

}
