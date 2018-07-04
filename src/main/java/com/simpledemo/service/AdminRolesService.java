package com.simpledemo.service;

import com.simpledemo.entity.AdminRoles;

import java.util.List;

/**
 * @author Administrator
 */
public interface AdminRolesService {

    /**
     * 获取权限
     *
     * @param id
     * @return
     */
    AdminRoles getRoleById(long id);

    /**
     * 获取所有权限信息
     *
     * @return
     */
    List<AdminRoles> listAllRoles();

    /**
     * 更新权限信息
     *
     * @param role
     * @return
     */
    int updateRole(AdminRoles role);

    /**
     * 新增权限集
     *
     * @param roles
     * @return
     */
    int insertRoles(List<AdminRoles> roles);

    /**
     * 删除权限集
     *
     * @param roles
     * @return
     */
    int deleteRoles(List<AdminRoles> roles);

    /**
     * 获取账户权限集
     *
     * @param userId
     * @return
     */
    List<AdminRoles> listUserRoles(long userId);
}
