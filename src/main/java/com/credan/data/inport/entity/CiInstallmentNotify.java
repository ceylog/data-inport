package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_installment_notify")
public class CiInstallmentNotify {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 项目编号
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 类型
     */
    private String type;

    /**
     * 审批状态
     */
    @Column(name = "audit_status")
    private String auditStatus;

    /**
     * 描述
     */
    private String description;

    /**
     * 审批时间
     */
    @Column(name = "audit_time")
    private Date auditTime;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 更新时间
     */
    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取项目编号
     *
     * @return project_id - 项目编号
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目编号
     *
     * @param projectId 项目编号
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取审批状态
     *
     * @return audit_status - 审批状态
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审批状态
     *
     * @param auditStatus 审批状态
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取审批时间
     *
     * @return audit_time - 审批时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置审批时间
     *
     * @param auditTime 审批时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
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
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新时间
     *
     * @return last_updated - 更新时间
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpdated 更新时间
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}