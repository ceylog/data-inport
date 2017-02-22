package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_yhxx")
public class JckjYhxx {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "BH")
    private String bh;

    @Column(name = "XM")
    private String xm;

    @Column(name = "MM")
    private String mm;

    @Column(name = "SC")
    private Byte sc;

    @Column(name = "TY")
    private Byte ty;

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
     * @return XM
     */
    public String getXm() {
        return xm;
    }

    /**
     * @param xm
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * @return MM
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param mm
     */
    public void setMm(String mm) {
        this.mm = mm;
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

    /**
     * @return TY
     */
    public Byte getTy() {
        return ty;
    }

    /**
     * @param ty
     */
    public void setTy(Byte ty) {
        this.ty = ty;
    }
}