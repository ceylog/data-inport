package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_fund_t")
public class AcFundT {
    @Id
    private String idfund;

    /**
     * 资金方名称
     */
    private String name;

    /**
     * 资金方类型
     */
    private String type;

    /**
     * 资金方机构号
     */
    @Column(name = "fndCode")
    private String fndcode;

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
     * 获取资金方名称
     *
     * @return name - 资金方名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资金方名称
     *
     * @param name 资金方名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资金方类型
     *
     * @return type - 资金方类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资金方类型
     *
     * @param type 资金方类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取资金方机构号
     *
     * @return fndCode - 资金方机构号
     */
    public String getFndcode() {
        return fndcode;
    }

    /**
     * 设置资金方机构号
     *
     * @param fndcode 资金方机构号
     */
    public void setFndcode(String fndcode) {
        this.fndcode = fndcode;
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
}