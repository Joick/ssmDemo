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
    AdminUser getAdminUser(long id);

    /**
     * 验证用户账号,密码
     *
     * @param account
     * @param passwrod
     * @return
     */
    AdminUser getAdminUser(String account, String passwrod);
}
