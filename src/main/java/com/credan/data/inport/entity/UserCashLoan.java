package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_cash_loan")
public class UserCashLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 现金贷状态
     */
    @Column(name = "cash_status")
    private byte[] cashStatus;

    @Column(name = "loan_interest")
    private BigDecimal loanInterest;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "cash_limit")
    private BigDecimal cashLimit;

    @Column(name = "cash_available")
    private BigDecimal cashAvailable;

    private String memo;

    @Column(name = "freeze_amount")
    private BigDecimal freezeAmount;

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
     * 获取现金贷状态
     *
     * @return cash_status - 现金贷状态
     */
    public byte[] getCashStatus() {
        return cashStatus;
    }

    /**
     * 设置现金贷状态
     *
     * @param cashStatus 现金贷状态
     */
    public void setCashStatus(byte[] cashStatus) {
        this.cashStatus = cashStatus;
    }

    /**
     * @return loan_interest
     */
    public BigDecimal getLoanInterest() {
        return loanInterest;
    }

    /**
     * @param loanInterest
     */
    public void setLoanInterest(BigDecimal loanInterest) {
        this.loanInterest = loanInterest;
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

    /**
     * @return cash_limit
     */
    public BigDecimal getCashLimit() {
        return cashLimit;
    }

    /**
     * @param cashLimit
     */
    public void setCashLimit(BigDecimal cashLimit) {
        this.cashLimit = cashLimit;
    }

    /**
     * @return cash_available
     */
    public BigDecimal getCashAvailable() {
        return cashAvailable;
    }

    /**
     * @param cashAvailable
     */
    public void setCashAvailable(BigDecimal cashAvailable) {
        this.cashAvailable = cashAvailable;
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
     * @return freeze_amount
     */
    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    /**
     * @param freezeAmount
     */
    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }
}