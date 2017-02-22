package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_fundconfig_i")
public class AcFundconfigI {
    @Id
    @Column(name = "idfundConfig")
    private String idfundconfig;

    /**
     * 资金利率
     */
    @Column(name = "fundRate")
    private BigDecimal fundrate;

    /**
     * credan利息收入
     */
    @Column(name = "incomeRate")
    private BigDecimal incomerate;

    /**
     * 开始时间
     */
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
     * 分账模式：credan按提成比例
	credan按利率增加部分
可参见代码表
     */
    @Column(name = "splidMode")
    private String splidmode;

    /**
     * 出资比例，每个商户所有出资方出资比例合计=1
     */
    @Column(name = "capitalProportion")
    private BigDecimal capitalproportion;

    /**
     * 出资顺序
     */
    @Column(name = "capitalOrder")
    private String capitalorder;

    /**
     * 兜底比例，不能>1
     */
    @Column(name = "badDebtPayPropt")
    private BigDecimal baddebtpaypropt;

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

    private String idfund;

    private String idmerchant;

    /**
     * 每月资金方对商户的放款额度
     */
    @Column(name = "monthlyAmount")
    private BigDecimal monthlyamount;

    /**
     * @return idfundConfig
     */
    public String getIdfundconfig() {
        return idfundconfig;
    }

    /**
     * @param idfundconfig
     */
    public void setIdfundconfig(String idfundconfig) {
        this.idfundconfig = idfundconfig;
    }

    /**
     * 获取资金利率
     *
     * @return fundRate - 资金利率
     */
    public BigDecimal getFundrate() {
        return fundrate;
    }

    /**
     * 设置资金利率
     *
     * @param fundrate 资金利率
     */
    public void setFundrate(BigDecimal fundrate) {
        this.fundrate = fundrate;
    }

    /**
     * 获取credan利息收入
     *
     * @return incomeRate - credan利息收入
     */
    public BigDecimal getIncomerate() {
        return incomerate;
    }

    /**
     * 设置credan利息收入
     *
     * @param incomerate credan利息收入
     */
    public void setIncomerate(BigDecimal incomerate) {
        this.incomerate = incomerate;
    }

    /**
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
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
     * 获取分账模式：credan按提成比例
	credan按利率增加部分
可参见代码表
     *
     * @return splidMode - 分账模式：credan按提成比例
	credan按利率增加部分
可参见代码表
     */
    public String getSplidmode() {
        return splidmode;
    }

    /**
     * 设置分账模式：credan按提成比例
	credan按利率增加部分
可参见代码表
     *
     * @param splidmode 分账模式：credan按提成比例
	credan按利率增加部分
可参见代码表
     */
    public void setSplidmode(String splidmode) {
        this.splidmode = splidmode;
    }

    /**
     * 获取出资比例，每个商户所有出资方出资比例合计=1
     *
     * @return capitalProportion - 出资比例，每个商户所有出资方出资比例合计=1
     */
    public BigDecimal getCapitalproportion() {
        return capitalproportion;
    }

    /**
     * 设置出资比例，每个商户所有出资方出资比例合计=1
     *
     * @param capitalproportion 出资比例，每个商户所有出资方出资比例合计=1
     */
    public void setCapitalproportion(BigDecimal capitalproportion) {
        this.capitalproportion = capitalproportion;
    }

    /**
     * 获取出资顺序
     *
     * @return capitalOrder - 出资顺序
     */
    public String getCapitalorder() {
        return capitalorder;
    }

    /**
     * 设置出资顺序
     *
     * @param capitalorder 出资顺序
     */
    public void setCapitalorder(String capitalorder) {
        this.capitalorder = capitalorder;
    }

    /**
     * 获取兜底比例，不能>1
     *
     * @return badDebtPayPropt - 兜底比例，不能>1
     */
    public BigDecimal getBaddebtpaypropt() {
        return baddebtpaypropt;
    }

    /**
     * 设置兜底比例，不能>1
     *
     * @param baddebtpaypropt 兜底比例，不能>1
     */
    public void setBaddebtpaypropt(BigDecimal baddebtpaypropt) {
        this.baddebtpaypropt = baddebtpaypropt;
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
     * 获取每月资金方对商户的放款额度
     *
     * @return monthlyAmount - 每月资金方对商户的放款额度
     */
    public BigDecimal getMonthlyamount() {
        return monthlyamount;
    }

    /**
     * 设置每月资金方对商户的放款额度
     *
     * @param monthlyamount 每月资金方对商户的放款额度
     */
    public void setMonthlyamount(BigDecimal monthlyamount) {
        this.monthlyamount = monthlyamount;
    }
}