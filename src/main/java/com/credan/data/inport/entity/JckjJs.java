package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_js")
public class JckjJs {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "BH")
    private String bh;

    @Column(name = "MC")
    private String mc;

    @Column(name = "SM")
    private String sm;

    @Column(name = "SC")
    private Byte sc;

    /**
     * @return ID
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
     * @return BH
     */
    public String getBh() {
        return bh;
    }

    /**
     * @param bh
     */
    public void setBh(String bh) {
        this.bh = bh;
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
     * @return SM
     */
    public String getSm() {
        return sm;
    }

    /**
     * @param sm
     */
    public void setSm(String sm) {
        this.sm = sm;
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