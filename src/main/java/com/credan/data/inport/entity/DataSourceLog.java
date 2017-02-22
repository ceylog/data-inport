package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_source_log")
public class DataSourceLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "datasource_id")
    private Integer datasourceId;

    @Column(name = "datasource_name")
    private String datasourceName;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "call_url")
    private String callUrl;

    /**
     * 是否是异常日志
     */
    private String exception;

    @Column(name = "created_time")
    private Date createdTime;

    private String param;

    private String result;

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
     * @return datasource_name
     */
    public String getDatasourceName() {
        return datasourceName;
    }

    /**
     * @param datasourceName
     */
    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
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
     * @return call_url
     */
    public String getCallUrl() {
        return callUrl;
    }

    /**
     * @param callUrl
     */
    public void setCallUrl(String callUrl) {
        this.callUrl = callUrl;
    }

    /**
     * 获取是否是异常日志
     *
     * @return exception - 是否是异常日志
     */
    public String getException() {
        return exception;
    }

    /**
     * 设置是否是异常日志
     *
     * @param exception 是否是异常日志
     */
    public void setException(String exception) {
        this.exception = exception;
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
     * @return param
     */
    public String getParam() {
        return param;
    }

    /**
     * @param param
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }
}