package com.simpledemo.service;

import com.simpledemo.entity.SysAdminUser;

/**
 * @author Administrator
 */
public interface SysAdminUserService {

    /**
     * 获取用户
     *
     * @param id
     * @return
     */
    SysAdminUser getSysAdminUser(long id);
}
