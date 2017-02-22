package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "act_ru_job")
public class ActRuJob {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "LOCK_EXP_TIME_")
    private Date lockExpTime;

    @Column(name = "LOCK_OWNER_")
    private String lockOwner;

    @Column(name = "EXCLUSIVE_")
    private Boolean exclusive;

    @Column(name = "EXECUTION_ID_")
    private String executionId;

    @Column(name = "PROCESS_INSTANCE_ID_")
    private String processInstanceId;

    @Column(name = "PROC_DEF_ID_")
    private String procDefId;

    @Column(name = "RETRIES_")
    private Integer retries;

    @Column(name = "EXCEPTION_STACK_ID_")
    private String exceptionStackId;

    @Column(name = "EXCEPTION_MSG_")
    private String exceptionMsg;

    @Column(name = "DUEDATE_")
    private Date duedate;

    @Column(name = "REPEAT_")
    private String repeat;

    @Column(name = "HANDLER_TYPE_")
    private String handlerType;

    @Column(name = "HANDLER_CFG_")
    private String handlerCfg;

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
     * @return TYPE_
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return LOCK_EXP_TIME_
     */
    public Date getLockExpTime() {
        return lockExpTime;
    }

    /**
     * @param lockExpTime
     */
    public void setLockExpTime(Date lockExpTime) {
        this.lockExpTime = lockExpTime;
    }

    /**
     * @return LOCK_OWNER_
     */
    public String getLockOwner() {
        return lockOwner;
    }

    /**
     * @param lockOwner
     */
    public void setLockOwner(String lockOwner) {
        this.lockOwner = lockOwner;
    }

    /**
     * @return EXCLUSIVE_
     */
    public Boolean getExclusive() {
        return exclusive;
    }

    /**
     * @param exclusive
     */
    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    /**
     * @return EXECUTION_ID_
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * @param executionId
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * @return PROCESS_INSTANCE_ID_
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * @param processInstanceId
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
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
     * @return RETRIES_
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * @param retries
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * @return EXCEPTION_STACK_ID_
     */
    public String getExceptionStackId() {
        return exceptionStackId;
    }

    /**
     * @param exceptionStackId
     */
    public void setExceptionStackId(String exceptionStackId) {
        this.exceptionStackId = exceptionStackId;
    }

    /**
     * @return EXCEPTION_MSG_
     */
    public String getExceptionMsg() {
        return exceptionMsg;
    }

    /**
     * @param exceptionMsg
     */
    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    /**
     * @return DUEDATE_
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
     * @param duedate
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * @return REPEAT_
     */
    public String getRepeat() {
        return repeat;
    }

    /**
     * @param repeat
     */
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    /**
     * @return HANDLER_TYPE_
     */
    public String getHandlerType() {
        return handlerType;
    }

    /**
     * @param handlerType
     */
    public void setHandlerType(String handlerType) {
        this.handlerType = handlerType;
    }

    /**
     * @return HANDLER_CFG_
     */
    public String getHandlerCfg() {
        return handlerCfg;
    }

    /**
     * @param handlerCfg
     */
    public void setHandlerCfg(String handlerCfg) {
        this.handlerCfg = handlerCfg;
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