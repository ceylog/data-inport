package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_login_ctr")
public class CoreLoginCtr {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "CREATEMAN")
    private String createman;

    @Column(name = "USERADDRESS")
    private String useraddress;

    @Column(name = "LOGIN_DATE")
    private String loginDate;

    /**
     * @return ID
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
     * @return LOGIN_DATE
     */
    public String getLoginDate() {
        return loginDate;
    }

    /**
     * @param loginDate
     */
    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }
}