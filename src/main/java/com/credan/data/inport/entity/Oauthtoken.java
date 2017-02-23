package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

public class Oauthtoken {
    /**
     * 亂數產生
     */
    @Id
    private String serid;

    /**
     * TokenMD5
     */
    private String tokenid;

    /**
     * TokenMD5
     */
    private String refreshid;

    /**
     * 平台帳號
     */
    private String clientid;

    /**
     * 授權方式
     */
    private String granttype;

    /**
     * 用戶名稱
     */
    private String username;

    /**
     * 重新轉址
     */
    private String redirecturi;

    /**
     * 真實Token
     */
    private Boolean refreshed;

    /**
     * 是否鎖定不給Refresh
     */
    private Boolean locked;

    private Date createddate;

    private String createdby;

    private Date lastmodifieddate;

    private String lastmodifiedby;

    /**
     * 可存取資源
     */
    private String resourceids;

    /**
     * 執行權限範圍
     */
    private String scopes;

    /**
     * 真實Token
     */
    private byte[] accesstoken;

    private byte[] refreshtoken;

    /**
     * 授權資料
     */
    private byte[] authentication;

    /**
     * 获取亂數產生
     *
     * @return serid - 亂數產生
     */
    public String getSerid() {
        return serid;
    }

    /**
     * 设置亂數產生
     *
     * @param serid 亂數產生
     */
    public void setSerid(String serid) {
        this.serid = serid;
    }

    /**
     * 获取TokenMD5
     *
     * @return tokenid - TokenMD5
     */
    public String getTokenid() {
        return tokenid;
    }

    /**
     * 设置TokenMD5
     *
     * @param tokenid TokenMD5
     */
    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

    /**
     * 获取TokenMD5
     *
     * @return refreshid - TokenMD5
     */
    public String getRefreshid() {
        return refreshid;
    }

    /**
     * 设置TokenMD5
     *
     * @param refreshid TokenMD5
     */
    public void setRefreshid(String refreshid) {
        this.refreshid = refreshid;
    }

    /**
     * 获取平台帳號
     *
     * @return clientid - 平台帳號
     */
    public String getClientid() {
        return clientid;
    }

    /**
     * 设置平台帳號
     *
     * @param clientid 平台帳號
     */
    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    /**
     * 获取授權方式
     *
     * @return granttype - 授權方式
     */
    public String getGranttype() {
        return granttype;
    }

    /**
     * 设置授權方式
     *
     * @param granttype 授權方式
     */
    public void setGranttype(String granttype) {
        this.granttype = granttype;
    }

    /**
     * 获取用戶名稱
     *
     * @return username - 用戶名稱
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用戶名稱
     *
     * @param username 用戶名稱
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取重新轉址
     *
     * @return redirecturi - 重新轉址
     */
    public String getRedirecturi() {
        return redirecturi;
    }

    /**
     * 设置重新轉址
     *
     * @param redirecturi 重新轉址
     */
    public void setRedirecturi(String redirecturi) {
        this.redirecturi = redirecturi;
    }

    /**
     * 获取真實Token
     *
     * @return refreshed - 真實Token
     */
    public Boolean getRefreshed() {
        return refreshed;
    }

    /**
     * 设置真實Token
     *
     * @param refreshed 真實Token
     */
    public void setRefreshed(Boolean refreshed) {
        this.refreshed = refreshed;
    }

    /**
     * 获取是否鎖定不給Refresh
     *
     * @return locked - 是否鎖定不給Refresh
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置是否鎖定不給Refresh
     *
     * @param locked 是否鎖定不給Refresh
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
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

    /**
     * 获取可存取資源
     *
     * @return resourceids - 可存取資源
     */
    public String getResourceids() {
        return resourceids;
    }

    /**
     * 设置可存取資源
     *
     * @param resourceids 可存取資源
     */
    public void setResourceids(String resourceids) {
        this.resourceids = resourceids;
    }

    /**
     * 获取執行權限範圍
     *
     * @return scopes - 執行權限範圍
     */
    public String getScopes() {
        return scopes;
    }

    /**
     * 设置執行權限範圍
     *
     * @param scopes 執行權限範圍
     */
    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    /**
     * 获取真實Token
     *
     * @return accesstoken - 真實Token
     */
    public byte[] getAccesstoken() {
        return accesstoken;
    }

    /**
     * 设置真實Token
     *
     * @param accesstoken 真實Token
     */
    public void setAccesstoken(byte[] accesstoken) {
        this.accesstoken = accesstoken;
    }

    /**
     * @return refreshtoken
     */
    public byte[] getRefreshtoken() {
        return refreshtoken;
    }

    /**
     * @param refreshtoken
     */
    public void setRefreshtoken(byte[] refreshtoken) {
        this.refreshtoken = refreshtoken;
    }

    /**
     * 获取授權資料
     *
     * @return authentication - 授權資料
     */
    public byte[] getAuthentication() {
        return authentication;
    }

    /**
     * 设置授權資料
     *
     * @param authentication 授權資料
     */
    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }
}