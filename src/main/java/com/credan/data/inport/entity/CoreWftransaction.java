package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_wftransaction")
public class CoreWftransaction {
    @Id
    @Column(name = "GUID")
    private String guid;

    @Column(name = "SRC_ACTINSTID")
    private String srcActinstid;

    @Column(name = "SRC_ACTDEFID")
    private String srcActdefid;

    @Column(name = "SRC_ACTDEFNAME")
    private String srcActdefname;

    @Column(name = "TARGET_ACTDEFID")
    private String targetActdefid;

    @Column(name = "TARGET_ACTDEFNAME")
    private String targetActdefname;

    @Column(name = "TARGET_ACTINSTID")
    private String targetActinstid;

    @Column(name = "PROCESSINSTID")
    private String processinstid;

    @Column(name = "PROCESSDEFID")
    private String processdefid;

    @Column(name = "CREATETIME")
    private Date createtime;

    /**
     * @return GUID
     */
    public String getGuid() {
        return guid;
    }

    /**
     * @param guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * @return SRC_ACTINSTID
     */
    public String getSrcActinstid() {
        return srcActinstid;
    }

    /**
     * @param srcActinstid
     */
    public void setSrcActinstid(String srcActinstid) {
        this.srcActinstid = srcActinstid;
    }

    /**
     * @return SRC_ACTDEFID
     */
    public String getSrcActdefid() {
        return srcActdefid;
    }

    /**
     * @param srcActdefid
     */
    public void setSrcActdefid(String srcActdefid) {
        this.srcActdefid = srcActdefid;
    }

    /**
     * @return SRC_ACTDEFNAME
     */
    public String getSrcActdefname() {
        return srcActdefname;
    }

    /**
     * @param srcActdefname
     */
    public void setSrcActdefname(String srcActdefname) {
        this.srcActdefname = srcActdefname;
    }

    /**
     * @return TARGET_ACTDEFID
     */
    public String getTargetActdefid() {
        return targetActdefid;
    }

    /**
     * @param targetActdefid
     */
    public void setTargetActdefid(String targetActdefid) {
        this.targetActdefid = targetActdefid;
    }

    /**
     * @return TARGET_ACTDEFNAME
     */
    public String getTargetActdefname() {
        return targetActdefname;
    }

    /**
     * @param targetActdefname
     */
    public void setTargetActdefname(String targetActdefname) {
        this.targetActdefname = targetActdefname;
    }

    /**
     * @return TARGET_ACTINSTID
     */
    public String getTargetActinstid() {
        return targetActinstid;
    }

    /**
     * @param targetActinstid
     */
    public void setTargetActinstid(String targetActinstid) {
        this.targetActinstid = targetActinstid;
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
}