package com.simpledemo.dao;

import com.simpledemo.entity.SysAdminUserRoles;
import com.simpledemo.entity.SysAdminUserRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminUserRolesMapper {
    long countByExample(SysAdminUserRolesExample example);

    int deleteByExample(SysAdminUserRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAdminUserRoles record);

    int insertSelective(SysAdminUserRoles record);

    List<SysAdminUserRoles> selectByExampleWithBLOBs(SysAdminUserRolesExample example);

    List<SysAdminUserRoles> selectByExample(SysAdminUserRolesExample example);

    SysAdminUserRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAdminUserRoles record, @Param("example") SysAdminUserRolesExample example);

    int updateByExampleWithBLOBs(@Param("record") SysAdminUserRoles record, @Param("example") SysAdminUserRolesExample example);

    int updateByExample(@Param("record") SysAdminUserRoles record, @Param("example") SysAdminUserRolesExample example);

    int updateByPrimaryKeySelective(SysAdminUserRoles record);

    int updateByPrimaryKeyWithBLOBs(SysAdminUserRoles record);

    int updateByPrimaryKey(SysAdminUserRoles record);
}