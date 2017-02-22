package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ll_pay_current_account")
public class LlPayCurrentAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户编号
     */
    @Column(name = "oid_partner")
    private String oidPartner;

    /**
     * 签名方式
     */
    @Column(name = "sign_type")
    private String signType;

    /**
     * 签名 
     */
    private String sign;

    /**
     * 商户订单时间 
     */
    @Column(name = "dt_order")
    private String dtOrder;

    /**
     * 商户唯一订单号
     */
    @Column(name = "no_order")
    private String noOrder;

    /**
     * 连连支付支付单号
     */
    @Column(name = "oid_paybill")
    private String oidPaybill;

    /**
     * 交易金额
     */
    @Column(name = "money_order")
    private BigDecimal moneyOrder;

    /**
     * 支付结果
     */
    @Column(name = "result_pay")
    private String resultPay;

    /**
     * 清算日期
     */
    @Column(name = "settle_date")
    private String settleDate;

    /**
     * 订单描述
     */
    @Column(name = "info_order")
    private String infoOrder;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private String payType;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private Date lastUpdated;

    private Integer version;

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
     * 获取商户编号
     *
     * @return oid_partner - 商户编号
     */
    public String getOidPartner() {
        return oidPartner;
    }

    /**
     * 设置商户编号
     *
     * @param oidPartner 商户编号
     */
    public void setOidPartner(String oidPartner) {
        this.oidPartner = oidPartner;
    }

    /**
     * 获取签名方式
     *
     * @return sign_type - 签名方式
     */
    public String getSignType() {
        return signType;
    }

    /**
     * 设置签名方式
     *
     * @param signType 签名方式
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * 获取签名 
     *
     * @return sign - 签名 
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置签名 
     *
     * @param sign 签名 
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 获取商户订单时间 
     *
     * @return dt_order - 商户订单时间 
     */
    public String getDtOrder() {
        return dtOrder;
    }

    /**
     * 设置商户订单时间 
     *
     * @param dtOrder 商户订单时间 
     */
    public void setDtOrder(String dtOrder) {
        this.dtOrder = dtOrder;
    }

    /**
     * 获取商户唯一订单号
     *
     * @return no_order - 商户唯一订单号
     */
    public String getNoOrder() {
        return noOrder;
    }

    /**
     * 设置商户唯一订单号
     *
     * @param noOrder 商户唯一订单号
     */
    public void setNoOrder(String noOrder) {
        this.noOrder = noOrder;
    }

    /**
     * 获取连连支付支付单号
     *
     * @return oid_paybill - 连连支付支付单号
     */
    public String getOidPaybill() {
        return oidPaybill;
    }

    /**
     * 设置连连支付支付单号
     *
     * @param oidPaybill 连连支付支付单号
     */
    public void setOidPaybill(String oidPaybill) {
        this.oidPaybill = oidPaybill;
    }

    /**
     * 获取交易金额
     *
     * @return money_order - 交易金额
     */
    public BigDecimal getMoneyOrder() {
        return moneyOrder;
    }

    /**
     * 设置交易金额
     *
     * @param moneyOrder 交易金额
     */
    public void setMoneyOrder(BigDecimal moneyOrder) {
        this.moneyOrder = moneyOrder;
    }

    /**
     * 获取支付结果
     *
     * @return result_pay - 支付结果
     */
    public String getResultPay() {
        return resultPay;
    }

    /**
     * 设置支付结果
     *
     * @param resultPay 支付结果
     */
    public void setResultPay(String resultPay) {
        this.resultPay = resultPay;
    }

    /**
     * 获取清算日期
     *
     * @return settle_date - 清算日期
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * 设置清算日期
     *
     * @param settleDate 清算日期
     */
    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * 获取订单描述
     *
     * @return info_order - 订单描述
     */
    public String getInfoOrder() {
        return infoOrder;
    }

    /**
     * 设置订单描述
     *
     * @param infoOrder 订单描述
     */
    public void setInfoOrder(String infoOrder) {
        this.infoOrder = infoOrder;
    }

    /**
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(String payType) {
        this.payType = payType;
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
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}