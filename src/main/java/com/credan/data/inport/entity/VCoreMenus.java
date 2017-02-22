package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_core_menus")
public class VCoreMenus {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "XTID")
    private String xtid;

    @Column(name = "MC")
    private String mc;

    @Column(name = "SM")
    private String sm;

    @Column(name = "TB")
    private String tb;

    @Column(name = "FZBH")
    private Double fzbh;

    @Column(name = "PXBH")
    private Double pxbh;

    @Column(name = "CDLX")
    private Double cdlx;

    @Column(name = "SC")
    private Byte sc;

    @Column(name = "ZXLX")
    private Double zxlx;

    @Column(name = "SJID")
    private String sjid;

    @Column(name = "MS")
    private Long ms;

    @Column(name = "ZXFF")
    private String zxff;

    @Column(name = "ZXCS")
    private String zxcs;

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
     * @return XTID
     */
    public String getXtid() {
        return xtid;
    }

    /**
     * @param xtid
     */
    public void setXtid(String xtid) {
        this.xtid = xtid;
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
     * @return FZBH
     */
    public Double getFzbh() {
        return fzbh;
    }

    /**
     * @param fzbh
     */
    public void setFzbh(Double fzbh) {
        this.fzbh = fzbh;
    }

    /**
     * @return PXBH
     */
    public Double getPxbh() {
        return pxbh;
    }

    /**
     * @param pxbh
     */
    public void setPxbh(Double pxbh) {
        this.pxbh = pxbh;
    }

    /**
     * @return CDLX
     */
    public Double getCdlx() {
        return cdlx;
    }

    /**
     * @param cdlx
     */
    public void setCdlx(Double cdlx) {
        this.cdlx = cdlx;
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
     * @return ZXLX
     */
    public Double getZxlx() {
        return zxlx;
    }

    /**
     * @param zxlx
     */
    public void setZxlx(Double zxlx) {
        this.zxlx = zxlx;
    }

    /**
     * @return SJID
     */
    public String getSjid() {
        return sjid;
    }

    /**
     * @param sjid
     */
    public void setSjid(String sjid) {
        this.sjid = sjid;
    }

    /**
     * @return MS
     */
    public Long getMs() {
        return ms;
    }

    /**
     * @param ms
     */
    public void setMs(Long ms) {
        this.ms = ms;
    }

    /**
     * @return ZXFF
     */
    public String getZxff() {
        return zxff;
    }

    /**
     * @param zxff
     */
    public void setZxff(String zxff) {
        this.zxff = zxff;
    }

    /**
     * @return ZXCS
     */
    public String getZxcs() {
        return zxcs;
    }

    /**
     * @param zxcs
     */
    public void setZxcs(String zxcs) {
        this.zxcs = zxcs;
    }
}