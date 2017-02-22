package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_keys")
public class MerchantKeys {
    @Id
    @Column(name = "merchant_id")
    private Integer merchantId;

    @Id
    @Column(name = "app_id")
    private String appId;

    @Column(name = "secret_key")
    private String secretKey;

    private Boolean active;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "created_time")
    private Date createdTime;

    /**
     * @return merchant_id
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * @param merchantId
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * @return app_id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * @return secret_key
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
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
}