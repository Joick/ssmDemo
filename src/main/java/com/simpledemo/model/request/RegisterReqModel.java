package com.simpledemo.model.request;

import com.simpledemo.entity.TUser;
import com.simpledemo.utility.UuidUtil;

import java.util.Date;

/**
 * @author hey
 */
public class RegisterReqModel {
    private String email;
    private String password;
    private String verifyCode;
    private String registerIp;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    /**
     * 数据转换为实体模型
     *
     * @return 实体模型
     */
    public TUser convertToEntity() {
        return new TUser(UuidUtil.getUUID(), "", getPassword(), "", getEmail(), 0, (long) 1, "普通用户", "", new Date(), "");
    }
}
