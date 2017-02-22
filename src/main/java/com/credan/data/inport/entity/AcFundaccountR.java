package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_fundaccount_r")
public class AcFundaccountR {
    @Id
    @Column(name = "idfundAccount")
    private String idfundaccount;

    @Id
    private String idfund;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 账户类型
     */
    @Column(name = "actType")
    private String acttype;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 可用标志
     */
    @Column(name = "availableFlag")
    private String availableflag;

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
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取账户类型
     *
     * @return actType - 账户类型
     */
    public String getActtype() {
        return acttype;
    }

    /**
     * 设置账户类型
     *
     * @param acttype 账户类型
     */
    public void setActtype(String acttype) {
        this.acttype = acttype;
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
}