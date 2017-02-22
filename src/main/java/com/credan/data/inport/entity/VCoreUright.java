package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_core_uright")
public class VCoreUright {
    @Column(name = "UGUID")
    private String uguid;

    @Column(name = "RGUID")
    private String rguid;

    @Column(name = "RCODE")
    private String rcode;

    @Column(name = "RTYPE")
    private String rtype;

    /**
     * @return UGUID
     */
    public String getUguid() {
        return uguid;
    }

    /**
     * @param uguid
     */
    public void setUguid(String uguid) {
        this.uguid = uguid;
    }

    /**
     * @return RGUID
     */
    public String getRguid() {
        return rguid;
    }

    /**
     * @param rguid
     */
    public void setRguid(String rguid) {
        this.rguid = rguid;
    }

    /**
     * @return RCODE
     */
    public String getRcode() {
        return rcode;
    }

    /**
     * @param rcode
     */
    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    /**
     * @return RTYPE
     */
    public String getRtype() {
        return rtype;
    }

    /**
     * @param rtype
     */
    public void setRtype(String rtype) {
        this.rtype = rtype;
    }
}