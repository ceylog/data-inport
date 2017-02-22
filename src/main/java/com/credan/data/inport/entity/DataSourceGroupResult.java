package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_source_group_result")
public class DataSourceGroupResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 分类（黑名单：BLACK_LIST）
     */
    @Column(name = "group_type")
    private String groupType;

    /**
     * 调用状态（成功：SUCCES、失败：FAIL、异常：EXCEPTION）
     */
    @Column(name = "call_status")
    private String callStatus;

    /**
     * 回调状态
     */
    @Column(name = "call_back_status")
    private String callBackStatus;

    /**
     * 总数据源数量
     */
    @Column(name = "total_index")
    private Integer totalIndex;

    /**
     * 调用结束执行数据源总数
     */
    @Column(name = "end_index")
    private Integer endIndex;

    /**
     * 最后一个执行的数据源ID
     */
    @Column(name = "end_datasource_id")
    private Long endDatasourceId;

    private String memo;

    @Column(name = "created_time")
    private Date createdTime;

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
     * 获取分类（黑名单：BLACK_LIST）
     *
     * @return group_type - 分类（黑名单：BLACK_LIST）
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * 设置分类（黑名单：BLACK_LIST）
     *
     * @param groupType 分类（黑名单：BLACK_LIST）
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * 获取调用状态（成功：SUCCES、失败：FAIL、异常：EXCEPTION）
     *
     * @return call_status - 调用状态（成功：SUCCES、失败：FAIL、异常：EXCEPTION）
     */
    public String getCallStatus() {
        return callStatus;
    }

    /**
     * 设置调用状态（成功：SUCCES、失败：FAIL、异常：EXCEPTION）
     *
     * @param callStatus 调用状态（成功：SUCCES、失败：FAIL、异常：EXCEPTION）
     */
    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    /**
     * 获取回调状态
     *
     * @return call_back_status - 回调状态
     */
    public String getCallBackStatus() {
        return callBackStatus;
    }

    /**
     * 设置回调状态
     *
     * @param callBackStatus 回调状态
     */
    public void setCallBackStatus(String callBackStatus) {
        this.callBackStatus = callBackStatus;
    }

    /**
     * 获取总数据源数量
     *
     * @return total_index - 总数据源数量
     */
    public Integer getTotalIndex() {
        return totalIndex;
    }

    /**
     * 设置总数据源数量
     *
     * @param totalIndex 总数据源数量
     */
    public void setTotalIndex(Integer totalIndex) {
        this.totalIndex = totalIndex;
    }

    /**
     * 获取调用结束执行数据源总数
     *
     * @return end_index - 调用结束执行数据源总数
     */
    public Integer getEndIndex() {
        return endIndex;
    }

    /**
     * 设置调用结束执行数据源总数
     *
     * @param endIndex 调用结束执行数据源总数
     */
    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    /**
     * 获取最后一个执行的数据源ID
     *
     * @return end_datasource_id - 最后一个执行的数据源ID
     */
    public Long getEndDatasourceId() {
        return endDatasourceId;
    }

    /**
     * 设置最后一个执行的数据源ID
     *
     * @param endDatasourceId 最后一个执行的数据源ID
     */
    public void setEndDatasourceId(Long endDatasourceId) {
        this.endDatasourceId = endDatasourceId;
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