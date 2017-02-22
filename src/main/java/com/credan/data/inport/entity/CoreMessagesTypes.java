package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_messages_types")
public class CoreMessagesTypes {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    @Column(name = "MC")
    private String mc;

    @Column(name = "TB")
    private String tb;

    @Column(name = "SC")
    private Byte sc;

    @Column(name = "LX")
    private Long lx;

    @Column(name = "HF")
    private Byte hf;

    @Column(name = "YWLX")
    private String ywlx;

    @Column(name = "FLBH")
    private String flbh;

    @Column(name = "GD")
    private Byte gd;

    @Column(name = "ZL")
    private String zl;

    @Column(name = "AN")
    private String an;

    @Column(name = "SCDQFF")
    private String scdqff;

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
    public Long getLx() {
        return lx;
    }

    /**
     * @param lx
     */
    public void setLx(Long lx) {
        this.lx = lx;
    }

    /**
     * @return HF
     */
    public Byte getHf() {
        return hf;
    }

    /**
     * @param hf
     */
    public void setHf(Byte hf) {
        this.hf = hf;
    }

    /**
     * @return YWLX
     */
    public String getYwlx() {
        return ywlx;
    }

    /**
     * @param ywlx
     */
    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }

    /**
     * @return FLBH
     */
    public String getFlbh() {
        return flbh;
    }

    /**
     * @param flbh
     */
    public void setFlbh(String flbh) {
        this.flbh = flbh;
    }

    /**
     * @return GD
     */
    public Byte getGd() {
        return gd;
    }

    /**
     * @param gd
     */
    public void setGd(Byte gd) {
        this.gd = gd;
    }

    /**
     * @return ZL
     */
    public String getZl() {
        return zl;
    }

    /**
     * @param zl
     */
    public void setZl(String zl) {
        this.zl = zl;
    }

    /**
     * @return AN
     */
    public String getAn() {
        return an;
    }

    /**
     * @param an
     */
    public void setAn(String an) {
        this.an = an;
    }

    /**
     * @return SCDQFF
     */
    public String getScdqff() {
        return scdqff;
    }

    /**
     * @param scdqff
     */
    public void setScdqff(String scdqff) {
        this.scdqff = scdqff;
    }
}