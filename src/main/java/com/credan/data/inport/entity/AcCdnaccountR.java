package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_cdnaccount_r")
public class AcCdnaccountR {
    @Id
    @Column(name = "idac_cdnAccount")
    private String idacCdnaccount;

    /**
     * 账户类型
     */
    @Column(name = "actType")
    private String acttype;

    /**
     * 账户余额
     */
    private String amount;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private String createtime;

    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private String endtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private String updatetime;

    /**
     * 有效标志
     */
    @Column(name = "availableFlag")
    private String availableflag;

    /**
     * @return idac_cdnAccount
     */
    public String getIdacCdnaccount() {
        return idacCdnaccount;
    }

    /**
     * @param idacCdnaccount
     */
    public void setIdacCdnaccount(String idacCdnaccount) {
        this.idacCdnaccount = idacCdnaccount;
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
     * 获取账户余额
     *
     * @return amount - 账户余额
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置账户余额
     *
     * @param amount 账户余额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 获取生成时间
     *
     * @return createTime - 生成时间
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 设置生成时间
     *
     * @param createtime 生成时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
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
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取有效标志
     *
     * @return availableFlag - 有效标志
     */
    public String getAvailableflag() {
        return availableflag;
    }

    /**
     * 设置有效标志
     *
     * @param availableflag 有效标志
     */
    public void setAvailableflag(String availableflag) {
        this.availableflag = availableflag;
    }
}