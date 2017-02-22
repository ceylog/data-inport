package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_kjan_kjfs")
public class JckjKjanKjfs {
    @Id
    @Column(name = "CDID")
    private String cdid;

    @Id
    @Column(name = "KMC")
    private String kmc;

    @Column(name = "LJ")
    private String lj;

    @Column(name = "MC")
    private String mc;

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
     * @return KMC
     */
    public String getKmc() {
        return kmc;
    }

    /**
     * @param kmc
     */
    public void setKmc(String kmc) {
        this.kmc = kmc;
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
}