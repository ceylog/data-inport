package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "_city")
public class City {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "STATE_ID")
    private String stateId;

    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SORT_ID")
    private Byte sortId;

    /**
     * @return ID
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
     * @return STATE_ID
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * @param stateId
     */
    public void setStateId(String stateId) {
        this.stateId = stateId;
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
     * @return NAME
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
     * @return SORT_ID
     */
    public Byte getSortId() {
        return sortId;
    }

    /**
     * @param sortId
     */
    public void setSortId(Byte sortId) {
        this.sortId = sortId;
    }
}