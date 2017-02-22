package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_mchtprf_f")
public class AcMchtprfF {
    /**
     * 订单结算流水号
     */
    @Id
    @Column(name = "idac_mchtPrf")
    private String idacMchtprf;

    /**
     * 订单金额
     */
    @Column(name = "orderAmount")
    private BigDecimal orderamount;

    /**
     * 商户收款结算金额=订单金额*商户结算比例
     */
    @Column(name = "merchantAmount")
    private BigDecimal merchantamount;

    /**
     * 商户结算比例=1-商户出资比例
     */
    @Column(name = "merchantProporation")
    private BigDecimal merchantproporation;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 结算状态：已付，未付。 空表示未付
     */
    @Column(name = "paymentStatus")
    private String paymentstatus;

    /**
     * 结算类型
     */
    @Column(name = "payType")
    private String paytype;

    /**
     * 产品编号
     */
    private String prdcode;

    @Column(name = "idmchtPayment")
    private String idmchtpayment;

    private String idorder;

    /**
     * 获取订单结算流水号
     *
     * @return idac_mchtPrf - 订单结算流水号
     */
    public String getIdacMchtprf() {
        return idacMchtprf;
    }

    /**
     * 设置订单结算流水号
     *
     * @param idacMchtprf 订单结算流水号
     */
    public void setIdacMchtprf(String idacMchtprf) {
        this.idacMchtprf = idacMchtprf;
    }

    /**
     * 获取订单金额
     *
     * @return orderAmount - 订单金额
     */
    public BigDecimal getOrderamount() {
        return orderamount;
    }

    /**
     * 设置订单金额
     *
     * @param orderamount 订单金额
     */
    public void setOrderamount(BigDecimal orderamount) {
        this.orderamount = orderamount;
    }

    /**
     * 获取商户收款结算金额=订单金额*商户结算比例
     *
     * @return merchantAmount - 商户收款结算金额=订单金额*商户结算比例
     */
    public BigDecimal getMerchantamount() {
        return merchantamount;
    }

    /**
     * 设置商户收款结算金额=订单金额*商户结算比例
     *
     * @param merchantamount 商户收款结算金额=订单金额*商户结算比例
     */
    public void setMerchantamount(BigDecimal merchantamount) {
        this.merchantamount = merchantamount;
    }

    /**
     * 获取商户结算比例=1-商户出资比例
     *
     * @return merchantProporation - 商户结算比例=1-商户出资比例
     */
    public BigDecimal getMerchantproporation() {
        return merchantproporation;
    }

    /**
     * 设置商户结算比例=1-商户出资比例
     *
     * @param merchantproporation 商户结算比例=1-商户出资比例
     */
    public void setMerchantproporation(BigDecimal merchantproporation) {
        this.merchantproporation = merchantproporation;
    }

    /**
     * 获取生成时间
     *
     * @return createTime - 生成时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置生成时间
     *
     * @param createtime 生成时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取结算状态：已付，未付。 空表示未付
     *
     * @return paymentStatus - 结算状态：已付，未付。 空表示未付
     */
    public String getPaymentstatus() {
        return paymentstatus;
    }

    /**
     * 设置结算状态：已付，未付。 空表示未付
     *
     * @param paymentstatus 结算状态：已付，未付。 空表示未付
     */
    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    /**
     * 获取结算类型
     *
     * @return payType - 结算类型
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 设置结算类型
     *
     * @param paytype 结算类型
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
     * 获取产品编号
     *
     * @return prdcode - 产品编号
     */
    public String getPrdcode() {
        return prdcode;
    }

    /**
     * 设置产品编号
     *
     * @param prdcode 产品编号
     */
    public void setPrdcode(String prdcode) {
        this.prdcode = prdcode;
    }

    /**
     * @return idmchtPayment
     */
    public String getIdmchtpayment() {
        return idmchtpayment;
    }

    /**
     * @param idmchtpayment
     */
    public void setIdmchtpayment(String idmchtpayment) {
        this.idmchtpayment = idmchtpayment;
    }

    /**
     * @return idorder
     */
    public String getIdorder() {
        return idorder;
    }

    /**
     * @param idorder
     */
    public void setIdorder(String idorder) {
        this.idorder = idorder;
    }
}