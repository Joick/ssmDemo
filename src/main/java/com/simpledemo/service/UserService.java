package com.simpledemo.service;

import com.simpledemo.entity.User;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService {

    /**
     * 通过id查询用户信息
     *
     * @param id
     * @return
     */
    User getUser(long id);

    /**
     * 查询所哟后台管理用户
     *
     * @return
     */
    List<User> listAllUsers();

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    int deleteUser(long userId);


}
