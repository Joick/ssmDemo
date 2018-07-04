package com.simpledemo.model.role;

import com.simpledemo.entity.AdminRoles;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
public class RolesInsertModel {
    private List<RoleInsertPO> rolePOList;

    public List<RoleInsertPO> getRoles() {
        return rolePOList;
    }

    public void setRoles(List<RoleInsertPO> rolePOList) {
        this.rolePOList = rolePOList;
    }

    public List<AdminRoles> convertToEntities() {
        List<AdminRoles> list = new ArrayList<AdminRoles>();

        for (RoleInsertPO item :
                rolePOList) {
            list.add(item.convertToEntity());
        }

        return list;
    }

    private class RoleInsertPO {
        private String name;
        private Long parentId;
        private String description;
        private boolean enabled;
        private Date createTime = new Date();

        public AdminRoles convertToEntity() {
            return new AdminRoles(name, parentId, description, enabled, (long) 1, createTime);
        }
    }
}
