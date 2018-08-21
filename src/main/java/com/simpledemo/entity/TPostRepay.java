package com.simpledemo.entity;

import java.util.Date;

public class TPostRepay {
    private Long id;

    private Long postId;

    private Long parentId;

    private Long floorIndex;

    private Long contentType;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Long createUser;

    private Date createTime;

    private String content;

    public TPostRepay(Long id, Long postId, Long parentId, Long floorIndex, Long contentType, Boolean isEnabled, Boolean isDeleted, Long createUser, Date createTime, String content) {
        this.id = id;
        this.postId = postId;
        this.parentId = parentId;
        this.floorIndex = floorIndex;
        this.contentType = contentType;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createUser = createUser;
        this.createTime = createTime;
        this.content = content;
    }

    public TPostRepay() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getFloorIndex() {
        return floorIndex;
    }

    public void setFloorIndex(Long floorIndex) {
        this.floorIndex = floorIndex;
    }

    public Long getContentType() {
        return contentType;
    }

    public void setContentType(Long contentType) {
        this.contentType = contentType;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}