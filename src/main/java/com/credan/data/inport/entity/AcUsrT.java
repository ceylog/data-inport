package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ac_usr_t")
public class AcUsrT {
    @Id
    @Column(name = "idac_usr")
    private String idacUsr;

    /**
     * 姓名
     */
    @Column(name = "usrName")
    private String usrname;

    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String tel;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * 可用标志
     */
    @Column(name = "availableFlag")
    private String availableflag;

    /**
     * @return idac_usr
     */
    public String getIdacUsr() {
        return idacUsr;
    }

    /**
     * @param idacUsr
     */
    public void setIdacUsr(String idacUsr) {
        this.idacUsr = idacUsr;
    }

    /**
     * 获取姓名
     *
     * @return usrName - 姓名
     */
    public String getUsrname() {
        return usrname;
    }

    /**
     * 设置姓名
     *
     * @param usrname 姓名
     */
    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

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
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取生成时间
     *
     * @return createTime - 生成时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置生成时间
     *
     * @param createtime 生成时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取可用标志
     *
     * @return availableFlag - 可用标志
     */
    public String getAvailableflag() {
        return availableflag;
    }

    /**
     * 设置可用标志
     *
     * @param availableflag 可用标志
     */
    public void setAvailableflag(String availableflag) {
        this.availableflag = availableflag;
    }
}