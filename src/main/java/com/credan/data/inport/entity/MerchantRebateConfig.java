package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_rebate_config")
public class MerchantRebateConfig {
    /**
     * 唯一ID
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 商户所在城市
     */
    @Column(name = "merchant_city")
    private String merchantCity;

    /**
     * 商户名称
     */
    @Column(name = "mercahnt_name")
    private String mercahntName;

    /**
     * 返点比例
     */
    private BigDecimal rebate;

    /**
     * 状态 有效：ENABLED、无效：DISABLED
     */
    private String status;

    /**
     * 备注
     */
    private String memo;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "update_by")
    private String updateBy;

    /**
     * 获取唯一ID
     *
     * @return id - 唯一ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商户id
     *
     * @return merchant_id - 商户id
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户id
     *
     * @param merchantId 商户id
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取商户所在城市
     *
     * @return merchant_city - 商户所在城市
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * 设置商户所在城市
     *
     * @param merchantCity 商户所在城市
     */
    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    /**
     * 获取商户名称
     *
     * @return mercahnt_name - 商户名称
     */
    public String getMercahntName() {
        return mercahntName;
    }

    /**
     * 设置商户名称
     *
     * @param mercahntName 商户名称
     */
    public void setMercahntName(String mercahntName) {
        this.mercahntName = mercahntName;
    }

    /**
     * 获取返点比例
     *
     * @return rebate - 返点比例
     */
    public BigDecimal getRebate() {
        return rebate;
    }

    /**
     * 设置返点比例
     *
     * @param rebate 返点比例
     */
    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    /**
     * 获取状态 有效：ENABLED、无效：DISABLED
     *
     * @return status - 状态 有效：ENABLED、无效：DISABLED
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 有效：ENABLED、无效：DISABLED
     *
     * @param status 状态 有效：ENABLED、无效：DISABLED
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}