package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_online_users")
public class CoreOnlineUsers {
    @Id
    @Column(name = "GUID")
    private String guid;

    @Column(name = "USERADDRESS")
    private String useraddress;

    @Column(name = "USERADDRESSPORT")
    private String useraddressport;

    @Column(name = "LOGIN_TIME")
    private String loginTime;

    @Column(name = "USERID")
    private String userid;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "WARDNO")
    private String wardno;

    @Column(name = "DEPTNO")
    private String deptno;

    @Column(name = "SOCKET_TYPE")
    private String socketType;

    @Column(name = "COMMANDPORT")
    private String commandport;

    @Column(name = "USERROLES")
    private String userroles;

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
     * @return USERADDRESS
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * @param useraddress
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    /**
     * @return USERADDRESSPORT
     */
    public String getUseraddressport() {
        return useraddressport;
    }

    /**
     * @param useraddressport
     */
    public void setUseraddressport(String useraddressport) {
        this.useraddressport = useraddressport;
    }

    /**
     * @return LOGIN_TIME
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return USERID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return WARDNO
     */
    public String getWardno() {
        return wardno;
    }

    /**
     * @param wardno
     */
    public void setWardno(String wardno) {
        this.wardno = wardno;
    }

    /**
     * @return DEPTNO
     */
    public String getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    /**
     * @return SOCKET_TYPE
     */
    public String getSocketType() {
        return socketType;
    }

    /**
     * @param socketType
     */
    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    /**
     * @return COMMANDPORT
     */
    public String getCommandport() {
        return commandport;
    }

    /**
     * @param commandport
     */
    public void setCommandport(String commandport) {
        this.commandport = commandport;
    }

    /**
     * @return USERROLES
     */
    public String getUserroles() {
        return userroles;
    }

    /**
     * @param userroles
     */
    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }
}