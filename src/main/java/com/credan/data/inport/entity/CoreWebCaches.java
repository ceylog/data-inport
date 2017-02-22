package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_web_caches")
public class CoreWebCaches {
    @Id
    @Column(name = "CACHEIP")
    private String cacheip;

    @Id
    @Column(name = "USERGUID")
    private String userguid;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "CACHES")
    private String caches;

    /**
     * @return CACHEIP
     */
    public String getCacheip() {
        return cacheip;
    }

    /**
     * @param cacheip
     */
    public void setCacheip(String cacheip) {
        this.cacheip = cacheip;
    }

    /**
     * @return USERGUID
     */
    public String getUserguid() {
        return userguid;
    }

    /**
     * @param userguid
     */
    public void setUserguid(String userguid) {
        this.userguid = userguid;
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
     * @return CACHES
     */
    public String getCaches() {
        return caches;
    }

    /**
     * @param caches
     */
    public void setCaches(String caches) {
        this.caches = caches;
    }
}