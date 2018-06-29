package com.simpledemo.service;

import com.simpledemo.entity.SysAdminRoles;

import java.util.List;

/**
 * @author Administrator
 */
public interface SysAdminRolesService {

    /**
     * 获取权限
     *
     * @param id
     * @return
     */
    SysAdminRoles getRoleById(long id);

    /**
     * 获取所有权限信息
     *
     * @return
     */
    List<SysAdminRoles> listAllRoles();

    /**
     * 更新权限信息
     *
     * @param role
     * @return
     */
    int updateRole(SysAdminRoles role);

    /**
     * 新增权限集
     *
     * @param roles
     * @return
     */
    int insertRoles(List<SysAdminRoles> roles);

    /**
     * 删除权限集
     *
     * @param roles
     * @return
     */
    int deleteRoles(List<SysAdminRoles> roles);
}
