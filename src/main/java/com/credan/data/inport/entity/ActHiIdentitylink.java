package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_hi_identitylink")
public class ActHiIdentitylink {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "GROUP_ID_")
    private String groupId;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "USER_ID_")
    private String userId;

    @Column(name = "TASK_ID_")
    private String taskId;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

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
     * @return GROUP_ID_
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
     * @return USER_ID_
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
}