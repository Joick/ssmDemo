package com.simpledemo.dao;

import com.simpledemo.entity.AdminUserRoles;
import com.simpledemo.entity.AdminUserRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface AdminUserRolesMapper {
    long countByExample(AdminUserRolesExample example);

    int deleteByExample(AdminUserRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminUserRoles record);

    int insertSelective(AdminUserRoles record);

    List<AdminUserRoles> selectByExampleWithBLOBs(AdminUserRolesExample example);

    List<AdminUserRoles> selectByExample(AdminUserRolesExample example);

    AdminUserRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminUserRoles record, @Param("example") AdminUserRolesExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminUserRoles record, @Param("example") AdminUserRolesExample example);

    int updateByExample(@Param("record") AdminUserRoles record, @Param("example") AdminUserRolesExample example);

    int updateByPrimaryKeySelective(AdminUserRoles record);

    int updateByPrimaryKeyWithBLOBs(AdminUserRoles record);

    int updateByPrimaryKey(AdminUserRoles record);
}