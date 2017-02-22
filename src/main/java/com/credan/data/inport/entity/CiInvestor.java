package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_investor")
public class CiInvestor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 企业编码
     */
    private String code;

    /**
     * 企业名称
     */
    @Column(name = "invester_name")
    private String investerName;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 固话
     */
    private String telephone;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 单笔限额
     */
    @Column(name = "single_limit")
    private BigDecimal singleLimit;

    /**
     * 单月限额
     */
    @Column(name = "month_limit")
    private BigDecimal monthLimit;

    /**
     * 启用状态
     */
    private byte[] active;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取企业编码
     *
     * @return code - 企业编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置企业编码
     *
     * @param code 企业编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取企业名称
     *
     * @return invester_name - 企业名称
     */
    public String getInvesterName() {
        return investerName;
    }

    /**
     * 设置企业名称
     *
     * @param investerName 企业名称
     */
    public void setInvesterName(String investerName) {
        this.investerName = investerName;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取固话
     *
     * @return telephone - 固话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置固话
     *
     * @param telephone 固话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取单笔限额
     *
     * @return single_limit - 单笔限额
     */
    public BigDecimal getSingleLimit() {
        return singleLimit;
    }

    /**
     * 设置单笔限额
     *
     * @param singleLimit 单笔限额
     */
    public void setSingleLimit(BigDecimal singleLimit) {
        this.singleLimit = singleLimit;
    }

    /**
     * 获取单月限额
     *
     * @return month_limit - 单月限额
     */
    public BigDecimal getMonthLimit() {
        return monthLimit;
    }

    /**
     * 设置单月限额
     *
     * @param monthLimit 单月限额
     */
    public void setMonthLimit(BigDecimal monthLimit) {
        this.monthLimit = monthLimit;
    }

    /**
     * 获取启用状态
     *
     * @return active - 启用状态
     */
    public byte[] getActive() {
        return active;
    }

    /**
     * 设置启用状态
     *
     * @param active 启用状态
     */
    public void setActive(byte[] active) {
        this.active = active;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return last_updated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}