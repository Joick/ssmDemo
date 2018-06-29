package com.simpledemo.service.impl;

import com.simpledemo.dao.SysAdminRolesMapper;
import com.simpledemo.dao.SysAdminUserMapper;
import com.simpledemo.entity.SysAdminRoles;
import com.simpledemo.entity.SysAdminRolesExample;
import com.simpledemo.entity.SysAdminUser;
import com.simpledemo.service.SysAdminRolesService;
import com.simpledemo.service.SysAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class SysAdminUserServiceImpl implements SysAdminUserService,SysAdminRolesService {

    @Autowired
    private SysAdminUserMapper userMapper;

    @Autowired
    private SysAdminRolesMapper rolesMapper;

    public SysAdminUser getSysAdminUser(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public SysAdminRoles getRoleById(long id) {
        return rolesMapper.selectByPrimaryKey(id);
    }

    public List<SysAdminRoles> listAllRoles() {
        SysAdminRolesExample example = new SysAdminRolesExample();
        example.clear();

        return rolesMapper.selectByExample(example);
    }

    public int updateRole(SysAdminRoles role) {
        return rolesMapper.updateByPrimaryKey(role);
    }

    public int insertRoles(List<SysAdminRoles> roles) {
        return rolesMapper.insertBatch(roles);
    }

    public int deleteRoles(List<SysAdminRoles> roles) {
        return 0;
    }
}
