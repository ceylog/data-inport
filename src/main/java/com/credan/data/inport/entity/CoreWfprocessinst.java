package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "core_wfprocessinst")
public class CoreWfprocessinst {
    @Id
    @Column(name = "PROCESSINSTID")
    private String processinstid;

    @Column(name = "PROCESSINSTNAME")
    private String processinstname;

    @Column(name = "CREATEMAN")
    private String createman;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "CURRENTSTATE")
    private String currentstate;

    @Column(name = "PRIORITY")
    private Double priority;

    @Column(name = "STARTTIME")
    private Date starttime;

    @Column(name = "ENDTIME")
    private Date endtime;

    @Column(name = "REMINDTIME")
    private Date remindtime;

    @Column(name = "FINALTIME")
    private Date finaltime;

    @Column(name = "PARENTPROCID")
    private String parentprocid;

    @Column(name = "PARENTACTID")
    private String parentactid;

    @Column(name = "ISTIMEOUT")
    private String istimeout;

    @Column(name = "CID")
    private String cid;

    @Column(name = "PROCESSDEFID")
    private String processdefid;

    @Column(name = "CREATEMAN_NAME")
    private String createmanName;

    @Column(name = "TIMEOUT")
    private BigDecimal timeout;

    @Column(name = "PROCESSINSTDESC")
    private String processinstdesc;

    @Column(name = "RELATEDATA")
    private String relatedata;

    @Column(name = "PROCESSDEFDATA")
    private String processdefdata;

    /**
     * @return PROCESSINSTID
     */
    public String getProcessinstid() {
        return processinstid;
    }

    /**
     * @param processinstid
     */
    public void setProcessinstid(String processinstid) {
        this.processinstid = processinstid;
    }

    /**
     * @return PROCESSINSTNAME
     */
    public String getProcessinstname() {
        return processinstname;
    }

    /**
     * @param processinstname
     */
    public void setProcessinstname(String processinstname) {
        this.processinstname = processinstname;
    }

    /**
     * @return CREATEMAN
     */
    public String getCreateman() {
        return createman;
    }

    /**
     * @param createman
     */
    public void setCreateman(String createman) {
        this.createman = createman;
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
     * @return CURRENTSTATE
     */
    public String getCurrentstate() {
        return currentstate;
    }

    /**
     * @param currentstate
     */
    public void setCurrentstate(String currentstate) {
        this.currentstate = currentstate;
    }

    /**
     * @return PRIORITY
     */
    public Double getPriority() {
        return priority;
    }

    /**
     * @param priority
     */
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    /**
     * @return STARTTIME
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return ENDTIME
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return REMINDTIME
     */
    public Date getRemindtime() {
        return remindtime;
    }

    /**
     * @param remindtime
     */
    public void setRemindtime(Date remindtime) {
        this.remindtime = remindtime;
    }

    /**
     * @return FINALTIME
     */
    public Date getFinaltime() {
        return finaltime;
    }

    /**
     * @param finaltime
     */
    public void setFinaltime(Date finaltime) {
        this.finaltime = finaltime;
    }

    /**
     * @return PARENTPROCID
     */
    public String getParentprocid() {
        return parentprocid;
    }

    /**
     * @param parentprocid
     */
    public void setParentprocid(String parentprocid) {
        this.parentprocid = parentprocid;
    }

    /**
     * @return PARENTACTID
     */
    public String getParentactid() {
        return parentactid;
    }

    /**
     * @param parentactid
     */
    public void setParentactid(String parentactid) {
        this.parentactid = parentactid;
    }

    /**
     * @return ISTIMEOUT
     */
    public String getIstimeout() {
        return istimeout;
    }

    /**
     * @param istimeout
     */
    public void setIstimeout(String istimeout) {
        this.istimeout = istimeout;
    }

    /**
     * @return CID
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return PROCESSDEFID
     */
    public String getProcessdefid() {
        return processdefid;
    }

    /**
     * @param processdefid
     */
    public void setProcessdefid(String processdefid) {
        this.processdefid = processdefid;
    }

    /**
     * @return CREATEMAN_NAME
     */
    public String getCreatemanName() {
        return createmanName;
    }

    /**
     * @param createmanName
     */
    public void setCreatemanName(String createmanName) {
        this.createmanName = createmanName;
    }

    /**
     * @return TIMEOUT
     */
    public BigDecimal getTimeout() {
        return timeout;
    }

    /**
     * @param timeout
     */
    public void setTimeout(BigDecimal timeout) {
        this.timeout = timeout;
    }

    /**
     * @return PROCESSINSTDESC
     */
    public String getProcessinstdesc() {
        return processinstdesc;
    }

    /**
     * @param processinstdesc
     */
    public void setProcessinstdesc(String processinstdesc) {
        this.processinstdesc = processinstdesc;
    }

    /**
     * @return RELATEDATA
     */
    public String getRelatedata() {
        return relatedata;
    }

    /**
     * @param relatedata
     */
    public void setRelatedata(String relatedata) {
        this.relatedata = relatedata;
    }

    /**
     * @return PROCESSDEFDATA
     */
    public String getProcessdefdata() {
        return processdefdata;
    }

    /**
     * @param processdefdata
     */
    public void setProcessdefdata(String processdefdata) {
        this.processdefdata = processdefdata;
    }
}