package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jckj_pzxx_minibar")
public class JckjPzxxMinibar {
    @Id
    @Column(name = "PZ_ID")
    private String pzId;

    @Column(name = "PZ_TYPE")
    private String pzType;

    @Column(name = "PZ_VALUE")
    private String pzValue;

    @Column(name = "CREATEMAN")
    private String createman;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "PZ_ORDER_NUM")
    private Double pzOrderNum;

    @Column(name = "PZ_GROUP")
    private String pzGroup;

    /**
     * @return PZ_ID
     */
    public String getPzId() {
        return pzId;
    }

    /**
     * @param pzId
     */
    public void setPzId(String pzId) {
        this.pzId = pzId;
    }

    /**
     * @return PZ_TYPE
     */
    public String getPzType() {
        return pzType;
    }

    /**
     * @param pzType
     */
    public void setPzType(String pzType) {
        this.pzType = pzType;
    }

    /**
     * @return PZ_VALUE
     */
    public String getPzValue() {
        return pzValue;
    }

    /**
     * @param pzValue
     */
    public void setPzValue(String pzValue) {
        this.pzValue = pzValue;
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
     * @return PZ_ORDER_NUM
     */
    public Double getPzOrderNum() {
        return pzOrderNum;
    }

    /**
     * @param pzOrderNum
     */
    public void setPzOrderNum(Double pzOrderNum) {
        this.pzOrderNum = pzOrderNum;
    }

    /**
     * @return PZ_GROUP
     */
    public String getPzGroup() {
        return pzGroup;
    }

    /**
     * @param pzGroup
     */
    public void setPzGroup(String pzGroup) {
        this.pzGroup = pzGroup;
    }
}