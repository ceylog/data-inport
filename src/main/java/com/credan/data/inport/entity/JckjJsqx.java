package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_jsqx")
public class JckjJsqx {
    @Id
    @Column(name = "JSID")
    private String jsid;

    @Id
    @Column(name = "QXID")
    private String qxid;

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
     * @return QXID
     */
    public String getQxid() {
        return qxid;
    }

    /**
     * @param qxid
     */
    public void setQxid(String qxid) {
        this.qxid = qxid;
    }
}