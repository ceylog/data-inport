package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_mchtpayment_r")
public class AcMchtpaymentR {
    /**
     * 主键
     */
    @Id
    @Column(name = "idac_mchtPayment")
    private String idacMchtpayment;

    /**
     * 收款金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 支付类型
     */
    @Column(name = "payType")
    private String paytype;

    private String idmerchant;

    @Column(name = "idmerchantConfig")
    private String idmerchantconfig;

    /**
     * 获取主键
     *
     * @return idac_mchtPayment - 主键
     */
    public String getIdacMchtpayment() {
        return idacMchtpayment;
    }

    /**
     * 设置主键
     *
     * @param idacMchtpayment 主键
     */
    public void setIdacMchtpayment(String idacMchtpayment) {
        this.idacMchtpayment = idacMchtpayment;
    }

    /**
     * 获取收款金额
     *
     * @return amount - 收款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置收款金额
     *
     * @param amount 收款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * 获取支付类型
     *
     * @return payType - 支付类型
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 设置支付类型
     *
     * @param paytype 支付类型
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
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
     * @return idmerchantConfig
     */
    public String getIdmerchantconfig() {
        return idmerchantconfig;
    }

    /**
     * @param idmerchantconfig
     */
    public void setIdmerchantconfig(String idmerchantconfig) {
        this.idmerchantconfig = idmerchantconfig;
    }
}