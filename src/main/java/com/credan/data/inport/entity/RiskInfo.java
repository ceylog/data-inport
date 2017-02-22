package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "risk_info")
public class RiskInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "config_id")
    private String configId;

    /**
     * 批次编号
     */
    @Column(name = "apply_id")
    private String applyId;

    /**
     * 风控执行状态，PENDING:待处理、PROCESSING:处理中、FINISH处理完毕
     */
    @Column(name = "risk_status")
    private String riskStatus;

    /**
     * 调用规则的次数
     */
    @Column(name = "call_rules_count")
    private Long callRulesCount;

    /**
     * 调用规则的结果SUCCESS、FAIL
     */
    @Column(name = "call_rules_result")
    private String callRulesResult;

    /**
     * 备注
     */
    private String memo;

    private Long version;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

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
     * @return config_id
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * @param configId
     */
    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * 获取批次编号
     *
     * @return apply_id - 批次编号
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 设置批次编号
     *
     * @param applyId 批次编号
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取风控执行状态，PENDING:待处理、PROCESSING:处理中、FINISH处理完毕
     *
     * @return risk_status - 风控执行状态，PENDING:待处理、PROCESSING:处理中、FINISH处理完毕
     */
    public String getRiskStatus() {
        return riskStatus;
    }

    /**
     * 设置风控执行状态，PENDING:待处理、PROCESSING:处理中、FINISH处理完毕
     *
     * @param riskStatus 风控执行状态，PENDING:待处理、PROCESSING:处理中、FINISH处理完毕
     */
    public void setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
    }

    /**
     * 获取调用规则的次数
     *
     * @return call_rules_count - 调用规则的次数
     */
    public Long getCallRulesCount() {
        return callRulesCount;
    }

    /**
     * 设置调用规则的次数
     *
     * @param callRulesCount 调用规则的次数
     */
    public void setCallRulesCount(Long callRulesCount) {
        this.callRulesCount = callRulesCount;
    }

    /**
     * 获取调用规则的结果SUCCESS、FAIL
     *
     * @return call_rules_result - 调用规则的结果SUCCESS、FAIL
     */
    public String getCallRulesResult() {
        return callRulesResult;
    }

    /**
     * 设置调用规则的结果SUCCESS、FAIL
     *
     * @param callRulesResult 调用规则的结果SUCCESS、FAIL
     */
    public void setCallRulesResult(String callRulesResult) {
        this.callRulesResult = callRulesResult;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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