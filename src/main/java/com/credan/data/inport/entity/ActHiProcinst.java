package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_hi_procinst")
public class ActHiProcinst {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "BUSINESS_KEY_")
    private String businessKey;

    @Column(name = "PROC_DEF_ID_")
    private String procDefId;

    @Column(name = "START_TIME_")
    private Date startTime;

    @Column(name = "END_TIME_")
    private Date endTime;

    @Column(name = "DURATION_")
    private Long duration;

    @Column(name = "START_USER_ID_")
    private String startUserId;

    @Column(name = "START_ACT_ID_")
    private String startActId;

    @Column(name = "END_ACT_ID_")
    private String endActId;

    @Column(name = "SUPER_PROCESS_INSTANCE_ID_")
    private String superProcessInstanceId;

    @Column(name = "DELETE_REASON_")
    private String deleteReason;

    @Column(name = "TENANT_ID_")
    private String tenantId;

    /**
     * @return ID_
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
     * @return PROC_INST_ID_
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    /**
     * @return BUSINESS_KEY_
     */
    public String getBusinessKey() {
        return businessKey;
    }

    /**
     * @param businessKey
     */
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    /**
     * @return PROC_DEF_ID_
     */
    public String getProcDefId() {
        return procDefId;
    }

    /**
     * @param procDefId
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    /**
     * @return START_TIME_
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return END_TIME_
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return DURATION_
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * @return START_USER_ID_
     */
    public String getStartUserId() {
        return startUserId;
    }

    /**
     * @param startUserId
     */
    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
    }

    /**
     * @return START_ACT_ID_
     */
    public String getStartActId() {
        return startActId;
    }

    /**
     * @param startActId
     */
    public void setStartActId(String startActId) {
        this.startActId = startActId;
    }

    /**
     * @return END_ACT_ID_
     */
    public String getEndActId() {
        return endActId;
    }

    /**
     * @param endActId
     */
    public void setEndActId(String endActId) {
        this.endActId = endActId;
    }

    /**
     * @return SUPER_PROCESS_INSTANCE_ID_
     */
    public String getSuperProcessInstanceId() {
        return superProcessInstanceId;
    }

    /**
     * @param superProcessInstanceId
     */
    public void setSuperProcessInstanceId(String superProcessInstanceId) {
        this.superProcessInstanceId = superProcessInstanceId;
    }

    /**
     * @return DELETE_REASON_
     */
    public String getDeleteReason() {
        return deleteReason;
    }

    /**
     * @param deleteReason
     */
    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    /**
     * @return TENANT_ID_
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}