package com.simpledemo.entity;

import java.util.Date;

/**
 * @author Administrator
 */
public class AdminUserRoles {
    private Long id;

    private Long userid;

    private String description;

    private Boolean enabled;

    private Boolean isactive;

    private Long createUser;

    private Date createTime;

    private Long modifyUser;

    private Date modifyTime;

    private String roles;

    public AdminUserRoles(Long id, Long userid, String description, Boolean enabled, Boolean isactive, Long createUser, Date createTime, Long modifyUser, Date modifyTime, String roles) {
        this.id = id;
        this.userid = userid;
        this.description = description;
        this.enabled = enabled;
        this.isactive = isactive;
        this.createUser = createUser;
        this.createTime = createTime;
        this.modifyUser = modifyUser;
        this.modifyTime = modifyTime;
        this.roles = roles;
    }

    public AdminUserRoles() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }
}