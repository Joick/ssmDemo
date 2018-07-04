package com.simpledemo.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

/**
 * @author Administrator
 */
public class AdminRoles {
    private Long id;
    private String name;
    private Long parentId;
    private String description;
    private Boolean enabled;
    private Boolean isactive;
    private Long createUser;
    private Date createTime;
    private Long modifyUser;
    private Date modifyTime;

    public AdminRoles(Long id, String name, Long parentId, String description, Boolean enabled, Boolean isactive, Long createUser, Date createTime, Long modifyUser, Date modifyTime) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.description = description;
        this.enabled = enabled;
        this.isactive = isactive;
        this.createUser = createUser;
        this.createTime = createTime;
        this.modifyUser = modifyUser;
        this.modifyTime = modifyTime;
    }

    public AdminRoles(String name, Long parentId, String description, Boolean enabled, Long createUser, Date createTime) {
        this.name = name;
        this.parentId = parentId;
        this.description = description;
        this.enabled = enabled;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public AdminRoles() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
}