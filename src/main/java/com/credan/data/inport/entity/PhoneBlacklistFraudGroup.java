package com.credan.data.inport.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "phone_blacklist_fraud_group")
public class PhoneBlacklistFraudGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String phone;

    @Column(name = "call_count")
    private Integer callCount;

    private String source;

    private String remark;

    @Column(name = "created_time")
    private Date createdTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return call_count
     */
    public Integer getCallCount() {
        return callCount;
    }

    /**
     * @param callCount
     */
    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}