package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "data_source")
public class DataSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "provider_name")
    private String providerName;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "created_time")
    private Date createdTime;

    private String endpoint;

    /**
     * use values 0.0 - 1.0
     */
    private BigDecimal weight;

    @Column(name = "parent_id")
    private Integer parentId;

    private Boolean active;

    private Boolean required;

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
     * @return provider_name
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * @param providerName
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * @return last_updated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * 获取use values 0.0 - 1.0
     *
     * @return weight - use values 0.0 - 1.0
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置use values 0.0 - 1.0
     *
     * @param weight use values 0.0 - 1.0
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * @param required
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }
}