package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_hi_comment")
public class ActHiComment {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "TIME_")
    private Date time;

    @Column(name = "USER_ID_")
    private String userId;

    @Column(name = "TASK_ID_")
    private String taskId;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "ACTION_")
    private String action;

    @Column(name = "MESSAGE_")
    private String message;

    @Column(name = "FULL_MSG_")
    private byte[] fullMsg;

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
     * @return TIME_
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
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

    /**
     * @return ACTION_
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return MESSAGE_
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return FULL_MSG_
     */
    public byte[] getFullMsg() {
        return fullMsg;
    }

    /**
     * @param fullMsg
     */
    public void setFullMsg(byte[] fullMsg) {
        this.fullMsg = fullMsg;
    }
}