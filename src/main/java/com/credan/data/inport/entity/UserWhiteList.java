package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_white_list")
public class UserWhiteList {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 0:无效、1：有效
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "created_time")
    private Date createdTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
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
     * 获取0:无效、1：有效
     *
     * @return del_flag - 0:无效、1：有效
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置0:无效、1：有效
     *
     * @param delFlag 0:无效、1：有效
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
}