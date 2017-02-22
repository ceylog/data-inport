package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_jscd")
public class JckjJscd {
    @Id
    @Column(name = "JSID")
    private String jsid;

    @Id
    @Column(name = "CDID")
    private String cdid;

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
}