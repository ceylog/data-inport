package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "capital_partner")
public class CapitalPartner {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String active;

    @Column(name = "date_updated")
    private Date dateUpdated;

    @Column(name = "need_confirmation")
    private byte[] needConfirmation;

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
     * @return name
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
     * @return active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return date_updated
     */
    public Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * @param dateUpdated
     */
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * @return need_confirmation
     */
    public byte[] getNeedConfirmation() {
        return needConfirmation;
    }

    /**
     * @param needConfirmation
     */
    public void setNeedConfirmation(byte[] needConfirmation) {
        this.needConfirmation = needConfirmation;
    }
}