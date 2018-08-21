package com.simpledemo.entity;

import java.util.Date;

public class TUser {
    private Long id;

    private String account;

    private String nickName;

    private String password;

    private String phone;

    private String email;

    private Integer gender;

    private Long roleId;

    private String roleName;

    private String signature;

    private Date registeTime;

    private String registreIp;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Date createTime;

    public TUser(Long id, String account, String nickName, String password, String phone, String email, Integer gender, Long roleId, String roleName, String signature, Date registeTime, String registreIp, Boolean isEnabled, Boolean isDeleted, Date createTime) {
        this.id = id;
        this.account = account;
        this.nickName = nickName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.roleId = roleId;
        this.roleName = roleName;
        this.signature = signature;
        this.registeTime = registeTime;
        this.registreIp = registreIp;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
    }

    public TUser(String account, String nickName, String password, String phone, String email, Integer gender, Long roleId, String roleName, String signature, Date registeTime, String registreIp) {
        this.account = account;
        this.nickName = nickName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.roleId = roleId;
        this.roleName = roleName;
        this.signature = signature;
        this.registeTime = registeTime;
        this.registreIp = registreIp;
    }

    public TUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Date getRegisteTime() {
        return registeTime;
    }

    public void setRegisteTime(Date registeTime) {
        this.registeTime = registeTime;
    }

    public String getRegistreIp() {
        return registreIp;
    }

    public void setRegistreIp(String registreIp) {
        this.registreIp = registreIp == null ? null : registreIp.trim();
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