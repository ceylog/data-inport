package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pay_current_account")
public class PayCurrentAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目表的项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * plan表的ID
     */
    @Column(name = "plan_id")
    private String planId;

    /**
     * 传给微信的id
     */
    @Column(name = "out_trade_no")
    private String outTradeNo;

    /**
     * 1:"SUCCESS",2:"FAILED",3:"CANCEL",4:"只生产预支付id，并没有点击支付"
     */
    private Integer state;

    /**
     * 最后操作时间
     */
    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * pay_current_account
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 微信的openid
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 存放微信支付成功的微信订单号
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 账户提交时间
     */
    @Column(name = "date_created")
    private Date dateCreated;

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
     * 获取项目表的项目ID
     *
     * @return project_id - 项目表的项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目表的项目ID
     *
     * @param projectId 项目表的项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取plan表的ID
     *
     * @return plan_id - plan表的ID
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 设置plan表的ID
     *
     * @param planId plan表的ID
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 获取传给微信的id
     *
     * @return out_trade_no - 传给微信的id
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * 设置传给微信的id
     *
     * @param outTradeNo 传给微信的id
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * 获取1:"SUCCESS",2:"FAILED",3:"CANCEL",4:"只生产预支付id，并没有点击支付"
     *
     * @return state - 1:"SUCCESS",2:"FAILED",3:"CANCEL",4:"只生产预支付id，并没有点击支付"
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置1:"SUCCESS",2:"FAILED",3:"CANCEL",4:"只生产预支付id，并没有点击支付"
     *
     * @param state 1:"SUCCESS",2:"FAILED",3:"CANCEL",4:"只生产预支付id，并没有点击支付"
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取最后操作时间
     *
     * @return last_updated - 最后操作时间
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置最后操作时间
     *
     * @param lastUpdated 最后操作时间
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 获取pay_current_account
     *
     * @return user_id - pay_current_account
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置pay_current_account
     *
     * @param userId pay_current_account
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取微信的openid
     *
     * @return open_id - 微信的openid
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信的openid
     *
     * @param openId 微信的openid
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取存放微信支付成功的微信订单号
     *
     * @return transaction_id - 存放微信支付成功的微信订单号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置存放微信支付成功的微信订单号
     *
     * @param transactionId 存放微信支付成功的微信订单号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 获取账户提交时间
     *
     * @return date_created - 账户提交时间
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设置账户提交时间
     *
     * @param dateCreated 账户提交时间
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}