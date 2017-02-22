package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_core_fright")
public class VCoreFright {
    @Column(name = "JSID")
    private String jsid;

    @Column(name = "BH")
    private String bh;

    @Column(name = "TYPE_NAME")
    private Long typeName;

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
     * @return TYPE_NAME
     */
    public Long getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(Long typeName) {
        this.typeName = typeName;
    }
}