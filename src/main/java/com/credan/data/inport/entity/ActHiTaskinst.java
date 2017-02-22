package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_hi_taskinst")
public class ActHiTaskinst {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_DEF_ID_")
    private String procDefId;

    @Column(name = "TASK_DEF_KEY_")
    private String taskDefKey;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "EXECUTION_ID_")
    private String executionId;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "PARENT_TASK_ID_")
    private String parentTaskId;

    @Column(name = "DESCRIPTION_")
    private String description;

    @Column(name = "OWNER_")
    private String owner;

    @Column(name = "ASSIGNEE_")
    private String assignee;

    @Column(name = "START_TIME_")
    private Date startTime;

    @Column(name = "CLAIM_TIME_")
    private Date claimTime;

    @Column(name = "END_TIME_")
    private Date endTime;

    @Column(name = "DURATION_")
    private Long duration;

    @Column(name = "DELETE_REASON_")
    private String deleteReason;

    @Column(name = "PRIORITY_")
    private Integer priority;

    @Column(name = "DUE_DATE_")
    private Date dueDate;

    @Column(name = "FORM_KEY_")
    private String formKey;

    @Column(name = "CATEGORY_")
    private String category;

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
     * @return TASK_DEF_KEY_
     */
    public String getTaskDefKey() {
        return taskDefKey;
    }

    /**
     * @param taskDefKey
     */
    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
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
     * @return NAME_
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PARENT_TASK_ID_
     */
    public String getParentTaskId() {
        return parentTaskId;
    }

    /**
     * @param parentTaskId
     */
    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    /**
     * @return DESCRIPTION_
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return OWNER_
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
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
     * @return CLAIM_TIME_
     */
    public Date getClaimTime() {
        return claimTime;
    }

    /**
     * @param claimTime
     */
    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
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
     * @return PRIORITY_
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return DUE_DATE_
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return FORM_KEY_
     */
    public String getFormKey() {
        return formKey;
    }

    /**
     * @param formKey
     */
    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    /**
     * @return CATEGORY_
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
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