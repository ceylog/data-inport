package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_re_model")
public class ActReModel {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "KEY_")
    private String key;

    @Column(name = "CATEGORY_")
    private String category;

    @Column(name = "CREATE_TIME_")
    private Date createTime;

    @Column(name = "LAST_UPDATE_TIME_")
    private Date lastUpdateTime;

    @Column(name = "VERSION_")
    private Integer version;

    @Column(name = "META_INFO_")
    private String metaInfo;

    @Column(name = "DEPLOYMENT_ID_")
    private String deploymentId;

    @Column(name = "EDITOR_SOURCE_VALUE_ID_")
    private String editorSourceValueId;

    @Column(name = "EDITOR_SOURCE_EXTRA_VALUE_ID_")
    private String editorSourceExtraValueId;

    @Column(name = "TENANT_ID_")
    private String tenantId;

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
     * @return KEY_
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return CATEGORY_
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
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
     * @return LAST_UPDATE_TIME_
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return VERSION_
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return META_INFO_
     */
    public String getMetaInfo() {
        return metaInfo;
    }

    /**
     * @param metaInfo
     */
    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
    }

    /**
     * @return DEPLOYMENT_ID_
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * @param deploymentId
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * @return EDITOR_SOURCE_VALUE_ID_
     */
    public String getEditorSourceValueId() {
        return editorSourceValueId;
    }

    /**
     * @param editorSourceValueId
     */
    public void setEditorSourceValueId(String editorSourceValueId) {
        this.editorSourceValueId = editorSourceValueId;
    }

    /**
     * @return EDITOR_SOURCE_EXTRA_VALUE_ID_
     */
    public String getEditorSourceExtraValueId() {
        return editorSourceExtraValueId;
    }

    /**
     * @param editorSourceExtraValueId
     */
    public void setEditorSourceExtraValueId(String editorSourceExtraValueId) {
        this.editorSourceExtraValueId = editorSourceExtraValueId;
    }

    /**
     * @return TENANT_ID_
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}