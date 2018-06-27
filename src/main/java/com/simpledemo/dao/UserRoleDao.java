package com.simpledemo.dao;

import com.simpledemo.entity.UserRole;

/**
 * @author Administrator
 */
public interface UserRoleDao {

    /**
     * 获取用户权限信息
     *
     * @param userId
     * @return
     */
    UserRole getUserRoles(long userId);

    /**
     * 更新用户权限
     *
     * @param userRole
     * @return
     */
    int updateUserRoles(UserRole userRole);

    /**
     * 删除用户权限
     *
     * @param userId
     * @return
     */
    int deleteUserRoles(long userId);
}
