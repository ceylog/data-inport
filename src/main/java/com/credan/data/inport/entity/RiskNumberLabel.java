package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "risk_number_label")
public class RiskNumberLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 电话号码
     */
    private String number;

    /**
     * 标记
     */
    private String label;

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
     * 获取电话号码
     *
     * @return number - 电话号码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置电话号码
     *
     * @param number 电话号码
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取标记
     *
     * @return label - 标记
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标记
     *
     * @param label 标记
     */
    public void setLabel(String label) {
        this.label = label;
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
}