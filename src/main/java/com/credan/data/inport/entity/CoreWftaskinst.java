package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_wftaskinst")
public class CoreWftaskinst {
    @Id
    @Column(name = "TASKINSTID")
    private String taskinstid;

    @Column(name = "TASKNAME")
    private String taskname;

    @Column(name = "CURRENTSTATE")
    private String currentstate;

    @Column(name = "PARTICIPANTID")
    private String participantid;

    @Column(name = "PARTICIPANTNAME")
    private String participantname;

    @Column(name = "PARTICIPANTTYPE")
    private String participanttype;

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

    @Column(name = "ACTINSTID")
    private String actinstid;

    @Column(name = "PROCESSINSTID")
    private String processinstid;

    @Column(name = "A_CURRENTSTATE")
    private String aCurrentstate;

    @Column(name = "P_CURRENTSTATE")
    private String pCurrentstate;

    @Column(name = "PROCESSDEFID")
    private String processdefid;

    @Column(name = "ACTIVITYDEFID")
    private String activitydefid;

    @Column(name = "PRIORITY")
    private Double priority;

    @Column(name = "EXTEND1")
    private String extend1;

    @Column(name = "EXTEND2")
    private String extend2;

    @Column(name = "EXTEND3")
    private String extend3;

    @Column(name = "EXTEND4")
    private String extend4;

    @Column(name = "EXTEND5")
    private String extend5;

    @Column(name = "EXTEND6")
    private String extend6;

    @Column(name = "EXTEND7")
    private String extend7;

    @Column(name = "TASKDESC")
    private String taskdesc;

    @Column(name = "EXECUTORID")
    private String executorid;

    @Column(name = "EXTEND8")
    private String extend8;

    @Column(name = "EXTEND9")
    private String extend9;

    /**
     * @return TASKINSTID
     */
    public String getTaskinstid() {
        return taskinstid;
    }

    /**
     * @param taskinstid
     */
    public void setTaskinstid(String taskinstid) {
        this.taskinstid = taskinstid;
    }

    /**
     * @return TASKNAME
     */
    public String getTaskname() {
        return taskname;
    }

    /**
     * @param taskname
     */
    public void setTaskname(String taskname) {
        this.taskname = taskname;
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
     * @return PARTICIPANTID
     */
    public String getParticipantid() {
        return participantid;
    }

    /**
     * @param participantid
     */
    public void setParticipantid(String participantid) {
        this.participantid = participantid;
    }

    /**
     * @return PARTICIPANTNAME
     */
    public String getParticipantname() {
        return participantname;
    }

    /**
     * @param participantname
     */
    public void setParticipantname(String participantname) {
        this.participantname = participantname;
    }

    /**
     * @return PARTICIPANTTYPE
     */
    public String getParticipanttype() {
        return participanttype;
    }

    /**
     * @param participanttype
     */
    public void setParticipanttype(String participanttype) {
        this.participanttype = participanttype;
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
     * @return A_CURRENTSTATE
     */
    public String getaCurrentstate() {
        return aCurrentstate;
    }

    /**
     * @param aCurrentstate
     */
    public void setaCurrentstate(String aCurrentstate) {
        this.aCurrentstate = aCurrentstate;
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
     * @return EXTEND1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * @param extend1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    /**
     * @return EXTEND2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * @param extend2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    /**
     * @return EXTEND3
     */
    public String getExtend3() {
        return extend3;
    }

    /**
     * @param extend3
     */
    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    /**
     * @return EXTEND4
     */
    public String getExtend4() {
        return extend4;
    }

    /**
     * @param extend4
     */
    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

    /**
     * @return EXTEND5
     */
    public String getExtend5() {
        return extend5;
    }

    /**
     * @param extend5
     */
    public void setExtend5(String extend5) {
        this.extend5 = extend5;
    }

    /**
     * @return EXTEND6
     */
    public String getExtend6() {
        return extend6;
    }

    /**
     * @param extend6
     */
    public void setExtend6(String extend6) {
        this.extend6 = extend6;
    }

    /**
     * @return EXTEND7
     */
    public String getExtend7() {
        return extend7;
    }

    /**
     * @param extend7
     */
    public void setExtend7(String extend7) {
        this.extend7 = extend7;
    }

    /**
     * @return TASKDESC
     */
    public String getTaskdesc() {
        return taskdesc;
    }

    /**
     * @param taskdesc
     */
    public void setTaskdesc(String taskdesc) {
        this.taskdesc = taskdesc;
    }

    /**
     * @return EXECUTORID
     */
    public String getExecutorid() {
        return executorid;
    }

    /**
     * @param executorid
     */
    public void setExecutorid(String executorid) {
        this.executorid = executorid;
    }

    /**
     * @return EXTEND8
     */
    public String getExtend8() {
        return extend8;
    }

    /**
     * @param extend8
     */
    public void setExtend8(String extend8) {
        this.extend8 = extend8;
    }

    /**
     * @return EXTEND9
     */
    public String getExtend9() {
        return extend9;
    }

    /**
     * @param extend9
     */
    public void setExtend9(String extend9) {
        this.extend9 = extend9;
    }
}