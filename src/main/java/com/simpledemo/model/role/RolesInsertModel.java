package com.simpledemo.model.role;

import com.simpledemo.entity.SysAdminRoles;

import java.text.SimpleDateFormat;
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

    public List<SysAdminRoles> convertToEntities(){
        List<SysAdminRoles> list;

        return null;
    }

    private class RoleInsertPO {
        private String name;
        private Long parentId;
        private String description;
        private boolean enabled;
        private Date createTime = new Date();

        public SysAdminRoles convertToEntity() {
            return new SysAdminRoles(name, parentId, description, enabled, (long) 1, createTime);
        }
    }
}
