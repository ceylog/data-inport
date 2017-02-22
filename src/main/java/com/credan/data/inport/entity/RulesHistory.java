package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rules_history")
public class RulesHistory {
    @Id
    @Column(name = "tranx_id")
    private Integer tranxId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "project_id")
    private String projectId;

    @Column(name = "version_id")
    private String versionId;

    /**
     * rule name
     */
    @Column(name = "rule_code")
    private String ruleCode;

    @Column(name = "rule_score")
    private Integer ruleScore;

    @Column(name = "rule_desc")
    private String ruleDesc;

    /**
     * 1.EarlyFraud
2.Fraud
3.ScoreCard
     */
    @Column(name = "risk_system_code")
    private Integer riskSystemCode;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * @return tranx_id
     */
    public Integer getTranxId() {
        return tranxId;
    }

    /**
     * @param tranxId
     */
    public void setTranxId(Integer tranxId) {
        this.tranxId = tranxId;
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

    /**
     * @return version_id
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * @param versionId
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * 获取rule name
     *
     * @return rule_code - rule name
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置rule name
     *
     * @param ruleCode rule name
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    /**
     * @return rule_score
     */
    public Integer getRuleScore() {
        return ruleScore;
    }

    /**
     * @param ruleScore
     */
    public void setRuleScore(Integer ruleScore) {
        this.ruleScore = ruleScore;
    }

    /**
     * @return rule_desc
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    /**
     * @param ruleDesc
     */
    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    /**
     * 获取1.EarlyFraud
2.Fraud
3.ScoreCard
     *
     * @return risk_system_code - 1.EarlyFraud
2.Fraud
3.ScoreCard
     */
    public Integer getRiskSystemCode() {
        return riskSystemCode;
    }

    /**
     * 设置1.EarlyFraud
2.Fraud
3.ScoreCard
     *
     * @param riskSystemCode 1.EarlyFraud
2.Fraud
3.ScoreCard
     */
    public void setRiskSystemCode(Integer riskSystemCode) {
        this.riskSystemCode = riskSystemCode;
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