package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_messages_delay")
public class CoreMessagesDelay {
    @Id
    @Column(name = "M_GUID")
    private String mGuid;

    @Id
    @Column(name = "M_RECEIVER")
    private String mReceiver;

    @Column(name = "SEND_TIME")
    private Date sendTime;

    @Column(name = "MAX_RNUM")
    private Short maxRnum;

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
     * @return SEND_TIME
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * @return MAX_RNUM
     */
    public Short getMaxRnum() {
        return maxRnum;
    }

    /**
     * @param maxRnum
     */
    public void setMaxRnum(Short maxRnum) {
        this.maxRnum = maxRnum;
    }
}