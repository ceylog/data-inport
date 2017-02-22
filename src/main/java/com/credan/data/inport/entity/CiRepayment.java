package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_repayment")
public class CiRepayment {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 分期计划ID
     */
    @Column(name = "plan_id")
    private String planId;

    /**
     * 还款总金额
     */
    @Column(name = "repaid_amount")
    private BigDecimal repaidAmount;

    /**
     * 本金
     */
    private BigDecimal capital;

    /**
     * 管理费
     */
    private BigDecimal fee;

    /**
     * 滞纳金
     */
    @Column(name = "overdue_fine")
    private BigDecimal overdueFine;

    /**
     * 还款日期
     */
    @Column(name = "repaid_date")
    private String repaidDate;

    /**
     * 描述
     */
    private String memo;

    /**
     * 版本
     */
    private Integer version;

    @Column(name = "repaid_type")
    private String repaidType;

    /**
     * 删除标识（0：未删除、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 获取唯一ID
     *
     * @return id - 唯一ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取分期计划ID
     *
     * @return plan_id - 分期计划ID
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 设置分期计划ID
     *
     * @param planId 分期计划ID
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 获取还款总金额
     *
     * @return repaid_amount - 还款总金额
     */
    public BigDecimal getRepaidAmount() {
        return repaidAmount;
    }

    /**
     * 设置还款总金额
     *
     * @param repaidAmount 还款总金额
     */
    public void setRepaidAmount(BigDecimal repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    /**
     * 获取本金
     *
     * @return capital - 本金
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * 设置本金
     *
     * @param capital 本金
     */
    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    /**
     * 获取管理费
     *
     * @return fee - 管理费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置管理费
     *
     * @param fee 管理费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取滞纳金
     *
     * @return overdue_fine - 滞纳金
     */
    public BigDecimal getOverdueFine() {
        return overdueFine;
    }

    /**
     * 设置滞纳金
     *
     * @param overdueFine 滞纳金
     */
    public void setOverdueFine(BigDecimal overdueFine) {
        this.overdueFine = overdueFine;
    }

    /**
     * 获取还款日期
     *
     * @return repaid_date - 还款日期
     */
    public String getRepaidDate() {
        return repaidDate;
    }

    /**
     * 设置还款日期
     *
     * @param repaidDate 还款日期
     */
    public void setRepaidDate(String repaidDate) {
        this.repaidDate = repaidDate;
    }

    /**
     * 获取描述
     *
     * @return memo - 描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置描述
     *
     * @param memo 描述
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return repaid_type
     */
    public String getRepaidType() {
        return repaidType;
    }

    /**
     * @param repaidType
     */
    public void setRepaidType(String repaidType) {
        this.repaidType = repaidType;
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