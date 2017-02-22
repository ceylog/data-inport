package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jckj_yhjs")
public class JckjYhjs {
    @Id
    @Column(name = "YHID")
    private String yhid;

    @Id
    @Column(name = "JSID")
    private String jsid;

    @Column(name = "YXSJ")
    private Date yxsj;

    /**
     * @return YHID
     */
    public String getYhid() {
        return yhid;
    }

    /**
     * @param yhid
     */
    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    /**
     * @return JSID
     */
    public String getJsid() {
        return jsid;
    }

    /**
     * @param jsid
     */
    public void setJsid(String jsid) {
        this.jsid = jsid;
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
}