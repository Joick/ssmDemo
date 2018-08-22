package com.simpledemo.model.request;

import com.simpledemo.model.common.LoginType;

public class LoginReqModel {
    private String account;
    private String password;
    private String verifyCode;

    private String phone;
    private String smsCode;

    private LoginType loginType;

    public LoginType getLoginType() {
        if (getAccount() != null && getAccount().length() > 0) {
            return LoginType.ACCOUNT;
        }else if (getPhone() != null && getPhone().length() > 0) {
            return LoginType.SMSCAPTCHA;
        }else {
            return LoginType.UNDEFINED;
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

}
