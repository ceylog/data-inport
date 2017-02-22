package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_installment_project")
public class CiInstallmentProject {
    /**
     * 项目ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 订单金额
     */
    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 分期金额
     */
    @Column(name = "installment_amount")
    private BigDecimal installmentAmount;

    /**
     * type=2：借款天数； 否则，期数
     */
    private Integer term;

    /**
     * 月还款额
     */
    @Column(name = "monthly_repay")
    private BigDecimal monthlyRepay;

    /**
     * 月手续费率
     */
    @Column(name = "monthly_fee")
    private BigDecimal monthlyFee;

    /**
     * 日手续费率
     */
    @Column(name = "daily_fee")
    private BigDecimal dailyFee;

    /**
     * 当前还款期
     */
    @Column(name = "next_term")
    private Integer nextTerm;

    /**
     * 下一个还款日期
     */
    @Column(name = "next_repayday")
    private String nextRepayday;

    /**
     * PENDING：待审核、SUCCESS：审核通过、REJECT：审核拒绝、FURTHER_AUTH：人工审核、PAID：审核通过已付款、CANCEL：已取消
     */
    @Column(name = "audit_status")
    private String auditStatus;

    /**
     * 审批通过时间
     */
    @Column(name = "audit_date")
    private Date auditDate;

    /**
     * NORMAL：正常、OVERDUE：逾期、SQUARE_UP：结清、ADVANCED：提前还款
     */
    private String status;

    /**
     * 逾期天数
     */
    @Column(name = "overdue_day")
    private Integer overdueDay;

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
     * 商户id
     */
    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "agent_id")
    private String agentId;

    /**
     * 0:进件；1：现金贷
     */
    @Column(name = "product_code")
    private Integer productCode;

    /**
     * 获取项目ID
     *
     * @return id - 项目ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置项目ID
     *
     * @param id 项目ID
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
     * 获取订单金额
     *
     * @return order_amount - 订单金额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单金额
     *
     * @param orderAmount 订单金额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取分期金额
     *
     * @return installment_amount - 分期金额
     */
    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * 设置分期金额
     *
     * @param installmentAmount 分期金额
     */
    public void setInstallmentAmount(BigDecimal installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    /**
     * 获取type=2：借款天数； 否则，期数
     *
     * @return term - type=2：借款天数； 否则，期数
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * 设置type=2：借款天数； 否则，期数
     *
     * @param term type=2：借款天数； 否则，期数
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * 获取月还款额
     *
     * @return monthly_repay - 月还款额
     */
    public BigDecimal getMonthlyRepay() {
        return monthlyRepay;
    }

    /**
     * 设置月还款额
     *
     * @param monthlyRepay 月还款额
     */
    public void setMonthlyRepay(BigDecimal monthlyRepay) {
        this.monthlyRepay = monthlyRepay;
    }

    /**
     * 获取月手续费率
     *
     * @return monthly_fee - 月手续费率
     */
    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * 设置月手续费率
     *
     * @param monthlyFee 月手续费率
     */
    public void setMonthlyFee(BigDecimal monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    /**
     * 获取日手续费率
     *
     * @return daily_fee - 日手续费率
     */
    public BigDecimal getDailyFee() {
        return dailyFee;
    }

    /**
     * 设置日手续费率
     *
     * @param dailyFee 日手续费率
     */
    public void setDailyFee(BigDecimal dailyFee) {
        this.dailyFee = dailyFee;
    }

    /**
     * 获取当前还款期
     *
     * @return next_term - 当前还款期
     */
    public Integer getNextTerm() {
        return nextTerm;
    }

    /**
     * 设置当前还款期
     *
     * @param nextTerm 当前还款期
     */
    public void setNextTerm(Integer nextTerm) {
        this.nextTerm = nextTerm;
    }

    /**
     * 获取下一个还款日期
     *
     * @return next_repayday - 下一个还款日期
     */
    public String getNextRepayday() {
        return nextRepayday;
    }

    /**
     * 设置下一个还款日期
     *
     * @param nextRepayday 下一个还款日期
     */
    public void setNextRepayday(String nextRepayday) {
        this.nextRepayday = nextRepayday;
    }

    /**
     * 获取PENDING：待审核、SUCCESS：审核通过、REJECT：审核拒绝、FURTHER_AUTH：人工审核、PAID：审核通过已付款、CANCEL：已取消
     *
     * @return audit_status - PENDING：待审核、SUCCESS：审核通过、REJECT：审核拒绝、FURTHER_AUTH：人工审核、PAID：审核通过已付款、CANCEL：已取消
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置PENDING：待审核、SUCCESS：审核通过、REJECT：审核拒绝、FURTHER_AUTH：人工审核、PAID：审核通过已付款、CANCEL：已取消
     *
     * @param auditStatus PENDING：待审核、SUCCESS：审核通过、REJECT：审核拒绝、FURTHER_AUTH：人工审核、PAID：审核通过已付款、CANCEL：已取消
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取审批通过时间
     *
     * @return audit_date - 审批通过时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审批通过时间
     *
     * @param auditDate 审批通过时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * 获取NORMAL：正常、OVERDUE：逾期、SQUARE_UP：结清、ADVANCED：提前还款
     *
     * @return status - NORMAL：正常、OVERDUE：逾期、SQUARE_UP：结清、ADVANCED：提前还款
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置NORMAL：正常、OVERDUE：逾期、SQUARE_UP：结清、ADVANCED：提前还款
     *
     * @param status NORMAL：正常、OVERDUE：逾期、SQUARE_UP：结清、ADVANCED：提前还款
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取逾期天数
     *
     * @return overdue_day - 逾期天数
     */
    public Integer getOverdueDay() {
        return overdueDay;
    }

    /**
     * 设置逾期天数
     *
     * @param overdueDay 逾期天数
     */
    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
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

    /**
     * 获取商户id
     *
     * @return merchant_id - 商户id
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户id
     *
     * @param merchantId 商户id
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * @return agent_id
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取0:进件；1：现金贷
     *
     * @return product_code - 0:进件；1：现金贷
     */
    public Integer getProductCode() {
        return productCode;
    }

    /**
     * 设置0:进件；1：现金贷
     *
     * @param productCode 0:进件；1：现金贷
     */
    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }
}