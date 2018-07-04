package com.simpledemo.service;

import com.simpledemo.entity.AdminUser;

/**
 * @author Administrator
 */
public interface AdminUserService {

    /**
     * 获取用户
     *
     * @param id
     * @return
     */
    AdminUser getSysAdminUser(long id);
}
