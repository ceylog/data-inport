package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_weixin_info")
public class UserWeixinInfo {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 现金贷id，关联现金贷表
     */
    @Column(name = "cash_loan_id")
    private String cashLoanId;

    /**
     * 微信open_id
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 微信头像url
     */
    @Column(name = "avatar_pic")
    private String avatarPic;

    /**
     * 性别
     */
    private String sex;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    @Column(name = "union_id")
    private String unionId;

    /**
     * 城市
     */
    private String city;

    /**
     * 创建时间
     */
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
     * 获取现金贷id，关联现金贷表
     *
     * @return cash_loan_id - 现金贷id，关联现金贷表
     */
    public String getCashLoanId() {
        return cashLoanId;
    }

    /**
     * 设置现金贷id，关联现金贷表
     *
     * @param cashLoanId 现金贷id，关联现金贷表
     */
    public void setCashLoanId(String cashLoanId) {
        this.cashLoanId = cashLoanId;
    }

    /**
     * 获取微信open_id
     *
     * @return open_id - 微信open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信open_id
     *
     * @param openId 微信open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取微信头像url
     *
     * @return avatar_pic - 微信头像url
     */
    public String getAvatarPic() {
        return avatarPic;
    }

    /**
     * 设置微信头像url
     *
     * @param avatarPic 微信头像url
     */
    public void setAvatarPic(String avatarPic) {
        this.avatarPic = avatarPic;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return union_id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * @param unionId
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}