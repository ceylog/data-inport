package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "core_wfactivityinst")
public class CoreWfactivityinst {
    @Id
    @Column(name = "ACTINSTID")
    private String actinstid;

    @Column(name = "ACTNAME")
    private String actname;

    @Column(name = "CURRENTSTATE")
    private String currentstate;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "STARTTIME")
    private Date starttime;

    @Column(name = "ENDTIME")
    private Date endtime;

    @Column(name = "REMINDTIME")
    private Date remindtime;

    @Column(name = "FINALTIME")
    private Date finaltime;

    @Column(name = "ISTIMEOUT")
    private String istimeout;

    @Column(name = "CID")
    private String cid;

    @Column(name = "PROCESSINSTID")
    private String processinstid;

    @Column(name = "SUBPROCESSINSTID")
    private String subprocessinstid;

    @Column(name = "PRIORITY")
    private Double priority;

    @Column(name = "P_CURRENTSTATE")
    private String pCurrentstate;

    @Column(name = "PROCESSDEFID")
    private String processdefid;

    @Column(name = "ACTIVITYDEFID")
    private String activitydefid;

    @Column(name = "TASKNUM_START")
    private Double tasknumStart;

    @Column(name = "TIMEOUT")
    private BigDecimal timeout;

    @Column(name = "ACTDESC")
    private String actdesc;

    @Column(name = "FIN_POINT")
    private String finPoint;

    /**
     * @return ACTINSTID
     */
    public String getActinstid() {
        return actinstid;
    }

    /**
     * @param actinstid
     */
    public void setActinstid(String actinstid) {
        this.actinstid = actinstid;
    }

    /**
     * @return ACTNAME
     */
    public String getActname() {
        return actname;
    }

    /**
     * @param actname
     */
    public void setActname(String actname) {
        this.actname = actname;
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
     * @return SUBPROCESSINSTID
     */
    public String getSubprocessinstid() {
        return subprocessinstid;
    }

    /**
     * @param subprocessinstid
     */
    public void setSubprocessinstid(String subprocessinstid) {
        this.subprocessinstid = subprocessinstid;
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
     * @return P_CURRENTSTATE
     */
    public String getpCurrentstate() {
        return pCurrentstate;
    }

    /**
     * @param pCurrentstate
     */
    public void setpCurrentstate(String pCurrentstate) {
        this.pCurrentstate = pCurrentstate;
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
     * @return ACTIVITYDEFID
     */
    public String getActivitydefid() {
        return activitydefid;
    }

    /**
     * @param activitydefid
     */
    public void setActivitydefid(String activitydefid) {
        this.activitydefid = activitydefid;
    }

    /**
     * @return TASKNUM_START
     */
    public Double getTasknumStart() {
        return tasknumStart;
    }

    /**
     * @param tasknumStart
     */
    public void setTasknumStart(Double tasknumStart) {
        this.tasknumStart = tasknumStart;
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
     * @return ACTDESC
     */
    public String getActdesc() {
        return actdesc;
    }

    /**
     * @param actdesc
     */
    public void setActdesc(String actdesc) {
        this.actdesc = actdesc;
    }

    /**
     * @return FIN_POINT
     */
    public String getFinPoint() {
        return finPoint;
    }

    /**
     * @param finPoint
     */
    public void setFinPoint(String finPoint) {
        this.finPoint = finPoint;
    }
}