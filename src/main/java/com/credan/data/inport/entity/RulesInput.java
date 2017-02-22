package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rules_input")
public class RulesInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 前置参数
     */
    @Column(name = "early_fraud_input")
    private String earlyFraudInput;

    /**
     * 反欺诈参数
     */
    @Column(name = "fraud_input")
    private String fraudInput;

    /**
     * 决策引擎参数
     */
    @Column(name = "decision_input")
    private String decisionInput;

    @Column(name = "process_id")
    private String processId;

    private String response;

    @Column(name = "created_time")
    private Date createdTime;

    private String step;

    @Column(name = "project_id")
    private String projectId;

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
     * 获取前置参数
     *
     * @return early_fraud_input - 前置参数
     */
    public String getEarlyFraudInput() {
        return earlyFraudInput;
    }

    /**
     * 设置前置参数
     *
     * @param earlyFraudInput 前置参数
     */
    public void setEarlyFraudInput(String earlyFraudInput) {
        this.earlyFraudInput = earlyFraudInput;
    }

    /**
     * 获取反欺诈参数
     *
     * @return fraud_input - 反欺诈参数
     */
    public String getFraudInput() {
        return fraudInput;
    }

    /**
     * 设置反欺诈参数
     *
     * @param fraudInput 反欺诈参数
     */
    public void setFraudInput(String fraudInput) {
        this.fraudInput = fraudInput;
    }

    /**
     * 获取决策引擎参数
     *
     * @return decision_input - 决策引擎参数
     */
    public String getDecisionInput() {
        return decisionInput;
    }

    /**
     * 设置决策引擎参数
     *
     * @param decisionInput 决策引擎参数
     */
    public void setDecisionInput(String decisionInput) {
        this.decisionInput = decisionInput;
    }

    /**
     * @return process_id
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * @param processId
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /**
     * @return response
     */
    public String getResponse() {
        return response;
    }

    /**
     * @param response
     */
    public void setResponse(String response) {
        this.response = response;
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
     * @return step
     */
    public String getStep() {
        return step;
    }

    /**
     * @param step
     */
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * @return project_id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}