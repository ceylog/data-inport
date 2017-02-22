package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_usraccount_r")
public class AcUsraccountR {
    @Id
    @Column(name = "idac_usrAccount")
    private String idacUsraccount;

    /**
     * 账户类型
     */
    private String type;

    /**
     * 产品代码
     */
    @Column(name = "prdCode")
    private String prdcode;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "updateTime")
    private Date updatetime;

    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    private String idusr;

    @Column(name = "idusrCredit")
    private String idusrcredit;

    /**
     * @return idac_usrAccount
     */
    public String getIdacUsraccount() {
        return idacUsraccount;
    }

    /**
     * @param idacUsraccount
     */
    public void setIdacUsraccount(String idacUsraccount) {
        this.idacUsraccount = idacUsraccount;
    }

    /**
     * 获取账户类型
     *
     * @return type - 账户类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置账户类型
     *
     * @param type 账户类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取产品代码
     *
     * @return prdCode - 产品代码
     */
    public String getPrdcode() {
        return prdcode;
    }

    /**
     * 设置产品代码
     *
     * @param prdcode 产品代码
     */
    public void setPrdcode(String prdcode) {
        this.prdcode = prdcode;
    }

    /**
     * 获取账户余额
     *
     * @return balance - 账户余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置账户余额
     *
     * @param balance 账户余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return startTime
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return idusr
     */
    public String getIdusr() {
        return idusr;
    }

    /**
     * @param idusr
     */
    public void setIdusr(String idusr) {
        this.idusr = idusr;
    }

    /**
     * @return idusrCredit
     */
    public String getIdusrcredit() {
        return idusrcredit;
    }

    /**
     * @param idusrcredit
     */
    public void setIdusrcredit(String idusrcredit) {
        this.idusrcredit = idusrcredit;
    }
}