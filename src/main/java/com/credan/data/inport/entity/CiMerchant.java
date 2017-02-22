package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_merchant")
public class CiMerchant {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 工商注册名称
     */
    @Column(name = "reg_name")
    private String regName;

    /**
     * 商户名称
     */
    private String name;

    /**
     * 商户法人
     */
    private String owner;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 组织机构代码
     */
    private String code;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 状态(启用：ENABLED、禁用：DISABLE)
     */
    private String status;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 父ID
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 商户等级
     */
    private Integer level;

    /**
     * 最大额度
     */
    @Column(name = "max_amount")
    private BigDecimal maxAmount;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 银行卡号码
     */
    @Column(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 备注
     */
    private String memo;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "created_time")
    private Date createdTime;

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
     * 获取工商注册名称
     *
     * @return reg_name - 工商注册名称
     */
    public String getRegName() {
        return regName;
    }

    /**
     * 设置工商注册名称
     *
     * @param regName 工商注册名称
     */
    public void setRegName(String regName) {
        this.regName = regName;
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
     * 获取商户法人
     *
     * @return owner - 商户法人
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 设置商户法人
     *
     * @param owner 商户法人
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取组织机构代码
     *
     * @return code - 组织机构代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置组织机构代码
     *
     * @param code 组织机构代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取所在城市
     *
     * @return city - 所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在城市
     *
     * @param city 所在城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取状态(启用：ENABLED、禁用：DISABLE)
     *
     * @return status - 状态(启用：ENABLED、禁用：DISABLE)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态(启用：ENABLED、禁用：DISABLE)
     *
     * @param status 状态(启用：ENABLED、禁用：DISABLE)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取父ID
     *
     * @return parent_id - 父ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父ID
     *
     * @param parentId 父ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取商户等级
     *
     * @return level - 商户等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置商户等级
     *
     * @param level 商户等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取最大额度
     *
     * @return max_amount - 最大额度
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * 设置最大额度
     *
     * @param maxAmount 最大额度
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取银行卡号码
     *
     * @return bank_card_no - 银行卡号码
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 设置银行卡号码
     *
     * @param bankCardNo 银行卡号码
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * @return last_updated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}