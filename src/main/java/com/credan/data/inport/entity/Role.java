package com.credan.data.inport.entity;

import javax.persistence.Id;
import java.util.Date;

public class Role {
    /**
     * 亂數產生
     */
    @Id
    private String roleid;

    /**
     * 角色代碼
     */
    private String code;

    /**
     * 角色名稱
     */
    private String label;

    private Date createddate;

    private String createdby;

    private Date lastmodifieddate;

    private String lastmodifiedby;

    /**
     * 获取亂數產生
     *
     * @return roleid - 亂數產生
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 设置亂數產生
     *
     * @param roleid 亂數產生
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取角色代碼
     *
     * @return code - 角色代碼
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置角色代碼
     *
     * @param code 角色代碼
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取角色名稱
     *
     * @return label - 角色名稱
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置角色名稱
     *
     * @param label 角色名稱
     */
    public void setLabel(String label) {
        this.label = label;
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