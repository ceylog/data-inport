package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_re_deployment")
public class ActReDeployment {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "CATEGORY_")
    private String category;

    @Column(name = "TENANT_ID_")
    private String tenantId;

    @Column(name = "DEPLOY_TIME_")
    private Date deployTime;

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

    /**
     * @return DEPLOY_TIME_
     */
    public Date getDeployTime() {
        return deployTime;
    }

    /**
     * @param deployTime
     */
    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }
}