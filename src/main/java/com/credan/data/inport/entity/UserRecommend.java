package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_recommend")
public class UserRecommend {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 推荐码
     */
    private String code;

    /**
     * 上线推荐人
     */
    private String referrer;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 积分
     */
    private BigDecimal score;

    /**
     * 邀请人数
     */
    @Column(name = "ref_count")
    private Integer refCount;

    /**
     * 等级
     */
    private Integer level;

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
     * 获取推荐码
     *
     * @return code - 推荐码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置推荐码
     *
     * @param code 推荐码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取上线推荐人
     *
     * @return referrer - 上线推荐人
     */
    public String getReferrer() {
        return referrer;
    }

    /**
     * 设置上线推荐人
     *
     * @param referrer 上线推荐人
     */
    public void setReferrer(String referrer) {
        this.referrer = referrer;
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
     * 获取积分
     *
     * @return score - 积分
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * 设置积分
     *
     * @param score 积分
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * 获取邀请人数
     *
     * @return ref_count - 邀请人数
     */
    public Integer getRefCount() {
        return refCount;
    }

    /**
     * 设置邀请人数
     *
     * @param refCount 邀请人数
     */
    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }

    /**
     * 获取等级
     *
     * @return level - 等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置等级
     *
     * @param level 等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}