package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_jsjs")
public class JckjJsjs {
    @Id
    @Column(name = "JSJS")
    private String jsjs;

    @Id
    @Column(name = "JSID")
    private String jsid;

    /**
     * @return JSJS
     */
    public String getJsjs() {
        return jsjs;
    }

    /**
     * @param jsjs
     */
    public void setJsjs(String jsjs) {
        this.jsjs = jsjs;
    }

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
}