package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_h_messages_sent")
public class CoreHMessagesSent {
    @Column(name = "M_GUID")
    private String mGuid;

    @Column(name = "M_RECEIVER")
    private String mReceiver;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "CLIENT_IP")
    private String clientIp;

    @Column(name = "XID")
    private String xid;

    /**
     * @return M_GUID
     */
    public String getmGuid() {
        return mGuid;
    }

    /**
     * @param mGuid
     */
    public void setmGuid(String mGuid) {
        this.mGuid = mGuid;
    }

    /**
     * @return M_RECEIVER
     */
    public String getmReceiver() {
        return mReceiver;
    }

    /**
     * @param mReceiver
     */
    public void setmReceiver(String mReceiver) {
        this.mReceiver = mReceiver;
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
     * @return CLIENT_IP
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * @param clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * @return XID
     */
    public String getXid() {
        return xid;
    }

    /**
     * @param xid
     */
    public void setXid(String xid) {
        this.xid = xid;
    }
}