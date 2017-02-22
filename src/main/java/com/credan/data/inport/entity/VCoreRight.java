package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_core_right")
public class VCoreRight {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "MC")
    private String mc;

    @Column(name = "SPELL")
    private String spell;

    @Column(name = "XCODE")
    private String xcode;

    @Column(name = "RTYPE")
    private String rtype;

    @Column(name = "PID")
    private String pid;

    @Column(name = "RDESC")
    private String rdesc;

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
     * @return SPELL
     */
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * @return XCODE
     */
    public String getXcode() {
        return xcode;
    }

    /**
     * @param xcode
     */
    public void setXcode(String xcode) {
        this.xcode = xcode;
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

    /**
     * @return PID
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return RDESC
     */
    public String getRdesc() {
        return rdesc;
    }

    /**
     * @param rdesc
     */
    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }
}