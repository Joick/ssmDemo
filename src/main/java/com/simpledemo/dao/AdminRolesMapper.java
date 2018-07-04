package com.simpledemo.dao;

import com.simpledemo.entity.AdminRoles;
import com.simpledemo.entity.AdminRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface AdminRolesMapper {
    long countByExample(AdminRolesExample example);

    int deleteByExample(AdminRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRoles record);

    int insertSelective(AdminRoles record);

    List<AdminRoles> selectByExample(AdminRolesExample example);

    AdminRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminRoles record, @Param("example") AdminRolesExample example);

    int updateByExample(@Param("record") AdminRoles record, @Param("example") AdminRolesExample example);

    int updateByPrimaryKeySelective(AdminRoles record);

    int updateByPrimaryKey(AdminRoles record);

    List<AdminRoles> selectUserRoles(long userId);
}