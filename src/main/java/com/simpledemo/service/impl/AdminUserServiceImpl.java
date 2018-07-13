package com.simpledemo.service.impl;

import com.simpledemo.dao.AdminRolesMapper;
import com.simpledemo.dao.AdminUserMapper;
import com.simpledemo.entity.AdminRoles;
import com.simpledemo.entity.AdminRolesExample;
import com.simpledemo.entity.AdminUser;
import com.simpledemo.entity.AdminUserExample;
import com.simpledemo.service.AdminRolesService;
import com.simpledemo.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class AdminUserServiceImpl implements AdminUserService, AdminRolesService {

    @Autowired
    private AdminUserMapper userMapper;

    @Autowired
    private AdminRolesMapper rolesMapper;

    public AdminUser getAdminUser(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public AdminUser getAdminUser(String account, String password) {
        // 解密

        AdminUserExample example = new AdminUserExample();
        AdminUserExample.Criteria criteria1 = example.createCriteria();

        criteria1.andAccountEqualTo(account);
        criteria1.andPasswordEqualTo(password);

        List<AdminUser> user = userMapper.selectByExample(example);

        if (user.size() <= 0){
            return null;
        }

        return user.get(0);
    }

    public AdminRoles getRoleById(long id) {
        return rolesMapper.selectByPrimaryKey(id);
    }

    public List<AdminRoles> getAllRoles() {
        AdminRolesExample example = new AdminRolesExample();
        example.clear();

        return rolesMapper.selectByExample(example);
    }

    public int updateRole(AdminRoles role) {
        return rolesMapper.updateByPrimaryKey(role);
    }

    public int insertRoles(List<AdminRoles> roles) {
        return 0;
    }

    public int deleteRoles(List<AdminRoles> roles) {
        return 0;
    }

    public List<AdminRoles> listUserRoles(long userId) {
        return rolesMapper.selectUserRoles(userId);
    }


}
