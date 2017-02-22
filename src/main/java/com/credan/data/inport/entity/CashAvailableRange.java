package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cash_available_range")
public class CashAvailableRange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 限制区域范围
     */
    private String range;

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
     * 获取限制区域范围
     *
     * @return range - 限制区域范围
     */
    public String getRange() {
        return range;
    }

    /**
     * 设置限制区域范围
     *
     * @param range 限制区域范围
     */
    public void setRange(String range) {
        this.range = range;
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