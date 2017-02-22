package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "user_call_log")
public class UserCallLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 呼入号码
     */
    @Column(name = "call_in_num")
    private String callInNum;

    /**
     * 呼入总时间
     */
    @Column(name = "call_in_time_count")
    private String callInTimeCount;

    /**
     * 呼入时间
     */
    @Column(name = "call_in_time")
    private String callInTime;

    /**
     * 呼入数量
     */
    @Column(name = "call_in_count")
    private String callInCount;

    /**
     * 关键字
     */
    private String key;

    /**
     * 呼叫类型
     */
    @Column(name = "call_type")
    private String callType;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取呼入号码
     *
     * @return call_in_num - 呼入号码
     */
    public String getCallInNum() {
        return callInNum;
    }

    /**
     * 设置呼入号码
     *
     * @param callInNum 呼入号码
     */
    public void setCallInNum(String callInNum) {
        this.callInNum = callInNum;
    }

    /**
     * 获取呼入总时间
     *
     * @return call_in_time_count - 呼入总时间
     */
    public String getCallInTimeCount() {
        return callInTimeCount;
    }

    /**
     * 设置呼入总时间
     *
     * @param callInTimeCount 呼入总时间
     */
    public void setCallInTimeCount(String callInTimeCount) {
        this.callInTimeCount = callInTimeCount;
    }

    /**
     * 获取呼入时间
     *
     * @return call_in_time - 呼入时间
     */
    public String getCallInTime() {
        return callInTime;
    }

    /**
     * 设置呼入时间
     *
     * @param callInTime 呼入时间
     */
    public void setCallInTime(String callInTime) {
        this.callInTime = callInTime;
    }

    /**
     * 获取呼入数量
     *
     * @return call_in_count - 呼入数量
     */
    public String getCallInCount() {
        return callInCount;
    }

    /**
     * 设置呼入数量
     *
     * @param callInCount 呼入数量
     */
    public void setCallInCount(String callInCount) {
        this.callInCount = callInCount;
    }

    /**
     * 获取关键字
     *
     * @return key - 关键字
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置关键字
     *
     * @param key 关键字
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取呼叫类型
     *
     * @return call_type - 呼叫类型
     */
    public String getCallType() {
        return callType;
    }

    /**
     * 设置呼叫类型
     *
     * @param callType 呼叫类型
     */
    public void setCallType(String callType) {
        this.callType = callType;
    }
}