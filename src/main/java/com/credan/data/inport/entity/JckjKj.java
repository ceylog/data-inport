package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_kj")
public class JckjKj {
    @Id
    @Column(name = "JSID")
    private String jsid;

    @Id
    @Column(name = "CDID")
    private String cdid;

    @Id
    @Column(name = "BH")
    private String bh;

    @Column(name = "MC")
    private String mc;

    @Column(name = "BT")
    private String bt;

    @Column(name = "JY")
    private Byte jy;

    @Column(name = "YC")
    private Byte yc;

    @Column(name = "BX")
    private Byte bx;

    @Column(name = "LJ")
    private String lj;

    @Column(name = "CS")
    private String cs;

    /**
     * @return JSID
     */
    public String getJsid() {
        return jsid;
    }

    /**
     * @param jsid
     */
    public void setJsid(String jsid) {
        this.jsid = jsid;
    }

    /**
     * @return CDID
     */
    public String getCdid() {
        return cdid;
    }

    /**
     * @param cdid
     */
    public void setCdid(String cdid) {
        this.cdid = cdid;
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
     * @return BT
     */
    public String getBt() {
        return bt;
    }

    /**
     * @param bt
     */
    public void setBt(String bt) {
        this.bt = bt;
    }

    /**
     * @return JY
     */
    public Byte getJy() {
        return jy;
    }

    /**
     * @param jy
     */
    public void setJy(Byte jy) {
        this.jy = jy;
    }

    /**
     * @return YC
     */
    public Byte getYc() {
        return yc;
    }

    /**
     * @param yc
     */
    public void setYc(Byte yc) {
        this.yc = yc;
    }

    /**
     * @return BX
     */
    public Byte getBx() {
        return bx;
    }

    /**
     * @param bx
     */
    public void setBx(Byte bx) {
        this.bx = bx;
    }

    /**
     * @return LJ
     */
    public String getLj() {
        return lj;
    }

    /**
     * @param lj
     */
    public void setLj(String lj) {
        this.lj = lj;
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