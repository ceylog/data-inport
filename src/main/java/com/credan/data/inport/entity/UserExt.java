package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_ext")
public class UserExt {
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 0：用户能够使用闪电贷，1：用户已经用过闪电贷
     */
    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private String memo;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

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
     * 获取0：用户能够使用闪电贷，1：用户已经用过闪电贷
     *
     * @return ext1 - 0：用户能够使用闪电贷，1：用户已经用过闪电贷
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * 设置0：用户能够使用闪电贷，1：用户已经用过闪电贷
     *
     * @param ext1 0：用户能够使用闪电贷，1：用户已经用过闪电贷
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
     * @return ext5
     */
    public String getExt5() {
        return ext5;
    }

    /**
     * @param ext5
     */
    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
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