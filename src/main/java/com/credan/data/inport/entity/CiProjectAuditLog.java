package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_project_audit_log")
public class CiProjectAuditLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 审批前状态
     */
    @Column(name = "before_audit_status")
    private String beforeAuditStatus;

    /**
     * 审批后状态
     */
    @Column(name = "after_audit_status")
    private String afterAuditStatus;

    /**
     * 备注
     */
    private String memo;

    /**
     * 扩展字段
     */
    private String ext;

    /**
     * 操作人
     */
    @Column(name = "operator_name")
    private String operatorName;

    /**
     * 操作人ID
     */
    @Column(name = "operator_id")
    private String operatorId;

    /**
     * 创建时间
     */
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
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取审批前状态
     *
     * @return before_audit_status - 审批前状态
     */
    public String getBeforeAuditStatus() {
        return beforeAuditStatus;
    }

    /**
     * 设置审批前状态
     *
     * @param beforeAuditStatus 审批前状态
     */
    public void setBeforeAuditStatus(String beforeAuditStatus) {
        this.beforeAuditStatus = beforeAuditStatus;
    }

    /**
     * 获取审批后状态
     *
     * @return after_audit_status - 审批后状态
     */
    public String getAfterAuditStatus() {
        return afterAuditStatus;
    }

    /**
     * 设置审批后状态
     *
     * @param afterAuditStatus 审批后状态
     */
    public void setAfterAuditStatus(String afterAuditStatus) {
        this.afterAuditStatus = afterAuditStatus;
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
     * 获取扩展字段
     *
     * @return ext - 扩展字段
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展字段
     *
     * @param ext 扩展字段
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * 获取操作人
     *
     * @return operator_name - 操作人
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置操作人
     *
     * @param operatorName 操作人
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 获取操作人ID
     *
     * @return operator_id - 操作人ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作人ID
     *
     * @param operatorId 操作人ID
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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
}