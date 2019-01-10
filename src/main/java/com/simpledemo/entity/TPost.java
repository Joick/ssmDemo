package com.simpledemo.entity;

import java.util.Date;

public class TPost {
    private Long id;

    private String title;

    private Long moduleId;

    private String moduleTitle;

    private Long height;

    private String description;

    private Integer readCount;

    private Integer upCount;

    private Integer downCount;

    private Integer favoriteCount;

    private Boolean isTop;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Long createUser;

    private Date createTime;

    public TPost(Long id, String title, Long moduleId, String moduleTitle, Long height, String description, Integer readCount, Integer upCount, Integer downCount, Integer favoriteCount, Boolean isTop, Boolean isEnabled, Boolean isDeleted, Long createUser, Date createTime) {
        this.id = id;
        this.title = title;
        this.moduleId = moduleId;
        this.moduleTitle = moduleTitle;
        this.height = height;
        this.description = description;
        this.readCount = readCount;
        this.upCount = upCount;
        this.downCount = downCount;
        this.favoriteCount = favoriteCount;
        this.isTop = isTop;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public TPost() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle == null ? null : moduleTitle.trim();
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getUpCount() {
        return upCount;
    }

    public void setUpCount(Integer upCount) {
        this.upCount = upCount;
    }

    public Integer getDownCount() {
        return downCount;
    }

    public void setDownCount(Integer downCount) {
        this.downCount = downCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
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