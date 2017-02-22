package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_uact_f")
public class AcUactF {
    @Id
    @Column(name = "idac_uact")
    private String idacUact;

    /**
     * 变动金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "idusrAccount")
    private String idusraccount;

    /**
     * @return idac_uact
     */
    public String getIdacUact() {
        return idacUact;
    }

    /**
     * @param idacUact
     */
    public void setIdacUact(String idacUact) {
        this.idacUact = idacUact;
    }

    /**
     * 获取变动金额
     *
     * @return amount - 变动金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置变动金额
     *
     * @param amount 变动金额
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
     * @return idusrAccount
     */
    public String getIdusraccount() {
        return idusraccount;
    }

    /**
     * @param idusraccount
     */
    public void setIdusraccount(String idusraccount) {
        this.idusraccount = idusraccount;
    }
}