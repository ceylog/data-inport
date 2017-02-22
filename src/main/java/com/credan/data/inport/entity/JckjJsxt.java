package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_jsxt")
public class JckjJsxt {
    @Id
    @Column(name = "JSID")
    private String jsid;

    @Id
    @Column(name = "XTID")
    private String xtid;

    @Column(name = "PXBH")
    private Double pxbh;

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
}