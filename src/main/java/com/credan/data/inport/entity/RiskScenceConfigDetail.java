package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "risk_scence_config_detail")
public class RiskScenceConfigDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 方案配置ID
     */
    @Column(name = "config_id")
    private String configId;

    /**
     * 风控元素
     */
    @Column(name = "risk_id")
    private String riskId;

    private Integer sort;

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
     * 获取方案配置ID
     *
     * @return config_id - 方案配置ID
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * 设置方案配置ID
     *
     * @param configId 方案配置ID
     */
    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * 获取风控元素
     *
     * @return risk_id - 风控元素
     */
    public String getRiskId() {
        return riskId;
    }

    /**
     * 设置风控元素
     *
     * @param riskId 风控元素
     */
    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}