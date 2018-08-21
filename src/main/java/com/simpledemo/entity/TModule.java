package com.simpledemo.entity;

import java.util.Date;

public class TModule {
    private Long id;

    private Long parentId;

    private String title;

    private String description;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Long createUser;

    private Date createTime;

    public TModule(Long id, Long parentId, String title, String description, Boolean isEnabled, Boolean isDeleted, Long createUser, Date createTime) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.description = description;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public TModule() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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
}