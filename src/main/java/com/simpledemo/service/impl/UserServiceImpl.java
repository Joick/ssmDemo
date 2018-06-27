package com.simpledemo.service.impl;

import com.simpledemo.dao.UserDao;
import com.simpledemo.entity.User;
import com.simpledemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(long userId) {
        return userDao.getUser(userId);
    }

    public List<User> listAllUsers() {
        return userDao.listAllUsers();
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(long userId) {
        return userDao.deleteUser(userId);
    }
}
