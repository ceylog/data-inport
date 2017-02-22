package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_fund_flow")
public class CiFundFlow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 关联id
     */
    @Column(name = "relevance_id")
    private String relevanceId;

    private BigDecimal amount;

    /**
     * 交易银行卡号
     */
    @Column(name = "bank_num")
    private String bankNum;

    /**
     * 交易结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 资金类型(OUT： 出账、IN：入账)
     */
    @Column(name = "capital_type")
    private String capitalType;

    /**
     * 交易子类型（商户打款：T_MERCHANT）
     */
    @Column(name = "trade_sub_type")
    private String tradeSubType;

    /**
     * 交易状态（成功：SUCCESS、失败：FAIL）
     */
    private String status;

    /**
     * 备注
     */
    private String memo;

    private Long version;

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
     * 获取关联id
     *
     * @return relevance_id - 关联id
     */
    public String getRelevanceId() {
        return relevanceId;
    }

    /**
     * 设置关联id
     *
     * @param relevanceId 关联id
     */
    public void setRelevanceId(String relevanceId) {
        this.relevanceId = relevanceId;
    }

    /**
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取交易银行卡号
     *
     * @return bank_num - 交易银行卡号
     */
    public String getBankNum() {
        return bankNum;
    }

    /**
     * 设置交易银行卡号
     *
     * @param bankNum 交易银行卡号
     */
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    /**
     * 获取交易结束时间
     *
     * @return end_time - 交易结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置交易结束时间
     *
     * @param endTime 交易结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取资金类型(OUT： 出账、IN：入账)
     *
     * @return capital_type - 资金类型(OUT： 出账、IN：入账)
     */
    public String getCapitalType() {
        return capitalType;
    }

    /**
     * 设置资金类型(OUT： 出账、IN：入账)
     *
     * @param capitalType 资金类型(OUT： 出账、IN：入账)
     */
    public void setCapitalType(String capitalType) {
        this.capitalType = capitalType;
    }

    /**
     * 获取交易子类型（商户打款：T_MERCHANT）
     *
     * @return trade_sub_type - 交易子类型（商户打款：T_MERCHANT）
     */
    public String getTradeSubType() {
        return tradeSubType;
    }

    /**
     * 设置交易子类型（商户打款：T_MERCHANT）
     *
     * @param tradeSubType 交易子类型（商户打款：T_MERCHANT）
     */
    public void setTradeSubType(String tradeSubType) {
        this.tradeSubType = tradeSubType;
    }

    /**
     * 获取交易状态（成功：SUCCESS、失败：FAIL）
     *
     * @return status - 交易状态（成功：SUCCESS、失败：FAIL）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置交易状态（成功：SUCCESS、失败：FAIL）
     *
     * @param status 交易状态（成功：SUCCESS、失败：FAIL）
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
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
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