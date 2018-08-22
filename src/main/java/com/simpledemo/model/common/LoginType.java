package com.simpledemo.model.common;

/**
 * 登录类型枚举
 */
public enum LoginType {
    //    UNDEIFNINED("未知"),ACCOUNT("账号"), SMSCAPTCHA("短信验证码登录");
//
//    private final String name;
//
//    private LoginType(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    /**
     * 未知
     */
    UNDEFINED,

    /**
     * 账号登录
     */
    ACCOUNT,

    /**
     * 短验登录
     */
    SMSCAPTCHA

}
