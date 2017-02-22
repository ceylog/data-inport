package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "juxinli_log")
public class JuxinliLog {
    /**
     * 唯一ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 请求参数
     */
    @Column(name = "REQUEST")
    private String request;

    /**
     * 响应结果
     */
    @Column(name = "RESPONSE")
    private String response;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 数据源编码
     */
    @Column(name = "DATA_SOURCE")
    private Integer dataSource;

    /**
     * 状态0：默认值、1：请求成功、2：请求失败
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 获取唯一ID
     *
     * @return ID - 唯一ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户
     *
     * @return USER_ID - 用户
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户
     *
     * @param userId 用户
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取请求参数
     *
     * @return REQUEST - 请求参数
     */
    public String getRequest() {
        return request;
    }

    /**
     * 设置请求参数
     *
     * @param request 请求参数
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * 获取响应结果
     *
     * @return RESPONSE - 响应结果
     */
    public String getResponse() {
        return response;
    }

    /**
     * 设置响应结果
     *
     * @param response 响应结果
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * @return CREATE_TIME
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
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取数据源编码
     *
     * @return DATA_SOURCE - 数据源编码
     */
    public Integer getDataSource() {
        return dataSource;
    }

    /**
     * 设置数据源编码
     *
     * @param dataSource 数据源编码
     */
    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取状态0：默认值、1：请求成功、2：请求失败
     *
     * @return STATUS - 状态0：默认值、1：请求成功、2：请求失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态0：默认值、1：请求成功、2：请求失败
     *
     * @param status 状态0：默认值、1：请求成功、2：请求失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}