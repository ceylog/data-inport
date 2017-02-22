package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_hi_attachment")
public class ActHiAttachment {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "USER_ID_")
    private String userId;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "DESCRIPTION_")
    private String description;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "TASK_ID_")
    private String taskId;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "URL_")
    private String url;

    @Column(name = "CONTENT_ID_")
    private String contentId;

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
     * @return DESCRIPTION_
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return URL_
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return CONTENT_ID_
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * @param contentId
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
}