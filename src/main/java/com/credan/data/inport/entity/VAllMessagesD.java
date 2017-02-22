package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_all_messages_d")
public class VAllMessagesD {
    @Column(name = "M_GUID")
    private String mGuid;

    @Column(name = "M_RECEIVER")
    private String mReceiver;

    @Column(name = "M_OPT_STATUS")
    private String mOptStatus;

    @Column(name = "M_OPT_LAST_TIME")
    private String mOptLastTime;

    @Column(name = "OPT_BUSI_TYPE")
    private String optBusiType;

    @Column(name = "M_RECEIVER_TYPE")
    private String mReceiverType;

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
     * @return M_OPT_STATUS
     */
    public String getmOptStatus() {
        return mOptStatus;
    }

    /**
     * @param mOptStatus
     */
    public void setmOptStatus(String mOptStatus) {
        this.mOptStatus = mOptStatus;
    }

    /**
     * @return M_OPT_LAST_TIME
     */
    public String getmOptLastTime() {
        return mOptLastTime;
    }

    /**
     * @param mOptLastTime
     */
    public void setmOptLastTime(String mOptLastTime) {
        this.mOptLastTime = mOptLastTime;
    }

    /**
     * @return OPT_BUSI_TYPE
     */
    public String getOptBusiType() {
        return optBusiType;
    }

    /**
     * @param optBusiType
     */
    public void setOptBusiType(String optBusiType) {
        this.optBusiType = optBusiType;
    }

    /**
     * @return M_RECEIVER_TYPE
     */
    public String getmReceiverType() {
        return mReceiverType;
    }

    /**
     * @param mReceiverType
     */
    public void setmReceiverType(String mReceiverType) {
        this.mReceiverType = mReceiverType;
    }
}