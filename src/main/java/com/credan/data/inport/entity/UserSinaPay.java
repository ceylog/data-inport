package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_sina_pay")
public class UserSinaPay {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户真实IP
     */
    @Column(name = "client_ip")
    private String clientIp;

    /**
     * 状态-已完成步骤 1,2,3,4...
     */
    private Integer status;

    /**
     * 真实姓名-户名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号码
     */
    @Column(name = "cert_no")
    private String certNo;

    /**
     * 请求编号
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 银行编码
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 银行卡号
     */
    @Column(name = "bank_no")
    private String bankNo;

    /**
     * 银行预留手机号
     */
    private String phone;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 本次绑定银行卡-标识（有效期15分钟）
     */
    private String ticket;

    /**
     * 验证码
     */
    @Column(name = "valid_code")
    private String validCode;

    /**
     * 单笔额度
     */
    private BigDecimal quota;

    /**
     * 日累计额度
     */
    @Column(name = "day_quota")
    private BigDecimal dayQuota;

    /**
     * 委托扣款重定向
     */
    @Column(name = "redirect_url")
    private String redirectUrl;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最后更新时间
     */
    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户真实IP
     *
     * @return client_ip - 用户真实IP
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * 设置用户真实IP
     *
     * @param clientIp 用户真实IP
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * 获取状态-已完成步骤 1,2,3,4...
     *
     * @return status - 状态-已完成步骤 1,2,3,4...
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态-已完成步骤 1,2,3,4...
     *
     * @param status 状态-已完成步骤 1,2,3,4...
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取真实姓名-户名
     *
     * @return real_name - 真实姓名-户名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名-户名
     *
     * @param realName 真实姓名-户名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证号码
     *
     * @return cert_no - 身份证号码
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置身份证号码
     *
     * @param certNo 身份证号码
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * 获取请求编号
     *
     * @return id - 请求编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置请求编号
     *
     * @param id 请求编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取银行编码
     *
     * @return bank_code - 银行编码
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行编码
     *
     * @param bankCode 银行编码
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取银行卡号
     *
     * @return bank_no - 银行卡号
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 设置银行卡号
     *
     * @param bankNo 银行卡号
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * 获取银行预留手机号
     *
     * @return phone - 银行预留手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置银行预留手机号
     *
     * @param phone 银行预留手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取本次绑定银行卡-标识（有效期15分钟）
     *
     * @return ticket - 本次绑定银行卡-标识（有效期15分钟）
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * 设置本次绑定银行卡-标识（有效期15分钟）
     *
     * @param ticket 本次绑定银行卡-标识（有效期15分钟）
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * 获取验证码
     *
     * @return valid_code - 验证码
     */
    public String getValidCode() {
        return validCode;
    }

    /**
     * 设置验证码
     *
     * @param validCode 验证码
     */
    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    /**
     * 获取单笔额度
     *
     * @return quota - 单笔额度
     */
    public BigDecimal getQuota() {
        return quota;
    }

    /**
     * 设置单笔额度
     *
     * @param quota 单笔额度
     */
    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    /**
     * 获取日累计额度
     *
     * @return day_quota - 日累计额度
     */
    public BigDecimal getDayQuota() {
        return dayQuota;
    }

    /**
     * 设置日累计额度
     *
     * @param dayQuota 日累计额度
     */
    public void setDayQuota(BigDecimal dayQuota) {
        this.dayQuota = dayQuota;
    }

    /**
     * 获取委托扣款重定向
     *
     * @return redirect_url - 委托扣款重定向
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * 设置委托扣款重定向
     *
     * @param redirectUrl 委托扣款重定向
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取最后更新时间
     *
     * @return last_updated - 最后更新时间
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdated 最后更新时间
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}