package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_sqlfiles")
public class CoreSqlfiles {
    @Id
    @Column(name = "SQLFILE_ID")
    private String sqlfileId;

    @Column(name = "SQLFILE_DS")
    private String sqlfileDs;

    @Column(name = "SQLFILE_URL")
    private String sqlfileUrl;

    @Column(name = "SQLFILE_STOP")
    private Double sqlfileStop;

    @Column(name = "SQLFILE_SYS")
    private String sqlfileSys;

    @Column(name = "SQLFILE_REMARK")
    private String sqlfileRemark;

    /**
     * @return SQLFILE_ID
     */
    public String getSqlfileId() {
        return sqlfileId;
    }

    /**
     * @param sqlfileId
     */
    public void setSqlfileId(String sqlfileId) {
        this.sqlfileId = sqlfileId;
    }

    /**
     * @return SQLFILE_DS
     */
    public String getSqlfileDs() {
        return sqlfileDs;
    }

    /**
     * @param sqlfileDs
     */
    public void setSqlfileDs(String sqlfileDs) {
        this.sqlfileDs = sqlfileDs;
    }

    /**
     * @return SQLFILE_URL
     */
    public String getSqlfileUrl() {
        return sqlfileUrl;
    }

    /**
     * @param sqlfileUrl
     */
    public void setSqlfileUrl(String sqlfileUrl) {
        this.sqlfileUrl = sqlfileUrl;
    }

    /**
     * @return SQLFILE_STOP
     */
    public Double getSqlfileStop() {
        return sqlfileStop;
    }

    /**
     * @param sqlfileStop
     */
    public void setSqlfileStop(Double sqlfileStop) {
        this.sqlfileStop = sqlfileStop;
    }

    /**
     * @return SQLFILE_SYS
     */
    public String getSqlfileSys() {
        return sqlfileSys;
    }

    /**
     * @param sqlfileSys
     */
    public void setSqlfileSys(String sqlfileSys) {
        this.sqlfileSys = sqlfileSys;
    }

    /**
     * @return SQLFILE_REMARK
     */
    public String getSqlfileRemark() {
        return sqlfileRemark;
    }

    /**
     * @param sqlfileRemark
     */
    public void setSqlfileRemark(String sqlfileRemark) {
        this.sqlfileRemark = sqlfileRemark;
    }
}