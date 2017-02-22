package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_messages_class")
public class CoreMessagesClass {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    @Column(name = "MC")
    private String mc;

    @Column(name = "SC")
    private Byte sc;

    /**
     * @return ID
     */
    public Double getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Double id) {
        this.id = id;
    }

    /**
     * @return MC
     */
    public String getMc() {
        return mc;
    }

    /**
     * @param mc
     */
    public void setMc(String mc) {
        this.mc = mc;
    }

    /**
     * @return SC
     */
    public Byte getSc() {
        return sc;
    }

    /**
     * @param sc
     */
    public void setSc(Byte sc) {
        this.sc = sc;
    }
}