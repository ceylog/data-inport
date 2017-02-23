package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

public class Account {
    /**
     * 亂數ID
     */
    @Id
    private String accountid;

    /**
     * 用戶帳號
     */
    private String username;

    /**
     * 用戶聯絡信箱
     */
    private String email;

    /**
     * 用戶密碼
     */
    private String password;

    /**
     * 是否可用
     */
    private String enabled;

    /**
     * 是否過期
     */
    private String expired;

    /**
     * 帳號是否鎖定為
     */
    private String locked;

    /**
     * 證書是否過期
     */
    private String credentialsexpired;

    private Date createddate;

    private String createdby;

    private Date lastmodifieddate;

    private String lastmodifiedby;

    /**
     * 获取亂數ID
     *
     * @return accountid - 亂數ID
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * 设置亂數ID
     *
     * @param accountid 亂數ID
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    /**
     * 获取用戶帳號
     *
     * @return username - 用戶帳號
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用戶帳號
     *
     * @param username 用戶帳號
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用戶聯絡信箱
     *
     * @return email - 用戶聯絡信箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用戶聯絡信箱
     *
     * @param email 用戶聯絡信箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用戶密碼
     *
     * @return password - 用戶密碼
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用戶密碼
     *
     * @param password 用戶密碼
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取是否可用
     *
     * @return enabled - 是否可用
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * 设置是否可用
     *
     * @param enabled 是否可用
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取是否過期
     *
     * @return expired - 是否過期
     */
    public String getExpired() {
        return expired;
    }

    /**
     * 设置是否過期
     *
     * @param expired 是否過期
     */
    public void setExpired(String expired) {
        this.expired = expired;
    }

    /**
     * 获取帳號是否鎖定為
     *
     * @return locked - 帳號是否鎖定為
     */
    public String getLocked() {
        return locked;
    }

    /**
     * 设置帳號是否鎖定為
     *
     * @param locked 帳號是否鎖定為
     */
    public void setLocked(String locked) {
        this.locked = locked;
    }

    /**
     * 获取證書是否過期
     *
     * @return credentialsexpired - 證書是否過期
     */
    public String getCredentialsexpired() {
        return credentialsexpired;
    }

    /**
     * 设置證書是否過期
     *
     * @param credentialsexpired 證書是否過期
     */
    public void setCredentialsexpired(String credentialsexpired) {
        this.credentialsexpired = credentialsexpired;
    }

    /**
     * @return createddate
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * @param createddate
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * @return createdby
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * @param createdby
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * @return lastmodifieddate
     */
    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    /**
     * @param lastmodifieddate
     */
    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    /**
     * @return lastmodifiedby
     */
    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    /**
     * @param lastmodifiedby
     */
    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid='" + accountid + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled='" + enabled + '\'' +
                ", expired='" + expired + '\'' +
                ", locked='" + locked + '\'' +
                ", credentialsexpired='" + credentialsexpired + '\'' +
                ", createddate=" + createddate +
                ", createdby='" + createdby + '\'' +
                ", lastmodifieddate=" + lastmodifieddate +
                ", lastmodifiedby='" + lastmodifiedby + '\'' +
                '}';
    }
}