package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "all_ids")
public class AllIds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * values such as user, merchant, capital_partner, transaction, bank_account
     */
    @Column(name = "asset_type")
    private String assetType;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "last_updated")
    private Date lastUpdated;

    private Boolean active;

    private String prefix;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取values such as user, merchant, capital_partner, transaction, bank_account
     *
     * @return asset_type - values such as user, merchant, capital_partner, transaction, bank_account
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * 设置values such as user, merchant, capital_partner, transaction, bank_account
     *
     * @param assetType values such as user, merchant, capital_partner, transaction, bank_account
     */
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * @return created_on
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
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
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}