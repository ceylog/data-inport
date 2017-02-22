package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "ci_fund_allocation")
public class CiFundAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 匹配金额
     */
    @Column(name = "allot_amount")
    private Double allotAmount;

    /**
     * 偿还金额
     */
    @Column(name = "repaid_amount")
    private Double repaidAmount;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 分期项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    @Column(name = "agent_id")
    private String agentId;

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
     * 获取匹配金额
     *
     * @return allot_amount - 匹配金额
     */
    public Double getAllotAmount() {
        return allotAmount;
    }

    /**
     * 设置匹配金额
     *
     * @param allotAmount 匹配金额
     */
    public void setAllotAmount(Double allotAmount) {
        this.allotAmount = allotAmount;
    }

    /**
     * 获取偿还金额
     *
     * @return repaid_amount - 偿还金额
     */
    public Double getRepaidAmount() {
        return repaidAmount;
    }

    /**
     * 设置偿还金额
     *
     * @param repaidAmount 偿还金额
     */
    public void setRepaidAmount(Double repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

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
     * 获取分期项目ID
     *
     * @return project_id - 分期项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置分期项目ID
     *
     * @param projectId 分期项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return agent_id
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}