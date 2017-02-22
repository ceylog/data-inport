package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_card")
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 0001: active
0010: verified
     */
    @Column(name = "card_number")
    private String cardNumber;

    private String cvv;

    @Column(name = "linked_phone")
    private String linkedPhone;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 1:还款卡；2：提现卡
     */
    private Integer type;

    @Column(name = "date_created")
    private Date dateCreated;

    /**
     * 0:不可用；
1：可用
     */
    @Column(name = "status_bit")
    private Integer statusBit;

    /**
     * 融360查询密码
     */
    @Column(name = "select_password")
    private String selectPassword;

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
     * 获取0001: active
0010: verified
     *
     * @return card_number - 0001: active
0010: verified
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置0001: active
0010: verified
     *
     * @param cardNumber 0001: active
0010: verified
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return cvv
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * @param cvv
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * @return linked_phone
     */
    public String getLinkedPhone() {
        return linkedPhone;
    }

    /**
     * @param linkedPhone
     */
    public void setLinkedPhone(String linkedPhone) {
        this.linkedPhone = linkedPhone;
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
     * 获取1:还款卡；2：提现卡
     *
     * @return type - 1:还款卡；2：提现卡
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1:还款卡；2：提现卡
     *
     * @param type 1:还款卡；2：提现卡
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return date_created
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * 获取0:不可用；
1：可用
     *
     * @return status_bit - 0:不可用；
1：可用
     */
    public Integer getStatusBit() {
        return statusBit;
    }

    /**
     * 设置0:不可用；
1：可用
     *
     * @param statusBit 0:不可用；
1：可用
     */
    public void setStatusBit(Integer statusBit) {
        this.statusBit = statusBit;
    }

    /**
     * 获取融360查询密码
     *
     * @return select_password - 融360查询密码
     */
    public String getSelectPassword() {
        return selectPassword;
    }

    /**
     * 设置融360查询密码
     *
     * @param selectPassword 融360查询密码
     */
    public void setSelectPassword(String selectPassword) {
        this.selectPassword = selectPassword;
    }
}