package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_messages_q")
public class CoreMessagesQ {
    @Id
    @Column(name = "M_GUID")
    private String mGuid;

    @Id
    @Column(name = "M_RECEIVER")
    private String mReceiver;

    @Column(name = "OPT_BUSI_TYPE")
    private String optBusiType;

    @Column(name = "M_PRIORITY")
    private Double mPriority;

    @Column(name = "M_RECEIVER_TYPE")
    private String mReceiverType;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "MAX_RNUM")
    private Short maxRnum;

    @Column(name = "M_TITLE")
    private String mTitle;

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
     * @return M_PRIORITY
     */
    public Double getmPriority() {
        return mPriority;
    }

    /**
     * @param mPriority
     */
    public void setmPriority(Double mPriority) {
        this.mPriority = mPriority;
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

    /**
     * @return M_TITLE
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * @param mTitle
     */
    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}