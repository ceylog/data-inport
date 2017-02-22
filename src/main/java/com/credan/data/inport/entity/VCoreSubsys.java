package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_core_subsys")
public class VCoreSubsys {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "BH")
    private String bh;

    @Column(name = "MC")
    private String mc;

    @Column(name = "SC")
    private Byte sc;

    @Column(name = "LX")
    private Double lx;

    @Column(name = "TB")
    private String tb;

    @Column(name = "XTLB")
    private String xtlb;

    @Column(name = "TY")
    private Byte ty;

    @Column(name = "SM")
    private String sm;

    @Column(name = "TB2")
    private String tb2;

    @Column(name = "KSFF")
    private String ksff;

    @Column(name = "QDFF")
    private String qdff;

    @Column(name = "JSFF")
    private String jsff;

    @Column(name = "TCFF")
    private String tcff;

    @Column(name = "MB")
    private String mb;

    @Column(name = "CS")
    private String cs;

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
     * @return LX
     */
    public Double getLx() {
        return lx;
    }

    /**
     * @param lx
     */
    public void setLx(Double lx) {
        this.lx = lx;
    }

    /**
     * @return TB
     */
    public String getTb() {
        return tb;
    }

    /**
     * @param tb
     */
    public void setTb(String tb) {
        this.tb = tb;
    }

    /**
     * @return XTLB
     */
    public String getXtlb() {
        return xtlb;
    }

    /**
     * @param xtlb
     */
    public void setXtlb(String xtlb) {
        this.xtlb = xtlb;
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
     * @return TB2
     */
    public String getTb2() {
        return tb2;
    }

    /**
     * @param tb2
     */
    public void setTb2(String tb2) {
        this.tb2 = tb2;
    }

    /**
     * @return KSFF
     */
    public String getKsff() {
        return ksff;
    }

    /**
     * @param ksff
     */
    public void setKsff(String ksff) {
        this.ksff = ksff;
    }

    /**
     * @return QDFF
     */
    public String getQdff() {
        return qdff;
    }

    /**
     * @param qdff
     */
    public void setQdff(String qdff) {
        this.qdff = qdff;
    }

    /**
     * @return JSFF
     */
    public String getJsff() {
        return jsff;
    }

    /**
     * @param jsff
     */
    public void setJsff(String jsff) {
        this.jsff = jsff;
    }

    /**
     * @return TCFF
     */
    public String getTcff() {
        return tcff;
    }

    /**
     * @param tcff
     */
    public void setTcff(String tcff) {
        this.tcff = tcff;
    }

    /**
     * @return MB
     */
    public String getMb() {
        return mb;
    }

    /**
     * @param mb
     */
    public void setMb(String mb) {
        this.mb = mb;
    }

    /**
     * @return CS
     */
    public String getCs() {
        return cs;
    }

    /**
     * @param cs
     */
    public void setCs(String cs) {
        this.cs = cs;
    }
}