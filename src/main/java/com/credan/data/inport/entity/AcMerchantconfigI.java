package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_merchantconfig_i")
public class AcMerchantconfigI {
    /**
     * 主键
     */
    @Id
    @Column(name = "idmerchantConfig")
    private String idmerchantconfig;

    /**
     * 返点比例
     */
    @Column(name = "rebateRate")
    private BigDecimal rebaterate;

    /**
     * 起始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 合作方式：按比例出资
	or 按顺序出资
参见代码表
     */
    @Column(name = "cooperMode")
    private String coopermode;

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

    /**
     * 可用标志
     */
    @Column(name = "availableFlag")
    private String availableflag;

    private String idmerchant;

    /**
     * 结算类型
     */
    @Column(name = "payType")
    private String paytype;

    /**
     * 获取主键
     *
     * @return idmerchantConfig - 主键
     */
    public String getIdmerchantconfig() {
        return idmerchantconfig;
    }

    /**
     * 设置主键
     *
     * @param idmerchantconfig 主键
     */
    public void setIdmerchantconfig(String idmerchantconfig) {
        this.idmerchantconfig = idmerchantconfig;
    }

    /**
     * 获取返点比例
     *
     * @return rebateRate - 返点比例
     */
    public BigDecimal getRebaterate() {
        return rebaterate;
    }

    /**
     * 设置返点比例
     *
     * @param rebaterate 返点比例
     */
    public void setRebaterate(BigDecimal rebaterate) {
        this.rebaterate = rebaterate;
    }

    /**
     * 获取起始时间
     *
     * @return startTime - 起始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置起始时间
     *
     * @param starttime 起始时间
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
     * 获取合作方式：按比例出资
	or 按顺序出资
参见代码表
     *
     * @return cooperMode - 合作方式：按比例出资
	or 按顺序出资
参见代码表
     */
    public String getCoopermode() {
        return coopermode;
    }

    /**
     * 设置合作方式：按比例出资
	or 按顺序出资
参见代码表
     *
     * @param coopermode 合作方式：按比例出资
	or 按顺序出资
参见代码表
     */
    public void setCoopermode(String coopermode) {
        this.coopermode = coopermode;
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
     * 获取结算类型
     *
     * @return payType - 结算类型
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 设置结算类型
     *
     * @param paytype 结算类型
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
}