package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "event_log")
public class EventLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "app_id")
    private String appId;

    @Column(name = "session_id")
    private String sessionId;

    /**
     * unknown 0, charge 1, refund 2
     */
    @Column(name = "event_type")
    private Byte eventType;

    /**
     * unknown 0, web 1, mobile 2
     */
    private Byte source;

    private BigDecimal amount;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private Date lastUpdated;

    private String currency;

    /**
     * unknown, merchdise1, virtual_product2, travel3, education4
     */
    @Column(name = "order_type")
    private Byte orderType;

    @Column(name = "status_bit")
    private byte[] statusBit;

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
     * @return merchant_id
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * @param merchantId
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * @return app_id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * @return session_id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 获取unknown 0, charge 1, refund 2
     *
     * @return event_type - unknown 0, charge 1, refund 2
     */
    public Byte getEventType() {
        return eventType;
    }

    /**
     * 设置unknown 0, charge 1, refund 2
     *
     * @param eventType unknown 0, charge 1, refund 2
     */
    public void setEventType(Byte eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取unknown 0, web 1, mobile 2
     *
     * @return source - unknown 0, web 1, mobile 2
     */
    public Byte getSource() {
        return source;
    }

    /**
     * 设置unknown 0, web 1, mobile 2
     *
     * @param source unknown 0, web 1, mobile 2
     */
    public void setSource(Byte source) {
        this.source = source;
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
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取unknown, merchdise1, virtual_product2, travel3, education4
     *
     * @return order_type - unknown, merchdise1, virtual_product2, travel3, education4
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * 设置unknown, merchdise1, virtual_product2, travel3, education4
     *
     * @param orderType unknown, merchdise1, virtual_product2, travel3, education4
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * @return status_bit
     */
    public byte[] getStatusBit() {
        return statusBit;
    }

    /**
     * @param statusBit
     */
    public void setStatusBit(byte[] statusBit) {
        this.statusBit = statusBit;
    }
}