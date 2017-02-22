package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_org")
public class JckjOrg {
    @Id
    @Column(name = "DEPTID")
    private Double deptid;

    @Column(name = "DEPTNAME")
    private String deptname;

    @Column(name = "SPELL")
    private String spell;

    @Column(name = "DEPTCODE")
    private String deptcode;

    @Column(name = "P_DEPTID")
    private Double pDeptid;

    @Column(name = "DTYPE")
    private String dtype;

    @Column(name = "DSTATUS")
    private String dstatus;

    /**
     * @return DEPTID
     */
    public Double getDeptid() {
        return deptid;
    }

    /**
     * @param deptid
     */
    public void setDeptid(Double deptid) {
        this.deptid = deptid;
    }

    /**
     * @return DEPTNAME
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * @param deptname
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
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
     * @return DEPTCODE
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * @param deptcode
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    /**
     * @return P_DEPTID
     */
    public Double getpDeptid() {
        return pDeptid;
    }

    /**
     * @param pDeptid
     */
    public void setpDeptid(Double pDeptid) {
        this.pDeptid = pDeptid;
    }

    /**
     * @return DTYPE
     */
    public String getDtype() {
        return dtype;
    }

    /**
     * @param dtype
     */
    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    /**
     * @return DSTATUS
     */
    public String getDstatus() {
        return dstatus;
    }

    /**
     * @param dstatus
     */
    public void setDstatus(String dstatus) {
        this.dstatus = dstatus;
    }
}