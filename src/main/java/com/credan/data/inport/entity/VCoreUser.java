package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_core_user")
public class VCoreUser {
    @Column(name = "USER_CODE")
    private String userCode;

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

    @Column(name = "ROLE")
    private String role;

    @Column(name = "STOPPED")
    private Long stopped;

    @Column(name = "DEPTNO")
    private String deptno;

    @Column(name = "DEPTNAME")
    private String deptname;

    @Column(name = "WARDNAME")
    private String wardname;

    @Column(name = "USER_TYPE")
    private Long userType;

    @Column(name = "USER_MEMO")
    private String userMemo;

    @Column(name = "ZC_ID")
    private byte[] zcId;

    @Column(name = "ZC_NAME")
    private String zcName;

    @Column(name = "PTCFQBZ")
    private byte[] ptcfqbz;

    @Column(name = "TSCFQBZ")
    private byte[] tscfqbz;

    @Column(name = "YBCODE")
    private byte[] ybcode;

    @Column(name = "PASSWORDS")
    private byte[] passwords;

    @Column(name = "WARDNO")
    private byte[] wardno;

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
     * @return ROLE
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return STOPPED
     */
    public Long getStopped() {
        return stopped;
    }

    /**
     * @param stopped
     */
    public void setStopped(Long stopped) {
        this.stopped = stopped;
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
     * @return WARDNAME
     */
    public String getWardname() {
        return wardname;
    }

    /**
     * @param wardname
     */
    public void setWardname(String wardname) {
        this.wardname = wardname;
    }

    /**
     * @return USER_TYPE
     */
    public Long getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(Long userType) {
        this.userType = userType;
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
     * @return ZC_ID
     */
    public byte[] getZcId() {
        return zcId;
    }

    /**
     * @param zcId
     */
    public void setZcId(byte[] zcId) {
        this.zcId = zcId;
    }

    /**
     * @return ZC_NAME
     */
    public String getZcName() {
        return zcName;
    }

    /**
     * @param zcName
     */
    public void setZcName(String zcName) {
        this.zcName = zcName;
    }

    /**
     * @return PTCFQBZ
     */
    public byte[] getPtcfqbz() {
        return ptcfqbz;
    }

    /**
     * @param ptcfqbz
     */
    public void setPtcfqbz(byte[] ptcfqbz) {
        this.ptcfqbz = ptcfqbz;
    }

    /**
     * @return TSCFQBZ
     */
    public byte[] getTscfqbz() {
        return tscfqbz;
    }

    /**
     * @param tscfqbz
     */
    public void setTscfqbz(byte[] tscfqbz) {
        this.tscfqbz = tscfqbz;
    }

    /**
     * @return YBCODE
     */
    public byte[] getYbcode() {
        return ybcode;
    }

    /**
     * @param ybcode
     */
    public void setYbcode(byte[] ybcode) {
        this.ybcode = ybcode;
    }

    /**
     * @return PASSWORDS
     */
    public byte[] getPasswords() {
        return passwords;
    }

    /**
     * @param passwords
     */
    public void setPasswords(byte[] passwords) {
        this.passwords = passwords;
    }

    /**
     * @return WARDNO
     */
    public byte[] getWardno() {
        return wardno;
    }

    /**
     * @param wardno
     */
    public void setWardno(byte[] wardno) {
        this.wardno = wardno;
    }
}