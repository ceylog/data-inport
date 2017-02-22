package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_income_r")
public class AcIncomeR {
    /**
     * 主键
     */
    @Id
    @Column(name = "idac_income")
    private String idacIncome;

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

    /**
     * 收益方名称
     */
    @Column(name = "benfName")
    private String benfname;

    /**
     * 受益方编号
     */
    @Column(name = "benfCode")
    private String benfcode;

    @Column(name = "availableFlag")
    private String availableflag;

    /**
     * 商户编号
     */
    @Column(name = "ac_merchant_t_idmerchant")
    private String acMerchantTIdmerchant;

    /**
     * 商户配置编号
     */
    @Column(name = "ac_merchant_t_ac_merchantConfig_i_idmerchantConfig")
    private String acMerchantTAcMerchantconfigIIdmerchantconfig;

    /**
     * 获取主键
     *
     * @return idac_income - 主键
     */
    public String getIdacIncome() {
        return idacIncome;
    }

    /**
     * 设置主键
     *
     * @param idacIncome 主键
     */
    public void setIdacIncome(String idacIncome) {
        this.idacIncome = idacIncome;
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
     * 获取收益方名称
     *
     * @return benfName - 收益方名称
     */
    public String getBenfname() {
        return benfname;
    }

    /**
     * 设置收益方名称
     *
     * @param benfname 收益方名称
     */
    public void setBenfname(String benfname) {
        this.benfname = benfname;
    }

    /**
     * 获取受益方编号
     *
     * @return benfCode - 受益方编号
     */
    public String getBenfcode() {
        return benfcode;
    }

    /**
     * 设置受益方编号
     *
     * @param benfcode 受益方编号
     */
    public void setBenfcode(String benfcode) {
        this.benfcode = benfcode;
    }

    /**
     * @return availableFlag
     */
    public String getAvailableflag() {
        return availableflag;
    }

    /**
     * @param availableflag
     */
    public void setAvailableflag(String availableflag) {
        this.availableflag = availableflag;
    }

    /**
     * 获取商户编号
     *
     * @return ac_merchant_t_idmerchant - 商户编号
     */
    public String getAcMerchantTIdmerchant() {
        return acMerchantTIdmerchant;
    }

    /**
     * 设置商户编号
     *
     * @param acMerchantTIdmerchant 商户编号
     */
    public void setAcMerchantTIdmerchant(String acMerchantTIdmerchant) {
        this.acMerchantTIdmerchant = acMerchantTIdmerchant;
    }

    /**
     * 获取商户配置编号
     *
     * @return ac_merchant_t_ac_merchantConfig_i_idmerchantConfig - 商户配置编号
     */
    public String getAcMerchantTAcMerchantconfigIIdmerchantconfig() {
        return acMerchantTAcMerchantconfigIIdmerchantconfig;
    }

    /**
     * 设置商户配置编号
     *
     * @param acMerchantTAcMerchantconfigIIdmerchantconfig 商户配置编号
     */
    public void setAcMerchantTAcMerchantconfigIIdmerchantconfig(String acMerchantTAcMerchantconfigIIdmerchantconfig) {
        this.acMerchantTAcMerchantconfigIIdmerchantconfig = acMerchantTAcMerchantconfigIIdmerchantconfig;
    }
}