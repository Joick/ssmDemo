package com.simpledemo.model.user;

/**
 * @author Administrator
 */
public class UserQueryModel {
    private long userId;
    private String data;
    private String privateKey;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPrivateKey(){
        return privateKey;
    }

    public void setPrivateKey(String privateKey){
        this.privateKey=privateKey;
    }
}
