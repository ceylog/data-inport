package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "risk_user_submit")
public class RiskUserSubmit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    private String source;

    private String raw;

    @Column(name = "submit_count")
    private Long submitCount;

    @Column(name = "last_submit_time")
    private Date lastSubmitTime;

    private String memo;

    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "created_time")
    private Date createdTime;

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
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * @return raw
     */
    public String getRaw() {
        return raw;
    }

    /**
     * @param raw
     */
    public void setRaw(String raw) {
        this.raw = raw;
    }

    /**
     * @return submit_count
     */
    public Long getSubmitCount() {
        return submitCount;
    }

    /**
     * @param submitCount
     */
    public void setSubmitCount(Long submitCount) {
        this.submitCount = submitCount;
    }

    /**
     * @return last_submit_time
     */
    public Date getLastSubmitTime() {
        return lastSubmitTime;
    }

    /**
     * @param lastSubmitTime
     */
    public void setLastSubmitTime(Date lastSubmitTime) {
        this.lastSubmitTime = lastSubmitTime;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return del_flag
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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