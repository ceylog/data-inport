package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "withholding_payment")
public class WithholdingPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户编号是商户在连连支付支付平台上开
     */
    @Column(name = "oid_partner")
    private String oidPartner;

    /**
     * RSA 或者 MD5
     */
    @Column(name = "sign_type")
    private String signType;

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
     * 连连支付支付单
     */
    @Column(name = "oid_paybill")
    private String oidPaybill;

    /**
     * 交易金额
     */
    @Column(name = "money_order")
    private String moneyOrder;

    /**
     * 支付结果 
     */
    @Column(name = "result_pay")
    private String resultPay;

    /**
     * 清算日期
     */
    @Column(name = "settle_date")
    private Date settleDate;

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

    /**
     * 银行编号
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 签约协议号
     */
    @Column(name = "no_agree")
    private String noAgree;

    /**
     * 证件类型
     */
    @Column(name = "id_type")
    private Integer idType;

    /**
     * 证件号码 
     */
    @Column(name = "id_no")
    private String idNo;

    /**
     * 银行账号姓名
     */
    @Column(name = "acct_name")
    private String acctName;

    /**
     * 银行卡号
     */
    @Column(name = "card_no")
    private String cardNo;

    @Column(name = "creat_time")
    private Date creatTime;

    @Column(name = "last_update")
    private Date lastUpdate;

    /**
     * 代扣状态的标识码
     */
    @Column(name = "status_code")
    private Integer statusCode;

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
     * 获取商户编号是商户在连连支付支付平台上开
     *
     * @return oid_partner - 商户编号是商户在连连支付支付平台上开
     */
    public String getOidPartner() {
        return oidPartner;
    }

    /**
     * 设置商户编号是商户在连连支付支付平台上开
     *
     * @param oidPartner 商户编号是商户在连连支付支付平台上开
     */
    public void setOidPartner(String oidPartner) {
        this.oidPartner = oidPartner;
    }

    /**
     * 获取RSA 或者 MD5
     *
     * @return sign_type - RSA 或者 MD5
     */
    public String getSignType() {
        return signType;
    }

    /**
     * 设置RSA 或者 MD5
     *
     * @param signType RSA 或者 MD5
     */
    public void setSignType(String signType) {
        this.signType = signType;
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
     * 获取连连支付支付单
     *
     * @return oid_paybill - 连连支付支付单
     */
    public String getOidPaybill() {
        return oidPaybill;
    }

    /**
     * 设置连连支付支付单
     *
     * @param oidPaybill 连连支付支付单
     */
    public void setOidPaybill(String oidPaybill) {
        this.oidPaybill = oidPaybill;
    }

    /**
     * 获取交易金额
     *
     * @return money_order - 交易金额
     */
    public String getMoneyOrder() {
        return moneyOrder;
    }

    /**
     * 设置交易金额
     *
     * @param moneyOrder 交易金额
     */
    public void setMoneyOrder(String moneyOrder) {
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
    public Date getSettleDate() {
        return settleDate;
    }

    /**
     * 设置清算日期
     *
     * @param settleDate 清算日期
     */
    public void setSettleDate(Date settleDate) {
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
     * 获取银行编号
     *
     * @return bank_code - 银行编号
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行编号
     *
     * @param bankCode 银行编号
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取签约协议号
     *
     * @return no_agree - 签约协议号
     */
    public String getNoAgree() {
        return noAgree;
    }

    /**
     * 设置签约协议号
     *
     * @param noAgree 签约协议号
     */
    public void setNoAgree(String noAgree) {
        this.noAgree = noAgree;
    }

    /**
     * 获取证件类型
     *
     * @return id_type - 证件类型
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * 设置证件类型
     *
     * @param idType 证件类型
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     * 获取证件号码 
     *
     * @return id_no - 证件号码 
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置证件号码 
     *
     * @param idNo 证件号码 
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 获取银行账号姓名
     *
     * @return acct_name - 银行账号姓名
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 设置银行账号姓名
     *
     * @param acctName 银行账号姓名
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    /**
     * 获取银行卡号
     *
     * @return card_no - 银行卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置银行卡号
     *
     * @param cardNo 银行卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return creat_time
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * 获取代扣状态的标识码
     *
     * @return status_code - 代扣状态的标识码
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * 设置代扣状态的标识码
     *
     * @param statusCode 代扣状态的标识码
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}