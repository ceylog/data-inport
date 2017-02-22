package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_hi_actinst")
public class ActHiActinst {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_DEF_ID_")
    private String procDefId;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "EXECUTION_ID_")
    private String executionId;

    @Column(name = "ACT_ID_")
    private String actId;

    @Column(name = "TASK_ID_")
    private String taskId;

    @Column(name = "CALL_PROC_INST_ID_")
    private String callProcInstId;

    @Column(name = "ACT_NAME_")
    private String actName;

    @Column(name = "ACT_TYPE_")
    private String actType;

    @Column(name = "ASSIGNEE_")
    private String assignee;

    @Column(name = "START_TIME_")
    private Date startTime;

    @Column(name = "END_TIME_")
    private Date endTime;

    @Column(name = "DURATION_")
    private Long duration;

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
     * @return EXECUTION_ID_
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * @param executionId
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * @return ACT_ID_
     */
    public String getActId() {
        return actId;
    }

    /**
     * @param actId
     */
    public void setActId(String actId) {
        this.actId = actId;
    }

    /**
     * @return TASK_ID_
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return CALL_PROC_INST_ID_
     */
    public String getCallProcInstId() {
        return callProcInstId;
    }

    /**
     * @param callProcInstId
     */
    public void setCallProcInstId(String callProcInstId) {
        this.callProcInstId = callProcInstId;
    }

    /**
     * @return ACT_NAME_
     */
    public String getActName() {
        return actName;
    }

    /**
     * @param actName
     */
    public void setActName(String actName) {
        this.actName = actName;
    }

    /**
     * @return ACT_TYPE_
     */
    public String getActType() {
        return actType;
    }

    /**
     * @param actType
     */
    public void setActType(String actType) {
        this.actType = actType;
    }

    /**
     * @return ASSIGNEE_
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * @param assignee
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
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