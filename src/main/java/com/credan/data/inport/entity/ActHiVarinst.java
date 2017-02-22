package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_hi_varinst")
public class ActHiVarinst {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "EXECUTION_ID_")
    private String executionId;

    @Column(name = "TASK_ID_")
    private String taskId;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "VAR_TYPE_")
    private String varType;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "BYTEARRAY_ID_")
    private String bytearrayId;

    @Column(name = "DOUBLE_")
    private Double double1;

    @Column(name = "LONG_")
    private Long long1;

    @Column(name = "TEXT_")
    private String text;

    @Column(name = "TEXT2_")
    private String text2;

    @Column(name = "CREATE_TIME_")
    private Date createTime;

    @Column(name = "LAST_UPDATED_TIME_")
    private Date lastUpdatedTime;

    /**
     * @return ID_
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
     * @return PROC_INST_ID_
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    /**
     * @return EXECUTION_ID_
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * @param executionId
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * @return TASK_ID_
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return NAME_
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return VAR_TYPE_
     */
    public String getVarType() {
        return varType;
    }

    /**
     * @param varType
     */
    public void setVarType(String varType) {
        this.varType = varType;
    }

    /**
     * @return REV_
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * @param rev
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    /**
     * @return BYTEARRAY_ID_
     */
    public String getBytearrayId() {
        return bytearrayId;
    }

    /**
     * @param bytearrayId
     */
    public void setBytearrayId(String bytearrayId) {
        this.bytearrayId = bytearrayId;
    }

    /**
     * @return DOUBLE_
     */
    public Double getDouble1() {
        return double1;
    }

    /**
     * @param double1
     */
    public void setDouble(Double double1) {
        this.double1 = double1;
    }

    /**
     * @return LONG_
     */
    public Long getLong1() {
        return long1;
    }

    /**
     * @param long1
     */
    public void setLong(Long long1) {
        this.long1 = long1;
    }

    /**
     * @return TEXT_
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return TEXT2_
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }

    /**
     * @return CREATE_TIME_
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
     * @return LAST_UPDATED_TIME_
     */
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * @param lastUpdatedTime
     */
    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}