package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "_district")
public class District {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SORT")
    private Byte sort;

    @Column(name = "ACTIVE")
    private Boolean active;

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
     * @return CITY_ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
     * @return SORT
     */
    public Byte getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Byte sort) {
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
}