package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "third_mobile_detail")
public class ThirdMobileDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 数据源解析主表ID
     */
    @Column(name = "info_id")
    private String infoId;

    /**
     * 通讯手机号码
     */
    @Column(name = "call_phone")
    private String callPhone;

    /**
     * 通讯次数
     */
    @Column(name = "call_count")
    private Integer callCount;

    /**
     * 类型（TEL：通话、SMS：短信）
     */
    private String type;

    /**
     * 删除标识（0：未删除、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 备注
     */
    private String memo;

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
     * 获取数据源解析主表ID
     *
     * @return info_id - 数据源解析主表ID
     */
    public String getInfoId() {
        return infoId;
    }

    /**
     * 设置数据源解析主表ID
     *
     * @param infoId 数据源解析主表ID
     */
    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    /**
     * 获取通讯手机号码
     *
     * @return call_phone - 通讯手机号码
     */
    public String getCallPhone() {
        return callPhone;
    }

    /**
     * 设置通讯手机号码
     *
     * @param callPhone 通讯手机号码
     */
    public void setCallPhone(String callPhone) {
        this.callPhone = callPhone;
    }

    /**
     * 获取通讯次数
     *
     * @return call_count - 通讯次数
     */
    public Integer getCallCount() {
        return callCount;
    }

    /**
     * 设置通讯次数
     *
     * @param callCount 通讯次数
     */
    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    /**
     * 获取类型（TEL：通话、SMS：短信）
     *
     * @return type - 类型（TEL：通话、SMS：短信）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（TEL：通话、SMS：短信）
     *
     * @param type 类型（TEL：通话、SMS：短信）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取删除标识（0：未删除、1：已删除）
     *
     * @return del_flag - 删除标识（0：未删除、1：已删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0：未删除、1：已删除）
     *
     * @param delFlag 删除标识（0：未删除、1：已删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
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