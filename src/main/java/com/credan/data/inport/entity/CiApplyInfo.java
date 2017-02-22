package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_apply_info")
public class CiApplyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 申请类型（商品：0、现金：1）
     */
    @Column(name = "apply_type")
    private String applyType;

    /**
     * 申请总金额
     */
    @Column(name = "apply_total_amout")
    private BigDecimal applyTotalAmout;

    /**
     * 实际申请额度
     */
    @Column(name = "apply_amout")
    private BigDecimal applyAmout;

    /**
     * 申请期限
     */
    private Long term;

    /**
     * 期数单位（天：D、月：M）
     */
    private String unit;

    /**
     * 申请时间
     */
    @Column(name = "apply_date")
    private Date applyDate;

    /**
     * 商户ID
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 备注
     */
    private String memo;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

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
     * 获取申请类型（商品：0、现金：1）
     *
     * @return apply_type - 申请类型（商品：0、现金：1）
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * 设置申请类型（商品：0、现金：1）
     *
     * @param applyType 申请类型（商品：0、现金：1）
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * 获取申请总金额
     *
     * @return apply_total_amout - 申请总金额
     */
    public BigDecimal getApplyTotalAmout() {
        return applyTotalAmout;
    }

    /**
     * 设置申请总金额
     *
     * @param applyTotalAmout 申请总金额
     */
    public void setApplyTotalAmout(BigDecimal applyTotalAmout) {
        this.applyTotalAmout = applyTotalAmout;
    }

    /**
     * 获取实际申请额度
     *
     * @return apply_amout - 实际申请额度
     */
    public BigDecimal getApplyAmout() {
        return applyAmout;
    }

    /**
     * 设置实际申请额度
     *
     * @param applyAmout 实际申请额度
     */
    public void setApplyAmout(BigDecimal applyAmout) {
        this.applyAmout = applyAmout;
    }

    /**
     * 获取申请期限
     *
     * @return term - 申请期限
     */
    public Long getTerm() {
        return term;
    }

    /**
     * 设置申请期限
     *
     * @param term 申请期限
     */
    public void setTerm(Long term) {
        this.term = term;
    }

    /**
     * 获取期数单位（天：D、月：M）
     *
     * @return unit - 期数单位（天：D、月：M）
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置期数单位（天：D、月：M）
     *
     * @param unit 期数单位（天：D、月：M）
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取申请时间
     *
     * @return apply_date - 申请时间
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请时间
     *
     * @param applyDate 申请时间
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取商户ID
     *
     * @return merchant_id - 商户ID
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户ID
     *
     * @param merchantId 商户ID
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
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