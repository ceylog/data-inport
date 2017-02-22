package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_address")
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    private String longitude;

    private String latitude;

    /**
     * 有可能会把省、市邮编等分离出来
     */
    private String address;

    /**
     * 启用状态:1,启用; 0,未启用
     */
    private Integer active;

    /**
     * addr_type=0:入职时间；
addr_type=1:居住时间
     */
    @Column(name = "live_time")
    private String liveTime;

    /**
     * 产品类型：0：商品贷；1：现金贷；
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * default:0:work place;
1: residential address;

     */
    @Column(name = "addr_type")
    private Integer addrType;

    private String province;

    private String city;

    private String district;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取有可能会把省、市邮编等分离出来
     *
     * @return address - 有可能会把省、市邮编等分离出来
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置有可能会把省、市邮编等分离出来
     *
     * @param address 有可能会把省、市邮编等分离出来
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取启用状态:1,启用; 0,未启用
     *
     * @return active - 启用状态:1,启用; 0,未启用
     */
    public Integer getActive() {
        return active;
    }

    /**
     * 设置启用状态:1,启用; 0,未启用
     *
     * @param active 启用状态:1,启用; 0,未启用
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * 获取addr_type=0:入职时间；
addr_type=1:居住时间
     *
     * @return live_time - addr_type=0:入职时间；
addr_type=1:居住时间
     */
    public String getLiveTime() {
        return liveTime;
    }

    /**
     * 设置addr_type=0:入职时间；
addr_type=1:居住时间
     *
     * @param liveTime addr_type=0:入职时间；
addr_type=1:居住时间
     */
    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
    }

    /**
     * 获取产品类型：0：商品贷；1：现金贷；
     *
     * @return product_type - 产品类型：0：商品贷；1：现金贷；
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置产品类型：0：商品贷；1：现金贷；
     *
     * @param productType 产品类型：0：商品贷；1：现金贷；
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取default:0:work place;
1: residential address;

     *
     * @return addr_type - default:0:work place;
1: residential address;

     */
    public Integer getAddrType() {
        return addrType;
    }

    /**
     * 设置default:0:work place;
1: residential address;

     *
     * @param addrType default:0:work place;
1: residential address;

     */
    public void setAddrType(Integer addrType) {
        this.addrType = addrType;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
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
}