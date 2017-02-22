package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jckj_yh")
public class JckjYh {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "YXSJ")
    private Date yxsj;

    @Column(name = "MMSJ")
    private Date mmsj;

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
     * @return YXSJ
     */
    public Date getYxsj() {
        return yxsj;
    }

    /**
     * @param yxsj
     */
    public void setYxsj(Date yxsj) {
        this.yxsj = yxsj;
    }

    /**
     * @return MMSJ
     */
    public Date getMmsj() {
        return mmsj;
    }

    /**
     * @param mmsj
     */
    public void setMmsj(Date mmsj) {
        this.mmsj = mmsj;
    }
}