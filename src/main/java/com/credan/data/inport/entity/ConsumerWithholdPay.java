package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "consumer_withhold_pay")
public class ConsumerWithholdPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 代扣的方式1：连连代扣，2：新浪代扣
     */
    @Column(name = "pay_way")
    private Integer payWay;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    /**
     * 连连代扣的协议号
     */
    @Column(name = "no_agree")
    private String noAgree;

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
     * 获取代扣的方式1：连连代扣，2：新浪代扣
     *
     * @return pay_way - 代扣的方式1：连连代扣，2：新浪代扣
     */
    public Integer getPayWay() {
        return payWay;
    }

    /**
     * 设置代扣的方式1：连连代扣，2：新浪代扣
     *
     * @param payWay 代扣的方式1：连连代扣，2：新浪代扣
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
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
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @return ext1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * @param ext1
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * @return ext2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * @param ext2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    /**
     * @return ext3
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * @param ext3
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    /**
     * @return ext4
     */
    public String getExt4() {
        return ext4;
    }

    /**
     * @param ext4
     */
    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    /**
     * 获取连连代扣的协议号
     *
     * @return no_agree - 连连代扣的协议号
     */
    public String getNoAgree() {
        return noAgree;
    }

    /**
     * 设置连连代扣的协议号
     *
     * @param noAgree 连连代扣的协议号
     */
    public void setNoAgree(String noAgree) {
        this.noAgree = noAgree;
    }
}