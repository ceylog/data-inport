package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_level_rule")
public class UserLevelRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 邀请人数积分转换率
     */
    @Column(name = "score_rate")
    private BigDecimal scoreRate;

    /**
     * 积分提现转换率
     */
    @Column(name = "cash_rate")
    private BigDecimal cashRate;

    /**
     * 积分兑换现金最低限制
     */
    private BigDecimal limit;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 预留1
     */
    private String ext1;

    /**
     * 预留二
     */
    private String ext2;

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

    /**
     * 获取邀请人数积分转换率
     *
     * @return score_rate - 邀请人数积分转换率
     */
    public BigDecimal getScoreRate() {
        return scoreRate;
    }

    /**
     * 设置邀请人数积分转换率
     *
     * @param scoreRate 邀请人数积分转换率
     */
    public void setScoreRate(BigDecimal scoreRate) {
        this.scoreRate = scoreRate;
    }

    /**
     * 获取积分提现转换率
     *
     * @return cash_rate - 积分提现转换率
     */
    public BigDecimal getCashRate() {
        return cashRate;
    }

    /**
     * 设置积分提现转换率
     *
     * @param cashRate 积分提现转换率
     */
    public void setCashRate(BigDecimal cashRate) {
        this.cashRate = cashRate;
    }

    /**
     * 获取积分兑换现金最低限制
     *
     * @return limit - 积分兑换现金最低限制
     */
    public BigDecimal getLimit() {
        return limit;
    }

    /**
     * 设置积分兑换现金最低限制
     *
     * @param limit 积分兑换现金最低限制
     */
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update_time - 最后更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取预留1
     *
     * @return ext1 - 预留1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * 设置预留1
     *
     * @param ext1 预留1
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * 获取预留二
     *
     * @return ext2 - 预留二
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * 设置预留二
     *
     * @param ext2 预留二
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }
}