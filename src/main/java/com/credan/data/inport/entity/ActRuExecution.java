package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_ru_execution")
public class ActRuExecution {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "PROC_INST_ID_")
    private String procInstId;

    @Column(name = "BUSINESS_KEY_")
    private String businessKey;

    @Column(name = "PARENT_ID_")
    private String parentId;

    @Column(name = "PROC_DEF_ID_")
    private String procDefId;

    @Column(name = "SUPER_EXEC_")
    private String superExec;

    @Column(name = "ACT_ID_")
    private String actId;

    @Column(name = "IS_ACTIVE_")
    private Byte isActive;

    @Column(name = "IS_CONCURRENT_")
    private Byte isConcurrent;

    @Column(name = "IS_SCOPE_")
    private Byte isScope;

    @Column(name = "IS_EVENT_SCOPE_")
    private Byte isEventScope;

    @Column(name = "SUSPENSION_STATE_")
    private Integer suspensionState;

    @Column(name = "CACHED_ENT_STATE_")
    private Integer cachedEntState;

    @Column(name = "TENANT_ID_")
    private String tenantId;

    /**
     * @return ID_
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
     * @return REV_
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * @param rev
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    /**
     * @return PROC_INST_ID_
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    /**
     * @return BUSINESS_KEY_
     */
    public String getBusinessKey() {
        return businessKey;
    }

    /**
     * @param businessKey
     */
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    /**
     * @return PARENT_ID_
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return PROC_DEF_ID_
     */
    public String getProcDefId() {
        return procDefId;
    }

    /**
     * @param procDefId
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    /**
     * @return SUPER_EXEC_
     */
    public String getSuperExec() {
        return superExec;
    }

    /**
     * @param superExec
     */
    public void setSuperExec(String superExec) {
        this.superExec = superExec;
    }

    /**
     * @return ACT_ID_
     */
    public String getActId() {
        return actId;
    }

    /**
     * @param actId
     */
    public void setActId(String actId) {
        this.actId = actId;
    }

    /**
     * @return IS_ACTIVE_
     */
    public Byte getIsActive() {
        return isActive;
    }

    /**
     * @param isActive
     */
    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    /**
     * @return IS_CONCURRENT_
     */
    public Byte getIsConcurrent() {
        return isConcurrent;
    }

    /**
     * @param isConcurrent
     */
    public void setIsConcurrent(Byte isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    /**
     * @return IS_SCOPE_
     */
    public Byte getIsScope() {
        return isScope;
    }

    /**
     * @param isScope
     */
    public void setIsScope(Byte isScope) {
        this.isScope = isScope;
    }

    /**
     * @return IS_EVENT_SCOPE_
     */
    public Byte getIsEventScope() {
        return isEventScope;
    }

    /**
     * @param isEventScope
     */
    public void setIsEventScope(Byte isEventScope) {
        this.isEventScope = isEventScope;
    }

    /**
     * @return SUSPENSION_STATE_
     */
    public Integer getSuspensionState() {
        return suspensionState;
    }

    /**
     * @param suspensionState
     */
    public void setSuspensionState(Integer suspensionState) {
        this.suspensionState = suspensionState;
    }

    /**
     * @return CACHED_ENT_STATE_
     */
    public Integer getCachedEntState() {
        return cachedEntState;
    }

    /**
     * @param cachedEntState
     */
    public void setCachedEntState(Integer cachedEntState) {
        this.cachedEntState = cachedEntState;
    }

    /**
     * @return TENANT_ID_
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}