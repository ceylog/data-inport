package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_provider_score")
public class UserProviderScore {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Id
    @Column(name = "datasource_id")
    private Integer datasourceId;

    private Integer score;

    @Column(name = "error_code")
    private Integer errorCode;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "date_created")
    private Date dateCreated;

    private Boolean active;

    @Column(name = "report_id")
    private String reportId;

    @Column(name = "device_id")
    private String deviceId;

    /**
     * 0:failed、1:success
     */
    @Column(name = "callback_status")
    private Boolean callbackStatus;

    @Column(name = "called_times")
    private Integer calledTimes;

    /**
     * service provider 的原始数据
     */
    @Column(name = "raw_data")
    private String rawData;

    @Column(name = "hit_rules")
    private String hitRules;

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
     * @return datasource_id
     */
    public Integer getDatasourceId() {
        return datasourceId;
    }

    /**
     * @param datasourceId
     */
    public void setDatasourceId(Integer datasourceId) {
        this.datasourceId = datasourceId;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return error_code
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
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

    /**
     * @return date_created
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return report_id
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * @param reportId
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * @return device_id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取0:failed、1:success
     *
     * @return callback_status - 0:failed、1:success
     */
    public Boolean getCallbackStatus() {
        return callbackStatus;
    }

    /**
     * 设置0:failed、1:success
     *
     * @param callbackStatus 0:failed、1:success
     */
    public void setCallbackStatus(Boolean callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    /**
     * @return called_times
     */
    public Integer getCalledTimes() {
        return calledTimes;
    }

    /**
     * @param calledTimes
     */
    public void setCalledTimes(Integer calledTimes) {
        this.calledTimes = calledTimes;
    }

    /**
     * 获取service provider 的原始数据
     *
     * @return raw_data - service provider 的原始数据
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * 设置service provider 的原始数据
     *
     * @param rawData service provider 的原始数据
     */
    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    /**
     * @return hit_rules
     */
    public String getHitRules() {
        return hitRules;
    }

    /**
     * @param hitRules
     */
    public void setHitRules(String hitRules) {
        this.hitRules = hitRules;
    }
}