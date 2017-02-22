package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_cash_loan_apply")
public class MerchantCashLoanApply {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商户ID
     */
    @Column(name = "merchanrt_id")
    private String merchanrtId;

    /**
     * 申请Token
     */
    private String token;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 数据来源
     */
    private String source;

    /**
     * 申请金额
     */
    @Column(name = "apply_amount")
    private BigDecimal applyAmount;

    /**
     * 申请期限
     */
    @Column(name = "apply_term")
    private Long applyTerm;

    /**
     * 期数单位
     */
    @Column(name = "term_unit")
    private String termUnit;

    private String memo;

    /**
     * 扩展字段
     */
    private String ext;

    /**
     * 删除标识（Y/N）
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "created_time")
    private Date createdTime;

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
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商户ID
     *
     * @return merchanrt_id - 商户ID
     */
    public String getMerchanrtId() {
        return merchanrtId;
    }

    /**
     * 设置商户ID
     *
     * @param merchanrtId 商户ID
     */
    public void setMerchanrtId(String merchanrtId) {
        this.merchanrtId = merchanrtId;
    }

    /**
     * 获取申请Token
     *
     * @return token - 申请Token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置申请Token
     *
     * @param token 申请Token
     */
    public void setToken(String token) {
        this.token = token;
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
     * 获取数据来源
     *
     * @return source - 数据来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置数据来源
     *
     * @param source 数据来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取申请金额
     *
     * @return apply_amount - 申请金额
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * 设置申请金额
     *
     * @param applyAmount 申请金额
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 获取申请期限
     *
     * @return apply_term - 申请期限
     */
    public Long getApplyTerm() {
        return applyTerm;
    }

    /**
     * 设置申请期限
     *
     * @param applyTerm 申请期限
     */
    public void setApplyTerm(Long applyTerm) {
        this.applyTerm = applyTerm;
    }

    /**
     * 获取期数单位
     *
     * @return term_unit - 期数单位
     */
    public String getTermUnit() {
        return termUnit;
    }

    /**
     * 设置期数单位
     *
     * @param termUnit 期数单位
     */
    public void setTermUnit(String termUnit) {
        this.termUnit = termUnit;
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
     * 获取删除标识（Y/N）
     *
     * @return del_flag - 删除标识（Y/N）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（Y/N）
     *
     * @param delFlag 删除标识（Y/N）
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

    /**
     * @return last_updated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}