package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

public class Passwdforger {
    /**
     * 亂數產生
     */
    @Id
    private String forgetid;

    /**
     * 請求IP
     */
    private String fromip;

    /**
     * 帳號ID
     */
    private String accountid;

    /**
     * OTP
     */
    private String otp;

    /**
     * 是否已使用
     */
    private Boolean used;

    /**
     * 是否已過期
     */
    private Boolean expired;

    /**
     * 預設過期時間
     */
    private Date expirdate;

    private Date createddate;

    private Date lastmodifieddate;

    /**
     * 获取亂數產生
     *
     * @return forgetid - 亂數產生
     */
    public String getForgetid() {
        return forgetid;
    }

    /**
     * 设置亂數產生
     *
     * @param forgetid 亂數產生
     */
    public void setForgetid(String forgetid) {
        this.forgetid = forgetid;
    }

    /**
     * 获取請求IP
     *
     * @return fromip - 請求IP
     */
    public String getFromip() {
        return fromip;
    }

    /**
     * 设置請求IP
     *
     * @param fromip 請求IP
     */
    public void setFromip(String fromip) {
        this.fromip = fromip;
    }

    /**
     * 获取帳號ID
     *
     * @return accountid - 帳號ID
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * 设置帳號ID
     *
     * @param accountid 帳號ID
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    /**
     * 获取OTP
     *
     * @return otp - OTP
     */
    public String getOtp() {
        return otp;
    }

    /**
     * 设置OTP
     *
     * @param otp OTP
     */
    public void setOtp(String otp) {
        this.otp = otp;
    }

    /**
     * 获取是否已使用
     *
     * @return used - 是否已使用
     */
    public Boolean getUsed() {
        return used;
    }

    /**
     * 设置是否已使用
     *
     * @param used 是否已使用
     */
    public void setUsed(Boolean used) {
        this.used = used;
    }

    /**
     * 获取是否已過期
     *
     * @return expired - 是否已過期
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * 设置是否已過期
     *
     * @param expired 是否已過期
     */
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     * 获取預設過期時間
     *
     * @return expirdate - 預設過期時間
     */
    public Date getExpirdate() {
        return expirdate;
    }

    /**
     * 设置預設過期時間
     *
     * @param expirdate 預設過期時間
     */
    public void setExpirdate(Date expirdate) {
        this.expirdate = expirdate;
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
}