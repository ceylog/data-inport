package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "rules_transaction")
public class RulesTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tranx_id")
    private Integer tranxId;

    /**
     * 1.earlyfraud
2.fraud
3.decision engine
4.score card
     */
    private Integer type;

    private Integer score;

    @Column(name = "is_fraud")
    private Byte isFraud;

    @Column(name = "is_bad_debt")
    private Byte isBadDebt;

    @Column(name = "is_overdue")
    private Byte isOverdue;

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
     * @return tranx_id
     */
    public Integer getTranxId() {
        return tranxId;
    }

    /**
     * @param tranxId
     */
    public void setTranxId(Integer tranxId) {
        this.tranxId = tranxId;
    }

    /**
     * 获取1.earlyfraud
2.fraud
3.decision engine
4.score card
     *
     * @return type - 1.earlyfraud
2.fraud
3.decision engine
4.score card
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1.earlyfraud
2.fraud
3.decision engine
4.score card
     *
     * @param type 1.earlyfraud
2.fraud
3.decision engine
4.score card
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return is_fraud
     */
    public Byte getIsFraud() {
        return isFraud;
    }

    /**
     * @param isFraud
     */
    public void setIsFraud(Byte isFraud) {
        this.isFraud = isFraud;
    }

    /**
     * @return is_bad_debt
     */
    public Byte getIsBadDebt() {
        return isBadDebt;
    }

    /**
     * @param isBadDebt
     */
    public void setIsBadDebt(Byte isBadDebt) {
        this.isBadDebt = isBadDebt;
    }

    /**
     * @return is_overdue
     */
    public Byte getIsOverdue() {
        return isOverdue;
    }

    /**
     * @param isOverdue
     */
    public void setIsOverdue(Byte isOverdue) {
        this.isOverdue = isOverdue;
    }
}