package com.simpledemo.model.common;

public final class Constant {

    /**
     * 缓存常量类
     */
    public static final class CacheCaptcha {

        /**
         * 短信验证码key
         */
        private static final String SMSCAPTCHA = "_captcha";

        /**
         * 生成短验key
         *
         * @param phone 手机号
         * @return
         */
        public static String generateSmsCacheKey(String phone) {
            return phone + SMSCAPTCHA;
        }
    }
}
