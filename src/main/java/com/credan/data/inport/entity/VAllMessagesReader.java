package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_all_messages_reader")
public class VAllMessagesReader {
    @Column(name = "M_GUID")
    private String mGuid;

    @Column(name = "M_RECEIVER")
    private String mReceiver;

    @Column(name = "CLIENT_IP")
    private String clientIp;

    @Column(name = "CREATETIME")
    private String createtime;

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
     * @return CREATETIME
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}