package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "jckj_users")
public class JckjUsers {
    @Id
    @Column(name = "USER_CODE")
    private String userCode;

    @Id
    @Column(name = "USER_UNICODE")
    private String userUnicode;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_SEX")
    private String userSex;

    @Column(name = "USER_BIRTHDAY")
    private String userBirthday;

    @Column(name = "SPELL")
    private String spell;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "DEPTID")
    private String deptid;

    @Column(name = "DEPTNAME")
    private String deptname;

    @Column(name = "USER_LEVEL")
    private String userLevel;

    @Column(name = "USER_MEMO")
    private String userMemo;

    @Column(name = "USER_TITLE")
    private String userTitle;

    /**
     * @return USER_CODE
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * @return USER_UNICODE
     */
    public String getUserUnicode() {
        return userUnicode;
    }

    /**
     * @param userUnicode
     */
    public void setUserUnicode(String userUnicode) {
        this.userUnicode = userUnicode;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return USER_SEX
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * @param userSex
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * @return USER_BIRTHDAY
     */
    public String getUserBirthday() {
        return userBirthday;
    }

    /**
     * @param userBirthday
     */
    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * @return SPELL
     */
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * @return USER_PWD
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * @return DEPTID
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * @param deptid
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    /**
     * @return DEPTNAME
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * @param deptname
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    /**
     * @return USER_LEVEL
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * @param userLevel
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * @return USER_MEMO
     */
    public String getUserMemo() {
        return userMemo;
    }

    /**
     * @param userMemo
     */
    public void setUserMemo(String userMemo) {
        this.userMemo = userMemo;
    }

    /**
     * @return USER_TITLE
     */
    public String getUserTitle() {
        return userTitle;
    }

    /**
     * @param userTitle
     */
    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }
}