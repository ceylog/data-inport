package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_merchant_t")
public class AcMerchantT {
    @Id
    private String idmerchant;

    /**
     * 商户编码（预留）用来管理树形结构

前4位主节点
中4位分支节点
后四位叶子节点
     */
    @Column(name = "mchtCode")
    private String mchtcode;

    /**
     * 商户名称
     */
    private String name;

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
     * 获取商户编码（预留）用来管理树形结构

前4位主节点
中4位分支节点
后四位叶子节点
     *
     * @return mchtCode - 商户编码（预留）用来管理树形结构

前4位主节点
中4位分支节点
后四位叶子节点
     */
    public String getMchtcode() {
        return mchtcode;
    }

    /**
     * 设置商户编码（预留）用来管理树形结构

前4位主节点
中4位分支节点
后四位叶子节点
     *
     * @param mchtcode 商户编码（预留）用来管理树形结构

前4位主节点
中4位分支节点
后四位叶子节点
     */
    public void setMchtcode(String mchtcode) {
        this.mchtcode = mchtcode;
    }

    /**
     * 获取商户名称
     *
     * @return name - 商户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商户名称
     *
     * @param name 商户名称
     */
    public void setName(String name) {
        this.name = name;
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