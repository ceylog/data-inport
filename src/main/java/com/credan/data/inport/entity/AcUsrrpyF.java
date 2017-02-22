package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_usrrpy_f")
public class AcUsrrpyF {
    @Id
    @Column(name = "idusrRpy")
    private String idusrrpy;

    /**
     * 还款计划编号
     */
    @Column(name = "idrepaymentPlan")
    private String idrepaymentplan;

    /**
     * 还款渠道：‘0’微信支付
		‘1’快捷支付
		‘2’系统代扣
     */
    @Column(name = "payType")
    private String paytype;

    /**
     * 本金
     */
    private String principal;

    /**
     * 利息
     */
    private String interest;

    /**
     * 手续费
     */
    private String fee;

    /**
     * 	⁃	罚金

     */
    @Column(name = "punishAmount")
    private String punishamount;

    /**
     * 总金额
     */
    @Column(name = "totalAmount")
    private String totalamount;

    /**
     * 收款状态
     */
    private String status;

    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "updateTime")
    private Date updatetime;

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

    /**
     * 获取还款计划编号
     *
     * @return idrepaymentPlan - 还款计划编号
     */
    public String getIdrepaymentplan() {
        return idrepaymentplan;
    }

    /**
     * 设置还款计划编号
     *
     * @param idrepaymentplan 还款计划编号
     */
    public void setIdrepaymentplan(String idrepaymentplan) {
        this.idrepaymentplan = idrepaymentplan;
    }

    /**
     * 获取还款渠道：‘0’微信支付
		‘1’快捷支付
		‘2’系统代扣
     *
     * @return payType - 还款渠道：‘0’微信支付
		‘1’快捷支付
		‘2’系统代扣
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 设置还款渠道：‘0’微信支付
		‘1’快捷支付
		‘2’系统代扣
     *
     * @param paytype 还款渠道：‘0’微信支付
		‘1’快捷支付
		‘2’系统代扣
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
     * 获取本金
     *
     * @return principal - 本金
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * 设置本金
     *
     * @param principal 本金
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * 获取利息
     *
     * @return interest - 利息
     */
    public String getInterest() {
        return interest;
    }

    /**
     * 设置利息
     *
     * @param interest 利息
     */
    public void setInterest(String interest) {
        this.interest = interest;
    }

    /**
     * 获取手续费
     *
     * @return fee - 手续费
     */
    public String getFee() {
        return fee;
    }

    /**
     * 设置手续费
     *
     * @param fee 手续费
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * 获取	⁃	罚金

     *
     * @return punishAmount - 	⁃	罚金

     */
    public String getPunishamount() {
        return punishamount;
    }

    /**
     * 设置	⁃	罚金

     *
     * @param punishamount 	⁃	罚金

     */
    public void setPunishamount(String punishamount) {
        this.punishamount = punishamount;
    }

    /**
     * 获取总金额
     *
     * @return totalAmount - 总金额
     */
    public String getTotalamount() {
        return totalamount;
    }

    /**
     * 设置总金额
     *
     * @param totalamount 总金额
     */
    public void setTotalamount(String totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 获取收款状态
     *
     * @return status - 收款状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置收款状态
     *
     * @param status 收款状态
     */
    public void setStatus(String status) {
        this.status = status;
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
}