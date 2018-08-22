package com.simpledemo.model.common;

/**
 * 后缀规则
 */
public final class SuffixConstant {

    /**
     * 验证
     */
    public static final class Captcha {

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