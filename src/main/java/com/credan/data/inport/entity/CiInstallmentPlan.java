package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_installment_plan")
public class CiInstallmentPlan {
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
     * 期数
     */
    private Integer term;

    /**
     * 月还款日
     */
    @Column(name = "month_repay_date")
    private Date monthRepayDate;

    /**
     * 月还款额
     */
    @Column(name = "month_repay_amount")
    private BigDecimal monthRepayAmount;

    /**
     * 应还本金
     */
    @Column(name = "current_capital")
    private BigDecimal currentCapital;

    /**
     * 应还管理费
     */
    @Column(name = "current_fee")
    private BigDecimal currentFee;

    /**
     * 应还滞纳金
     */
    @Column(name = "current_overdue_fine")
    private BigDecimal currentOverdueFine;

    /**
     * 实际还款总额
     */
    @Column(name = "repaid_amount")
    private BigDecimal repaidAmount;

    /**
     * 实际还款日期
     */
    @Column(name = "repaid_date")
    private String repaidDate;

    /**
     * 还款状态:UNPAID,待还款;OVERDUE: 逾期未还; PAID,还款完成；OVERDUE_PAID: 逾期已还
     */
    private String status;

    /**
     * 描述
     */
    private String description;

    /**
     * 版本
     */
    private Integer version;

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
     * 获取期数
     *
     * @return term - 期数
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * 设置期数
     *
     * @param term 期数
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * 获取月还款日
     *
     * @return month_repay_date - 月还款日
     */
    public Date getMonthRepayDate() {
        return monthRepayDate;
    }

    /**
     * 设置月还款日
     *
     * @param monthRepayDate 月还款日
     */
    public void setMonthRepayDate(Date monthRepayDate) {
        this.monthRepayDate = monthRepayDate;
    }

    /**
     * 获取月还款额
     *
     * @return month_repay_amount - 月还款额
     */
    public BigDecimal getMonthRepayAmount() {
        return monthRepayAmount;
    }

    /**
     * 设置月还款额
     *
     * @param monthRepayAmount 月还款额
     */
    public void setMonthRepayAmount(BigDecimal monthRepayAmount) {
        this.monthRepayAmount = monthRepayAmount;
    }

    /**
     * 获取应还本金
     *
     * @return current_capital - 应还本金
     */
    public BigDecimal getCurrentCapital() {
        return currentCapital;
    }

    /**
     * 设置应还本金
     *
     * @param currentCapital 应还本金
     */
    public void setCurrentCapital(BigDecimal currentCapital) {
        this.currentCapital = currentCapital;
    }

    /**
     * 获取应还管理费
     *
     * @return current_fee - 应还管理费
     */
    public BigDecimal getCurrentFee() {
        return currentFee;
    }

    /**
     * 设置应还管理费
     *
     * @param currentFee 应还管理费
     */
    public void setCurrentFee(BigDecimal currentFee) {
        this.currentFee = currentFee;
    }

    /**
     * 获取应还滞纳金
     *
     * @return current_overdue_fine - 应还滞纳金
     */
    public BigDecimal getCurrentOverdueFine() {
        return currentOverdueFine;
    }

    /**
     * 设置应还滞纳金
     *
     * @param currentOverdueFine 应还滞纳金
     */
    public void setCurrentOverdueFine(BigDecimal currentOverdueFine) {
        this.currentOverdueFine = currentOverdueFine;
    }

    /**
     * 获取实际还款总额
     *
     * @return repaid_amount - 实际还款总额
     */
    public BigDecimal getRepaidAmount() {
        return repaidAmount;
    }

    /**
     * 设置实际还款总额
     *
     * @param repaidAmount 实际还款总额
     */
    public void setRepaidAmount(BigDecimal repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    /**
     * 获取实际还款日期
     *
     * @return repaid_date - 实际还款日期
     */
    public String getRepaidDate() {
        return repaidDate;
    }

    /**
     * 设置实际还款日期
     *
     * @param repaidDate 实际还款日期
     */
    public void setRepaidDate(String repaidDate) {
        this.repaidDate = repaidDate;
    }

    /**
     * 获取还款状态:UNPAID,待还款;OVERDUE: 逾期未还; PAID,还款完成；OVERDUE_PAID: 逾期已还
     *
     * @return status - 还款状态:UNPAID,待还款;OVERDUE: 逾期未还; PAID,还款完成；OVERDUE_PAID: 逾期已还
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置还款状态:UNPAID,待还款;OVERDUE: 逾期未还; PAID,还款完成；OVERDUE_PAID: 逾期已还
     *
     * @param status 还款状态:UNPAID,待还款;OVERDUE: 逾期未还; PAID,还款完成；OVERDUE_PAID: 逾期已还
     */
    public void setStatus(String status) {
        this.status = status;
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