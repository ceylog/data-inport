package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_user_params")
public class CoreUserParams {
    @Column(name = "XTID")
    private String xtid;

    @Column(name = "BH")
    private String bh;

    @Column(name = "YHID")
    private String yhid;

    @Column(name = "ZDBH")
    private String zdbh;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "PZZ")
    private String pzz;

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
     * @return YHID
     */
    public String getYhid() {
        return yhid;
    }

    /**
     * @param yhid
     */
    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    /**
     * @return ZDBH
     */
    public String getZdbh() {
        return zdbh;
    }

    /**
     * @param zdbh
     */
    public void setZdbh(String zdbh) {
        this.zdbh = zdbh;
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

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
     * @return PZZ
     */
    public String getPzz() {
        return pzz;
    }

    /**
     * @param pzz
     */
    public void setPzz(String pzz) {
        this.pzz = pzz;
    }
}