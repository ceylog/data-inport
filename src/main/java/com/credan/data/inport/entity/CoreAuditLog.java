package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_audit_log")
public class CoreAuditLog {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "LX")
    private String lx;

    @Column(name = "JB")
    private String jb;

    @Column(name = "FSSJ")
    private Date fssj;

    @Column(name = "JLSJ")
    private Date jlsj;

    @Column(name = "YHID")
    private String yhid;

    @Column(name = "YHXM")
    private String yhxm;

    @Column(name = "DN")
    private String dn;

    @Column(name = "IP")
    private String ip;

    @Column(name = "MAC")
    private String mac;

    @Column(name = "MC")
    private String mc;

    @Column(name = "XX")
    private String xx;

    @Column(name = "CW")
    private String cw;

    @Column(name = "YWCX")
    private String ywcx;

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
     * @return LX
     */
    public String getLx() {
        return lx;
    }

    /**
     * @param lx
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    /**
     * @return JB
     */
    public String getJb() {
        return jb;
    }

    /**
     * @param jb
     */
    public void setJb(String jb) {
        this.jb = jb;
    }

    /**
     * @return FSSJ
     */
    public Date getFssj() {
        return fssj;
    }

    /**
     * @param fssj
     */
    public void setFssj(Date fssj) {
        this.fssj = fssj;
    }

    /**
     * @return JLSJ
     */
    public Date getJlsj() {
        return jlsj;
    }

    /**
     * @param jlsj
     */
    public void setJlsj(Date jlsj) {
        this.jlsj = jlsj;
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
     * @return YHXM
     */
    public String getYhxm() {
        return yhxm;
    }

    /**
     * @param yhxm
     */
    public void setYhxm(String yhxm) {
        this.yhxm = yhxm;
    }

    /**
     * @return DN
     */
    public String getDn() {
        return dn;
    }

    /**
     * @param dn
     */
    public void setDn(String dn) {
        this.dn = dn;
    }

    /**
     * @return IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return MAC
     */
    public String getMac() {
        return mac;
    }

    /**
     * @param mac
     */
    public void setMac(String mac) {
        this.mac = mac;
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
     * @return XX
     */
    public String getXx() {
        return xx;
    }

    /**
     * @param xx
     */
    public void setXx(String xx) {
        this.xx = xx;
    }

    /**
     * @return CW
     */
    public String getCw() {
        return cw;
    }

    /**
     * @param cw
     */
    public void setCw(String cw) {
        this.cw = cw;
    }

    /**
     * @return YWCX
     */
    public String getYwcx() {
        return ywcx;
    }

    /**
     * @param ywcx
     */
    public void setYwcx(String ywcx) {
        this.ywcx = ywcx;
    }
}