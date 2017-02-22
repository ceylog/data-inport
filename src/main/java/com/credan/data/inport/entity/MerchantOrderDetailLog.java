package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_order_detail_log")
public class MerchantOrderDetailLog {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商户ID
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 商户申请的订单编号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 订单名称
     */
    private String name;

    /**
     * 订单类型
     */
    private String type;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 订单金额
     */
    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 申请期数
     */
    private Long term;

    /**
     * 期数单位（M/D）
     */
    private String unit;

    /**
     * 商品数量
     */
    private Long count;

    /**
     * 订单描述
     */
    private String remarks;

    /**
     * 扩展字段
     */
    private String ext;

    /**
     * 备注字段
     */
    private String memo;

    /**
     * 删除标识（0、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 数据来源
     */
    private String source;

    private String token;

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
     * 获取商户ID
     *
     * @return merchant_id - 商户ID
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户ID
     *
     * @param merchantId 商户ID
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取商户申请的订单编号
     *
     * @return order_id - 商户申请的订单编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置商户申请的订单编号
     *
     * @param orderId 商户申请的订单编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取订单名称
     *
     * @return name - 订单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置订单名称
     *
     * @param name 订单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取订单类型
     *
     * @return type - 订单类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置订单类型
     *
     * @param type 订单类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取订单金额
     *
     * @return order_amount - 订单金额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单金额
     *
     * @param orderAmount 订单金额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取申请期数
     *
     * @return term - 申请期数
     */
    public Long getTerm() {
        return term;
    }

    /**
     * 设置申请期数
     *
     * @param term 申请期数
     */
    public void setTerm(Long term) {
        this.term = term;
    }

    /**
     * 获取期数单位（M/D）
     *
     * @return unit - 期数单位（M/D）
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置期数单位（M/D）
     *
     * @param unit 期数单位（M/D）
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取商品数量
     *
     * @return count - 商品数量
     */
    public Long getCount() {
        return count;
    }

    /**
     * 设置商品数量
     *
     * @param count 商品数量
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 获取订单描述
     *
     * @return remarks - 订单描述
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置订单描述
     *
     * @param remarks 订单描述
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取扩展字段
     *
     * @return ext - 扩展字段
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展字段
     *
     * @param ext 扩展字段
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * 获取备注字段
     *
     * @return memo - 备注字段
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注字段
     *
     * @param memo 备注字段
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取删除标识（0、1：已删除）
     *
     * @return del_flag - 删除标识（0、1：已删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0、1：已删除）
     *
     * @param delFlag 删除标识（0、1：已删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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
     * 获取数据来源
     *
     * @return source - 数据来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置数据来源
     *
     * @param source 数据来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }
}