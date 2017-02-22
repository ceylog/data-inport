package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_fact_f")
public class AcFactF {
    @Id
    private String idfact;

    /**
     * 分账类型：参见代码表， 利息分账
		手续费分账
		罚息分账
		本金分账
		提成
		逾期赔付
	                催收冲销
     */
    @Column(name = "splitType")
    private String splittype;

    /**
     * 分账比例
     */
    @Column(name = "splitRate")
    private BigDecimal splitrate;

    /**
     * 待分金额
     */
    @Column(name = "baseAmount")
    private BigDecimal baseamount;

    /**
     * 资金总额
     */
    @Column(name = "billAmount")
    private BigDecimal billamount;

    /**
     * 分账收入
     */
    @Column(name = "splitAmount")
    private BigDecimal splitamount;

    /**
     * 打款状态:已付，未付。 空表示未付
     */
    @Column(name = "paymentStatus")
    private String paymentstatus;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

    private String idorder;

    @Column(name = "idfundAccount")
    private String idfundaccount;

    /**
     * 资金方编号
     */
    private String idfund;

    /**
     * 出资方案配置
     */
    @Column(name = "idfundConfig")
    private String idfundconfig;

    @Column(name = "idrepaymentPlan")
    private String idrepaymentplan;

    @Column(name = "idusrRpy")
    private String idusrrpy;

    /**
     * @return idfact
     */
    public String getIdfact() {
        return idfact;
    }

    /**
     * @param idfact
     */
    public void setIdfact(String idfact) {
        this.idfact = idfact;
    }

    /**
     * 获取分账类型：参见代码表， 利息分账
		手续费分账
		罚息分账
		本金分账
		提成
		逾期赔付
	                催收冲销
     *
     * @return splitType - 分账类型：参见代码表， 利息分账
		手续费分账
		罚息分账
		本金分账
		提成
		逾期赔付
	                催收冲销
     */
    public String getSplittype() {
        return splittype;
    }

    /**
     * 设置分账类型：参见代码表， 利息分账
		手续费分账
		罚息分账
		本金分账
		提成
		逾期赔付
	                催收冲销
     *
     * @param splittype 分账类型：参见代码表， 利息分账
		手续费分账
		罚息分账
		本金分账
		提成
		逾期赔付
	                催收冲销
     */
    public void setSplittype(String splittype) {
        this.splittype = splittype;
    }

    /**
     * 获取分账比例
     *
     * @return splitRate - 分账比例
     */
    public BigDecimal getSplitrate() {
        return splitrate;
    }

    /**
     * 设置分账比例
     *
     * @param splitrate 分账比例
     */
    public void setSplitrate(BigDecimal splitrate) {
        this.splitrate = splitrate;
    }

    /**
     * 获取待分金额
     *
     * @return baseAmount - 待分金额
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
     * 设置待分金额
     *
     * @param baseamount 待分金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
     * 获取资金总额
     *
     * @return billAmount - 资金总额
     */
    public BigDecimal getBillamount() {
        return billamount;
    }

    /**
     * 设置资金总额
     *
     * @param billamount 资金总额
     */
    public void setBillamount(BigDecimal billamount) {
        this.billamount = billamount;
    }

    /**
     * 获取分账收入
     *
     * @return splitAmount - 分账收入
     */
    public BigDecimal getSplitamount() {
        return splitamount;
    }

    /**
     * 设置分账收入
     *
     * @param splitamount 分账收入
     */
    public void setSplitamount(BigDecimal splitamount) {
        this.splitamount = splitamount;
    }

    /**
     * 获取打款状态:已付，未付。 空表示未付
     *
     * @return paymentStatus - 打款状态:已付，未付。 空表示未付
     */
    public String getPaymentstatus() {
        return paymentstatus;
    }

    /**
     * 设置打款状态:已付，未付。 空表示未付
     *
     * @param paymentstatus 打款状态:已付，未付。 空表示未付
     */
    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
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
     * @return idfundAccount
     */
    public String getIdfundaccount() {
        return idfundaccount;
    }

    /**
     * @param idfundaccount
     */
    public void setIdfundaccount(String idfundaccount) {
        this.idfundaccount = idfundaccount;
    }

    /**
     * 获取资金方编号
     *
     * @return idfund - 资金方编号
     */
    public String getIdfund() {
        return idfund;
    }

    /**
     * 设置资金方编号
     *
     * @param idfund 资金方编号
     */
    public void setIdfund(String idfund) {
        this.idfund = idfund;
    }

    /**
     * 获取出资方案配置
     *
     * @return idfundConfig - 出资方案配置
     */
    public String getIdfundconfig() {
        return idfundconfig;
    }

    /**
     * 设置出资方案配置
     *
     * @param idfundconfig 出资方案配置
     */
    public void setIdfundconfig(String idfundconfig) {
        this.idfundconfig = idfundconfig;
    }

    /**
     * @return idrepaymentPlan
     */
    public String getIdrepaymentplan() {
        return idrepaymentplan;
    }

    /**
     * @param idrepaymentplan
     */
    public void setIdrepaymentplan(String idrepaymentplan) {
        this.idrepaymentplan = idrepaymentplan;
    }

    /**
     * @return idusrRpy
     */
    public String getIdusrrpy() {
        return idusrrpy;
    }

    /**
     * @param idusrrpy
     */
    public void setIdusrrpy(String idusrrpy) {
        this.idusrrpy = idusrrpy;
    }
}