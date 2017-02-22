package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_score_log")
public class UserScoreLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 积分兑换率
     */
    @Column(name = "score_rate")
    private BigDecimal scoreRate;

    /**
     * 现金兑换率
     */
    @Column(name = "cash_rate")
    private BigDecimal cashRate;

    /**
     * 消费积分
     */
    @Column(name = "opt_score")
    private BigDecimal optScore;

    /**
     * 状态
     */
    private String status;

    /**
     * 被推荐用户id
     */
    @Column(name = "rc_user_id")
    private String rcUserId;

    /**
     * recommend,exchange
     */
    private String type;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    private String ext1;

    private String ext2;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取订单号
     *
     * @return order_id - 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取积分兑换率
     *
     * @return score_rate - 积分兑换率
     */
    public BigDecimal getScoreRate() {
        return scoreRate;
    }

    /**
     * 设置积分兑换率
     *
     * @param scoreRate 积分兑换率
     */
    public void setScoreRate(BigDecimal scoreRate) {
        this.scoreRate = scoreRate;
    }

    /**
     * 获取现金兑换率
     *
     * @return cash_rate - 现金兑换率
     */
    public BigDecimal getCashRate() {
        return cashRate;
    }

    /**
     * 设置现金兑换率
     *
     * @param cashRate 现金兑换率
     */
    public void setCashRate(BigDecimal cashRate) {
        this.cashRate = cashRate;
    }

    /**
     * 获取消费积分
     *
     * @return opt_score - 消费积分
     */
    public BigDecimal getOptScore() {
        return optScore;
    }

    /**
     * 设置消费积分
     *
     * @param optScore 消费积分
     */
    public void setOptScore(BigDecimal optScore) {
        this.optScore = optScore;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取被推荐用户id
     *
     * @return rc_user_id - 被推荐用户id
     */
    public String getRcUserId() {
        return rcUserId;
    }

    /**
     * 设置被推荐用户id
     *
     * @param rcUserId 被推荐用户id
     */
    public void setRcUserId(String rcUserId) {
        this.rcUserId = rcUserId;
    }

    /**
     * 获取recommend,exchange
     *
     * @return type - recommend,exchange
     */
    public String getType() {
        return type;
    }

    /**
     * 设置recommend,exchange
     *
     * @param type recommend,exchange
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return last_update_time
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return ext1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * @param ext1
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * @return ext2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * @param ext2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }
}