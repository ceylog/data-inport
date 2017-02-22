package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_repaymentplan_r")
public class AcRepaymentplanR {
    @Id
    @Column(name = "idrepaymentPlan")
    private String idrepaymentplan;

    /**
     * 订单编号
     */
    @Id
    private String idorder;

    /**
     * 期数
     */
    private Integer term;

    /**
     * 还款日期
     */
    @Column(name = "rpyDate")
    private Date rpydate;

    /**
     * 应还金额
     */
    @Column(name = "mAmount")
    private BigDecimal mamount;

    /**
     * 应还本金
     */
    private BigDecimal capital;

    /**
     * 手续费
     */
    private BigDecimal fee;

    /**
     * 利息
     */
    private BigDecimal interest;

    /**
     * 逾期罚息
     */
    @Column(name = "ovdFine")
    private BigDecimal ovdfine;

    /**
     * 实际还款时间
     */
    @Column(name = "crnDate")
    private Date crndate;

    /**
     * 还款状态
     */
    private String status;

    /**
     * 描述
     */
    private String discription;

    /**
     * 记录生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

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
     * 合并生成新的id
     */
    @Column(name = "merg_idrepaymentPlan")
    private String mergIdrepaymentplan;

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
     * 获取订单编号
     *
     * @return idorder - 订单编号
     */
    public String getIdorder() {
        return idorder;
    }

    /**
     * 设置订单编号
     *
     * @param idorder 订单编号
     */
    public void setIdorder(String idorder) {
        this.idorder = idorder;
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
     * 获取还款日期
     *
     * @return rpyDate - 还款日期
     */
    public Date getRpydate() {
        return rpydate;
    }

    /**
     * 设置还款日期
     *
     * @param rpydate 还款日期
     */
    public void setRpydate(Date rpydate) {
        this.rpydate = rpydate;
    }

    /**
     * 获取应还金额
     *
     * @return mAmount - 应还金额
     */
    public BigDecimal getMamount() {
        return mamount;
    }

    /**
     * 设置应还金额
     *
     * @param mamount 应还金额
     */
    public void setMamount(BigDecimal mamount) {
        this.mamount = mamount;
    }

    /**
     * 获取应还本金
     *
     * @return capital - 应还本金
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * 设置应还本金
     *
     * @param capital 应还本金
     */
    public void setCapital(BigDecimal capital) {
        this.capital = capital;
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
     * 获取逾期罚息
     *
     * @return ovdFine - 逾期罚息
     */
    public BigDecimal getOvdfine() {
        return ovdfine;
    }

    /**
     * 设置逾期罚息
     *
     * @param ovdfine 逾期罚息
     */
    public void setOvdfine(BigDecimal ovdfine) {
        this.ovdfine = ovdfine;
    }

    /**
     * 获取实际还款时间
     *
     * @return crnDate - 实际还款时间
     */
    public Date getCrndate() {
        return crndate;
    }

    /**
     * 设置实际还款时间
     *
     * @param crndate 实际还款时间
     */
    public void setCrndate(Date crndate) {
        this.crndate = crndate;
    }

    /**
     * 获取还款状态
     *
     * @return status - 还款状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置还款状态
     *
     * @param status 还款状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取描述
     *
     * @return discription - 描述
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * 设置描述
     *
     * @param discription 描述
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * 获取记录生成时间
     *
     * @return createTime - 记录生成时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置记录生成时间
     *
     * @param createtime 记录生成时间
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
     * 获取合并生成新的id
     *
     * @return merg_idrepaymentPlan - 合并生成新的id
     */
    public String getMergIdrepaymentplan() {
        return mergIdrepaymentplan;
    }

    /**
     * 设置合并生成新的id
     *
     * @param mergIdrepaymentplan 合并生成新的id
     */
    public void setMergIdrepaymentplan(String mergIdrepaymentplan) {
        this.mergIdrepaymentplan = mergIdrepaymentplan;
    }
}