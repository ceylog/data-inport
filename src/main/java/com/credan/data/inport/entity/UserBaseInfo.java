package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_base_info")
public class UserBaseInfo {
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户状态
     */
    private byte[] status;

    /**
     * 提现次数
     */
    @Column(name = "withdraw_count")
    private Integer withdrawCount;

    /**
     * 等级
     */
    private String level;

    /**
     * 用户来源
     */
    private String source;

    private Long version;

    @Column(name = "create_date")
    private Date createDate;

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
     * 获取用户状态
     *
     * @return status - 用户状态
     */
    public byte[] getStatus() {
        return status;
    }

    /**
     * 设置用户状态
     *
     * @param status 用户状态
     */
    public void setStatus(byte[] status) {
        this.status = status;
    }

    /**
     * 获取提现次数
     *
     * @return withdraw_count - 提现次数
     */
    public Integer getWithdrawCount() {
        return withdrawCount;
    }

    /**
     * 设置提现次数
     *
     * @param withdrawCount 提现次数
     */
    public void setWithdrawCount(Integer withdrawCount) {
        this.withdrawCount = withdrawCount;
    }

    /**
     * 获取等级
     *
     * @return level - 等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置等级
     *
     * @param level 等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取用户来源
     *
     * @return source - 用户来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置用户来源
     *
     * @param source 用户来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
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