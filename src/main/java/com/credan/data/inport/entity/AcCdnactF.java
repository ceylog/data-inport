package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_cdnact_f")
public class AcCdnactF {
    @Id
    @Column(name = "idac_bcndact")
    private String idacBcndact;

    @Id
    @Column(name = "idcdnAccount")
    private String idcdnaccount;

    private String idfund;

    @Column(name = "idrepaymentPlan")
    private String idrepaymentplan;

    private String idorder;

    /**
     * 赔付金额
     */
    private BigDecimal amount;

    /**
     * 赔付类型
     */
    private String type;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * @return idac_bcndact
     */
    public String getIdacBcndact() {
        return idacBcndact;
    }

    /**
     * @param idacBcndact
     */
    public void setIdacBcndact(String idacBcndact) {
        this.idacBcndact = idacBcndact;
    }

    /**
     * @return idcdnAccount
     */
    public String getIdcdnaccount() {
        return idcdnaccount;
    }

    /**
     * @param idcdnaccount
     */
    public void setIdcdnaccount(String idcdnaccount) {
        this.idcdnaccount = idcdnaccount;
    }

    /**
     * @return idfund
     */
    public String getIdfund() {
        return idfund;
    }

    /**
     * @param idfund
     */
    public void setIdfund(String idfund) {
        this.idfund = idfund;
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
     * 获取赔付金额
     *
     * @return amount - 赔付金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置赔付金额
     *
     * @param amount 赔付金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取赔付类型
     *
     * @return type - 赔付类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置赔付类型
     *
     * @param type 赔付类型
     */
    public void setType(String type) {
        this.type = type;
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
}