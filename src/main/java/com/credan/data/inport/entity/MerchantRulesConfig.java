package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_rules_config")
public class MerchantRulesConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 决策xml文件
     */
    private String decision;

    /**
     * 反欺诈xml文件
     */
    private String fraud;

    /**
     * 前置反欺诈xml文件
     */
    @Column(name = "early_fraud")
    private String earlyFraud;

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
     * 获取决策xml文件
     *
     * @return decision - 决策xml文件
     */
    public String getDecision() {
        return decision;
    }

    /**
     * 设置决策xml文件
     *
     * @param decision 决策xml文件
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /**
     * 获取反欺诈xml文件
     *
     * @return fraud - 反欺诈xml文件
     */
    public String getFraud() {
        return fraud;
    }

    /**
     * 设置反欺诈xml文件
     *
     * @param fraud 反欺诈xml文件
     */
    public void setFraud(String fraud) {
        this.fraud = fraud;
    }

    /**
     * 获取前置反欺诈xml文件
     *
     * @return early_fraud - 前置反欺诈xml文件
     */
    public String getEarlyFraud() {
        return earlyFraud;
    }

    /**
     * 设置前置反欺诈xml文件
     *
     * @param earlyFraud 前置反欺诈xml文件
     */
    public void setEarlyFraud(String earlyFraud) {
        this.earlyFraud = earlyFraud;
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