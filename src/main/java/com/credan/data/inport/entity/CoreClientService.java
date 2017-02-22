package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_client_service")
public class CoreClientService {
    @Id
    @Column(name = "SERV_CODE")
    private String servCode;

    @Column(name = "SERV_PROVIDER")
    private String servProvider;

    @Column(name = "SERV_CLASS")
    private String servClass;

    @Column(name = "SERV_SYS")
    private String servSys;

    @Column(name = "SERV_NAME")
    private String servName;

    @Column(name = "SERV_STATE")
    private String servState;

    @Column(name = "SERVIC_INIT_PARAM")
    private String servicInitParam;

    @Column(name = "SERV_EVENT")
    private String servEvent;

    @Column(name = "SERV_OPENTRAN")
    private String servOpentran;

    @Column(name = "SERV_DATA_ZIP")
    private String servDataZip;

    @Column(name = "SERVIC_LOG")
    private String servicLog;

    @Column(name = "SERV_AUTH")
    private String servAuth;

    @Column(name = "SERV_AUTH_EXT")
    private String servAuthExt;

    @Column(name = "LAST_OPTTIME")
    private String lastOpttime;

    @Column(name = "SERV_DEBUG")
    private String servDebug;

    @Column(name = "SERV_INPUT")
    private String servInput;

    @Column(name = "SERV_OUTPUT")
    private String servOutput;

    @Column(name = "SERV_LOG_PARAMS")
    private String servLogParams;

    /**
     * @return SERV_CODE
     */
    public String getServCode() {
        return servCode;
    }

    /**
     * @param servCode
     */
    public void setServCode(String servCode) {
        this.servCode = servCode;
    }

    /**
     * @return SERV_PROVIDER
     */
    public String getServProvider() {
        return servProvider;
    }

    /**
     * @param servProvider
     */
    public void setServProvider(String servProvider) {
        this.servProvider = servProvider;
    }

    /**
     * @return SERV_CLASS
     */
    public String getServClass() {
        return servClass;
    }

    /**
     * @param servClass
     */
    public void setServClass(String servClass) {
        this.servClass = servClass;
    }

    /**
     * @return SERV_SYS
     */
    public String getServSys() {
        return servSys;
    }

    /**
     * @param servSys
     */
    public void setServSys(String servSys) {
        this.servSys = servSys;
    }

    /**
     * @return SERV_NAME
     */
    public String getServName() {
        return servName;
    }

    /**
     * @param servName
     */
    public void setServName(String servName) {
        this.servName = servName;
    }

    /**
     * @return SERV_STATE
     */
    public String getServState() {
        return servState;
    }

    /**
     * @param servState
     */
    public void setServState(String servState) {
        this.servState = servState;
    }

    /**
     * @return SERVIC_INIT_PARAM
     */
    public String getServicInitParam() {
        return servicInitParam;
    }

    /**
     * @param servicInitParam
     */
    public void setServicInitParam(String servicInitParam) {
        this.servicInitParam = servicInitParam;
    }

    /**
     * @return SERV_EVENT
     */
    public String getServEvent() {
        return servEvent;
    }

    /**
     * @param servEvent
     */
    public void setServEvent(String servEvent) {
        this.servEvent = servEvent;
    }

    /**
     * @return SERV_OPENTRAN
     */
    public String getServOpentran() {
        return servOpentran;
    }

    /**
     * @param servOpentran
     */
    public void setServOpentran(String servOpentran) {
        this.servOpentran = servOpentran;
    }

    /**
     * @return SERV_DATA_ZIP
     */
    public String getServDataZip() {
        return servDataZip;
    }

    /**
     * @param servDataZip
     */
    public void setServDataZip(String servDataZip) {
        this.servDataZip = servDataZip;
    }

    /**
     * @return SERVIC_LOG
     */
    public String getServicLog() {
        return servicLog;
    }

    /**
     * @param servicLog
     */
    public void setServicLog(String servicLog) {
        this.servicLog = servicLog;
    }

    /**
     * @return SERV_AUTH
     */
    public String getServAuth() {
        return servAuth;
    }

    /**
     * @param servAuth
     */
    public void setServAuth(String servAuth) {
        this.servAuth = servAuth;
    }

    /**
     * @return SERV_AUTH_EXT
     */
    public String getServAuthExt() {
        return servAuthExt;
    }

    /**
     * @param servAuthExt
     */
    public void setServAuthExt(String servAuthExt) {
        this.servAuthExt = servAuthExt;
    }

    /**
     * @return LAST_OPTTIME
     */
    public String getLastOpttime() {
        return lastOpttime;
    }

    /**
     * @param lastOpttime
     */
    public void setLastOpttime(String lastOpttime) {
        this.lastOpttime = lastOpttime;
    }

    /**
     * @return SERV_DEBUG
     */
    public String getServDebug() {
        return servDebug;
    }

    /**
     * @param servDebug
     */
    public void setServDebug(String servDebug) {
        this.servDebug = servDebug;
    }

    /**
     * @return SERV_INPUT
     */
    public String getServInput() {
        return servInput;
    }

    /**
     * @param servInput
     */
    public void setServInput(String servInput) {
        this.servInput = servInput;
    }

    /**
     * @return SERV_OUTPUT
     */
    public String getServOutput() {
        return servOutput;
    }

    /**
     * @param servOutput
     */
    public void setServOutput(String servOutput) {
        this.servOutput = servOutput;
    }

    /**
     * @return SERV_LOG_PARAMS
     */
    public String getServLogParams() {
        return servLogParams;
    }

    /**
     * @param servLogParams
     */
    public void setServLogParams(String servLogParams) {
        this.servLogParams = servLogParams;
    }
}