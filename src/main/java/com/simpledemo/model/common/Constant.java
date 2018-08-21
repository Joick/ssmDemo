package com.simpledemo.model.common;

public final class Constant {

    /**
     * 缓存常量类
     */
    public static final class CacheCaptche {

        /**
         * 短信验证码key
         */
        private static final String SMSCAPTCHE = "_captche";

        /**
         * 生成短验key
         *
         * @param phone 手机号
         * @return
         */
        public static String GenerateSmsCacheKey(String phone) {
            return phone + SMSCAPTCHE;
        }
    }
}
