package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_order_t")
public class AcOrderT {
    @Id
    private String idorder;

    @Id
    private String idmerchant;

    /**
     * 用户号
     */
    private String idusr;

    /**
     * 订单分期金额
     */
    @Column(name = "orderAmount")
    private BigDecimal orderamount;

    /**
     * 给商户打款状态
     */
    @Column(name = "transferStatus")
    private String transferstatus;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 产品编码
     */
    @Column(name = "prdCode")
    private String prdcode;

    private String memo;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * 可用标志
     */
    @Column(name = "availableFlag")
    private String availableflag;

    /**
     * 手续费
     */
    private BigDecimal fee;

    /**
     * 利息
     */
    private BigDecimal interest;

    /**
     * 利率
     */
    @Column(name = "interestRate")
    private BigDecimal interestrate;

    /**
     * 期数
     */
    private Integer term;

    private String type;

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

    /**
     * @return idmerchant
     */
    public String getIdmerchant() {
        return idmerchant;
    }

    /**
     * @param idmerchant
     */
    public void setIdmerchant(String idmerchant) {
        this.idmerchant = idmerchant;
    }

    /**
     * 获取用户号
     *
     * @return idusr - 用户号
     */
    public String getIdusr() {
        return idusr;
    }

    /**
     * 设置用户号
     *
     * @param idusr 用户号
     */
    public void setIdusr(String idusr) {
        this.idusr = idusr;
    }

    /**
     * 获取订单分期金额
     *
     * @return orderAmount - 订单分期金额
     */
    public BigDecimal getOrderamount() {
        return orderamount;
    }

    /**
     * 设置订单分期金额
     *
     * @param orderamount 订单分期金额
     */
    public void setOrderamount(BigDecimal orderamount) {
        this.orderamount = orderamount;
    }

    /**
     * 获取给商户打款状态
     *
     * @return transferStatus - 给商户打款状态
     */
    public String getTransferstatus() {
        return transferstatus;
    }

    /**
     * 设置给商户打款状态
     *
     * @param transferstatus 给商户打款状态
     */
    public void setTransferstatus(String transferstatus) {
        this.transferstatus = transferstatus;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取产品编码
     *
     * @return prdCode - 产品编码
     */
    public String getPrdcode() {
        return prdcode;
    }

    /**
     * 设置产品编码
     *
     * @param prdcode 产品编码
     */
    public void setPrdcode(String prdcode) {
        this.prdcode = prdcode;
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
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取可用标志
     *
     * @return availableFlag - 可用标志
     */
    public String getAvailableflag() {
        return availableflag;
    }

    /**
     * 设置可用标志
     *
     * @param availableflag 可用标志
     */
    public void setAvailableflag(String availableflag) {
        this.availableflag = availableflag;
    }

    /**
     * 获取手续费
     *
     * @return fee - 手续费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置手续费
     *
     * @param fee 手续费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取利息
     *
     * @return interest - 利息
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置利息
     *
     * @param interest 利息
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取利率
     *
     * @return interestRate - 利率
     */
    public BigDecimal getInterestrate() {
        return interestrate;
    }

    /**
     * 设置利率
     *
     * @param interestrate 利率
     */
    public void setInterestrate(BigDecimal interestrate) {
        this.interestrate = interestrate;
    }

    /**
     * 获取期数
     *
     * @return term - 期数
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * 设置期数
     *
     * @param term 期数
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}