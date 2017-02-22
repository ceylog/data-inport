package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "third_mobile_tel_data")
public class ThirdMobileTelData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 数据ID
     */
    @Column(name = "data_id")
    private String dataId;

    @Column(name = "trade_type")
    private String tradeType;

    @Column(name = "trade_time")
    private Long tradeTime;

    @Column(name = "call_time")
    private Date callTime;

    @Column(name = "trade_addr")
    private String tradeAddr;

    @Column(name = "receive_phone")
    private String receivePhone;

    @Column(name = "call_type")
    private String callType;

    @Column(name = "created_time")
    private Date createdTime;

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
     * 获取数据ID
     *
     * @return data_id - 数据ID
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * 设置数据ID
     *
     * @param dataId 数据ID
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * @return trade_type
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * @param tradeType
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * @return trade_time
     */
    public Long getTradeTime() {
        return tradeTime;
    }

    /**
     * @param tradeTime
     */
    public void setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * @return call_time
     */
    public Date getCallTime() {
        return callTime;
    }

    /**
     * @param callTime
     */
    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    /**
     * @return trade_addr
     */
    public String getTradeAddr() {
        return tradeAddr;
    }

    /**
     * @param tradeAddr
     */
    public void setTradeAddr(String tradeAddr) {
        this.tradeAddr = tradeAddr;
    }

    /**
     * @return receive_phone
     */
    public String getReceivePhone() {
        return receivePhone;
    }

    /**
     * @param receivePhone
     */
    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    /**
     * @return call_type
     */
    public String getCallType() {
        return callType;
    }

    /**
     * @param callType
     */
    public void setCallType(String callType) {
        this.callType = callType;
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
}