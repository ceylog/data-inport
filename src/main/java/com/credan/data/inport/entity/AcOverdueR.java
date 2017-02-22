package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_overdue_r")
public class AcOverdueR {
    @Id
    @Column(name = "idoverDue")
    private String idoverdue;

    /**
     * 总金额
     */
    @Column(name = "totalAmount")
    private BigDecimal totalamount;

    /**
     * 催收标志：‘0’未催回
		‘1’已催回
     */
    private String status;

    /**
     * 还款流水编号
     */
    @Column(name = "idRepayment")
    private String idrepayment;

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

    private String idorder;

    @Column(name = "idrepaymentPlan")
    private String idrepaymentplan;

    /**
     * @return idoverDue
     */
    public String getIdoverdue() {
        return idoverdue;
    }

    /**
     * @param idoverdue
     */
    public void setIdoverdue(String idoverdue) {
        this.idoverdue = idoverdue;
    }

    /**
     * 获取总金额
     *
     * @return totalAmount - 总金额
     */
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    /**
     * 设置总金额
     *
     * @param totalamount 总金额
     */
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 获取催收标志：‘0’未催回
		‘1’已催回
     *
     * @return status - 催收标志：‘0’未催回
		‘1’已催回
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置催收标志：‘0’未催回
		‘1’已催回
     *
     * @param status 催收标志：‘0’未催回
		‘1’已催回
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取还款流水编号
     *
     * @return idRepayment - 还款流水编号
     */
    public String getIdrepayment() {
        return idrepayment;
    }

    /**
     * 设置还款流水编号
     *
     * @param idrepayment 还款流水编号
     */
    public void setIdrepayment(String idrepayment) {
        this.idrepayment = idrepayment;
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
}