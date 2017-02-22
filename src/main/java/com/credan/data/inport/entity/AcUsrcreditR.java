package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_usrcredit_r")
public class AcUsrcreditR {
    @Id
    @Column(name = "idac_usrCredit")
    private String idacUsrcredit;

    /**
     * 授信类型
     */
    private String type;

    /**
     * 产品编码
     */
    @Column(name = "prdCode")
    private String prdcode;

    /**
     * 授信额度
     */
    private BigDecimal credit;

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

    private String idusr;

    /**
     * @return idac_usrCredit
     */
    public String getIdacUsrcredit() {
        return idacUsrcredit;
    }

    /**
     * @param idacUsrcredit
     */
    public void setIdacUsrcredit(String idacUsrcredit) {
        this.idacUsrcredit = idacUsrcredit;
    }

    /**
     * 获取授信类型
     *
     * @return type - 授信类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置授信类型
     *
     * @param type 授信类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取产品编码
     *
     * @return prdCode - 产品编码
     */
    public String getPrdcode() {
        return prdcode;
    }

    /**
     * 设置产品编码
     *
     * @param prdcode 产品编码
     */
    public void setPrdcode(String prdcode) {
        this.prdcode = prdcode;
    }

    /**
     * 获取授信额度
     *
     * @return credit - 授信额度
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 设置授信额度
     *
     * @param credit 授信额度
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
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
}