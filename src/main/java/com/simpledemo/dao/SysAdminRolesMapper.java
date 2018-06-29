package com.simpledemo.dao;

import com.simpledemo.entity.SysAdminRoles;
import com.simpledemo.entity.SysAdminRolesExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface SysAdminRolesMapper {
    long countByExample(SysAdminRolesExample example);

    int deleteByExample(SysAdminRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAdminRoles record);

    int insertSelective(SysAdminRoles record);

    List<SysAdminRoles> selectByExample(SysAdminRolesExample example);

    SysAdminRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAdminRoles record, @Param("example") SysAdminRolesExample example);

    int updateByExample(@Param("record") SysAdminRoles record, @Param("example") SysAdminRolesExample example);

    int updateByPrimaryKeySelective(SysAdminRoles record);

    int updateByPrimaryKey(SysAdminRoles record);

    int insertBatch(List<SysAdminRoles> roles);
}