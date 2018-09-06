package com.simpledemo.utility;

import java.util.UUID;

public final class UuidUtil {

    /**
     * 生成新UUID
     *
     * @return 新UUID
     */
    public static final String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
}
