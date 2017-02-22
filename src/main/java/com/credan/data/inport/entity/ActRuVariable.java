package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_ru_variable")
public class ActRuVariable {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "EXECUTION_ID_")
    private String executionId;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "TASK_ID_")
    private String taskId;

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
     * @return TYPE_
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
    public void setDouble1(Double double1) {
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
}