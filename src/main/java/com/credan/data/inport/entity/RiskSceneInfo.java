package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "risk_scene_info")
public class RiskSceneInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    /**
     * 风控状态，001：前置、010：反欺诈、100：决策
     */
    @Column(name = "risk_status")
    private byte[] riskStatus;

    /**
     * 方案状态0：无效、1：有效
     */
    private String stauts;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取风控状态，001：前置、010：反欺诈、100：决策
     *
     * @return risk_status - 风控状态，001：前置、010：反欺诈、100：决策
     */
    public byte[] getRiskStatus() {
        return riskStatus;
    }

    /**
     * 设置风控状态，001：前置、010：反欺诈、100：决策
     *
     * @param riskStatus 风控状态，001：前置、010：反欺诈、100：决策
     */
    public void setRiskStatus(byte[] riskStatus) {
        this.riskStatus = riskStatus;
    }

    /**
     * 获取方案状态0：无效、1：有效
     *
     * @return stauts - 方案状态0：无效、1：有效
     */
    public String getStauts() {
        return stauts;
    }

    /**
     * 设置方案状态0：无效、1：有效
     *
     * @param stauts 方案状态0：无效、1：有效
     */
    public void setStauts(String stauts) {
        this.stauts = stauts;
    }
}