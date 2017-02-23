package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_role")
public class AccountRole {
    @Id
    private String serid;

    private String accountid;

    private String roleid;

    private Date createddate;

    private String createdby;

    private Date lastmodifieddate;

    private String lastmodifiedby;

    /**
     * @return serid
     */
    public String getSerid() {
        return serid;
    }

    /**
     * @param serid
     */
    public void setSerid(String serid) {
        this.serid = serid;
    }

    /**
     * @return accountid
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * @param accountid
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    /**
     * @return roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * @return createddate
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * @param createddate
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * @return createdby
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * @param createdby
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * @return lastmodifieddate
     */
    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    /**
     * @param lastmodifieddate
     */
    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    /**
     * @return lastmodifiedby
     */
    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    /**
     * @param lastmodifiedby
     */
    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }
}