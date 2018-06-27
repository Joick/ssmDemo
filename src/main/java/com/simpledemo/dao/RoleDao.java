package com.simpledemo.dao;

import com.simpledemo.entity.Role;

import java.util.List;

/**
 * @author Administrator
 */
public interface RoleDao {

    /**
     * 获取所有权限
     *
     * @return
     */
    List<Role> getAllRoles();

    /**
     * 获取用户拥有的权限集
     *
     * @param userId
     * @return
     */
    List<Role> getUserRoles(long userId);

    /**
     * 新增权限集
     *
     * @param roles
     * @return
     */
    int insertRoles(List<Role> roles);

    /**
     * 更新权限集
     *
     * @param roles
     * @return
     */
    int updateRoles(List<Role> roles);

    /**
     * 删除权限集
     *
     * @param roles
     * @return
     */
    int deleteRoles(List<Role> roles);


    /**
     * 新增权限
     *
     * @param role
     * @return
     */
    int insert(Role role);

    /**
     * 更新权限
     *
     * @param role
     * @return
     */
    int update(Role role);

    /**
     * 删除权限
     *
     * @param role
     * @return
     */
    int delete(Role role);

}
