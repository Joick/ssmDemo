package com.simpledemo.entity;

import java.util.Date;

public class TDictionaryItem {
    private Long id;

    private Long parentId;

    private String name;

    private String description;

    private Integer sortId;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Date createTime;

    public TDictionaryItem(Long id, Long parentId, String name, String description, Integer sortId, Boolean isEnabled, Boolean isDeleted, Date createTime) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.description = description;
        this.sortId = sortId;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
    }

    public TDictionaryItem() {
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

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
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