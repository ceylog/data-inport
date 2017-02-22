package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "risk_info_raw_data")
public class RiskInfoRawData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 流程ID
     */
    @Column(name = "apply_id")
    private String applyId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "info_id")
    private String infoId;

    /**
     * 风控元素ID
     */
    @Column(name = "risk_id")
    private String riskId;

    /**
     * 处理状态PENDING：待处理、PROCESSING：处理中、FINISH：处理完成
     */
    private String status;

    /**
     * 处理结果
     */
    @Column(name = "raw_data")
    private String rawData;

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
     * 获取流程ID
     *
     * @return apply_id - 流程ID
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 设置流程ID
     *
     * @param applyId 流程ID
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
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
     * @return info_id
     */
    public String getInfoId() {
        return infoId;
    }

    /**
     * @param infoId
     */
    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    /**
     * 获取风控元素ID
     *
     * @return risk_id - 风控元素ID
     */
    public String getRiskId() {
        return riskId;
    }

    /**
     * 设置风控元素ID
     *
     * @param riskId 风控元素ID
     */
    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    /**
     * 获取处理状态PENDING：待处理、PROCESSING：处理中、FINISH：处理完成
     *
     * @return status - 处理状态PENDING：待处理、PROCESSING：处理中、FINISH：处理完成
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置处理状态PENDING：待处理、PROCESSING：处理中、FINISH：处理完成
     *
     * @param status 处理状态PENDING：待处理、PROCESSING：处理中、FINISH：处理完成
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取处理结果
     *
     * @return raw_data - 处理结果
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * 设置处理结果
     *
     * @param rawData 处理结果
     */
    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
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