package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_cash_apply_info_history")
public class CiCashApplyInfoHistory {
    /**
     * 唯一ID
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
     * 商户ID
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 申请来源1：闪电贷，2：现金贷、3：闪电贷提额
     */
    private Integer source;

    /**
     * 申请金额
     */
    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 申请期数
     */
    private Integer term;

    /**
     * 期数单位，天：D
     */
    private String unit;

    /**
     * 申请步骤
     */
    private Integer step;

    /**
     * 审核状态, 待审核：PENDING、审核通过：SUCCESS、审批拒绝：REJECT、人工审核：FURTHER_AUTH
     */
    private String status;

    /**
     * 备注
     */
    private String memo;

    /**
     * 版本
     */
    private Long version;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取申请来源1：闪电贷，2：现金贷、3：闪电贷提额
     *
     * @return source - 申请来源1：闪电贷，2：现金贷、3：闪电贷提额
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置申请来源1：闪电贷，2：现金贷、3：闪电贷提额
     *
     * @param source 申请来源1：闪电贷，2：现金贷、3：闪电贷提额
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取申请金额
     *
     * @return order_amount - 申请金额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置申请金额
     *
     * @param orderAmount 申请金额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取申请期数
     *
     * @return term - 申请期数
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * 设置申请期数
     *
     * @param term 申请期数
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * 获取期数单位，天：D
     *
     * @return unit - 期数单位，天：D
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置期数单位，天：D
     *
     * @param unit 期数单位，天：D
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取申请步骤
     *
     * @return step - 申请步骤
     */
    public Integer getStep() {
        return step;
    }

    /**
     * 设置申请步骤
     *
     * @param step 申请步骤
     */
    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * 获取审核状态, 待审核：PENDING、审核通过：SUCCESS、审批拒绝：REJECT、人工审核：FURTHER_AUTH
     *
     * @return status - 审核状态, 待审核：PENDING、审核通过：SUCCESS、审批拒绝：REJECT、人工审核：FURTHER_AUTH
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置审核状态, 待审核：PENDING、审核通过：SUCCESS、审批拒绝：REJECT、人工审核：FURTHER_AUTH
     *
     * @param status 审核状态, 待审核：PENDING、审核通过：SUCCESS、审批拒绝：REJECT、人工审核：FURTHER_AUTH
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取版本
     *
     * @return version - 版本
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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