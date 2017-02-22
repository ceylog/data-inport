package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "_state_province")
public class StateProvince {
    @Id
    @Column(name = "STATE_CODE")
    private String stateCode;

    @Id
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SORT")
    private Integer sort;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "STATE_LABEL")
    private String stateLabel;

    /**
     * @return STATE_CODE
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return COUNTRY_CODE
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return DESCRIPTION
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
     * @return SORT
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return ACTIVE
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
     * @return STATE_LABEL
     */
    public String getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel
     */
    public void setStateLabel(String stateLabel) {
        this.stateLabel = stateLabel;
    }
}