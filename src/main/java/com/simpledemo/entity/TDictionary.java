package com.simpledemo.entity;

import java.util.Date;

public class TDictionary {
    private Long id;

    private String name;

    private String description;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Date createTime;

    public TDictionary(Long id, String name, String description, Boolean isEnabled, Boolean isDeleted, Date createTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
    }

    public TDictionary() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}