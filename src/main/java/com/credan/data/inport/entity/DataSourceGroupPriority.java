package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_source_group_priority")
public class DataSourceGroupPriority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 数据源ID
     */
    @Column(name = "datasource_id")
    private Long datasourceId;

    /**
     * 分组（黑名单：BLACK_LIST）
     */
    @Column(name = "group_type")
    private String groupType;

    /**
     * javaBean区分大小写
     */
    @Column(name = "java_bean")
    private String javaBean;

    /**
     * 方法  区分大小写
     */
    @Column(name = "java_method")
    private String javaMethod;

    /**
     * 优先级（数组越大优先级越高）
     */
    private Integer priority;

    /**
     * 是否需要回调（Y、N）
     */
    @Column(name = "call_back")
    private String callBack;

    /**
     * 什么情况下回调（SUCCESS、FAIL、EXCEPTION）
     */
    @Column(name = "call_back_flag")
    private String callBackFlag;

    /**
     * 成功之后调用的javabean
     */
    @Column(name = "call_back_java_bean")
    private String callBackJavaBean;

    /**
     * 成功之后调用的方法
     */
    @Column(name = "call_back_java_method")
    private String callBackJavaMethod;

    /**
     * 删除标识（0：有效、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 备注
     */
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
     * 获取数据源ID
     *
     * @return datasource_id - 数据源ID
     */
    public Long getDatasourceId() {
        return datasourceId;
    }

    /**
     * 设置数据源ID
     *
     * @param datasourceId 数据源ID
     */
    public void setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
    }

    /**
     * 获取分组（黑名单：BLACK_LIST）
     *
     * @return group_type - 分组（黑名单：BLACK_LIST）
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * 设置分组（黑名单：BLACK_LIST）
     *
     * @param groupType 分组（黑名单：BLACK_LIST）
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * 获取javaBean区分大小写
     *
     * @return java_bean - javaBean区分大小写
     */
    public String getJavaBean() {
        return javaBean;
    }

    /**
     * 设置javaBean区分大小写
     *
     * @param javaBean javaBean区分大小写
     */
    public void setJavaBean(String javaBean) {
        this.javaBean = javaBean;
    }

    /**
     * 获取方法  区分大小写
     *
     * @return java_method - 方法  区分大小写
     */
    public String getJavaMethod() {
        return javaMethod;
    }

    /**
     * 设置方法  区分大小写
     *
     * @param javaMethod 方法  区分大小写
     */
    public void setJavaMethod(String javaMethod) {
        this.javaMethod = javaMethod;
    }

    /**
     * 获取优先级（数组越大优先级越高）
     *
     * @return priority - 优先级（数组越大优先级越高）
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置优先级（数组越大优先级越高）
     *
     * @param priority 优先级（数组越大优先级越高）
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取是否需要回调（Y、N）
     *
     * @return call_back - 是否需要回调（Y、N）
     */
    public String getCallBack() {
        return callBack;
    }

    /**
     * 设置是否需要回调（Y、N）
     *
     * @param callBack 是否需要回调（Y、N）
     */
    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    /**
     * 获取什么情况下回调（SUCCESS、FAIL、EXCEPTION）
     *
     * @return call_back_flag - 什么情况下回调（SUCCESS、FAIL、EXCEPTION）
     */
    public String getCallBackFlag() {
        return callBackFlag;
    }

    /**
     * 设置什么情况下回调（SUCCESS、FAIL、EXCEPTION）
     *
     * @param callBackFlag 什么情况下回调（SUCCESS、FAIL、EXCEPTION）
     */
    public void setCallBackFlag(String callBackFlag) {
        this.callBackFlag = callBackFlag;
    }

    /**
     * 获取成功之后调用的javabean
     *
     * @return call_back_java_bean - 成功之后调用的javabean
     */
    public String getCallBackJavaBean() {
        return callBackJavaBean;
    }

    /**
     * 设置成功之后调用的javabean
     *
     * @param callBackJavaBean 成功之后调用的javabean
     */
    public void setCallBackJavaBean(String callBackJavaBean) {
        this.callBackJavaBean = callBackJavaBean;
    }

    /**
     * 获取成功之后调用的方法
     *
     * @return call_back_java_method - 成功之后调用的方法
     */
    public String getCallBackJavaMethod() {
        return callBackJavaMethod;
    }

    /**
     * 设置成功之后调用的方法
     *
     * @param callBackJavaMethod 成功之后调用的方法
     */
    public void setCallBackJavaMethod(String callBackJavaMethod) {
        this.callBackJavaMethod = callBackJavaMethod;
    }

    /**
     * 获取删除标识（0：有效、1：已删除）
     *
     * @return del_flag - 删除标识（0：有效、1：已删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0：有效、1：已删除）
     *
     * @param delFlag 删除标识（0：有效、1：已删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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