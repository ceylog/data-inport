package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "v_all_messages")
public class VAllMessages {
    @Column(name = "M_GUID")
    private String mGuid;

    @Column(name = "M_TITLE")
    private String mTitle;

    @Column(name = "M_CONTENT")
    private String mContent;

    @Column(name = "CREATEMAN")
    private String createman;

    @Column(name = "CREATEMAN_NM")
    private String createmanNm;

    @Column(name = "CREATETIME")
    private String createtime;

    @Column(name = "OPT_BUSI_TYPE")
    private String optBusiType;

    @Column(name = "OPT_BUSI_ENTITY")
    private String optBusiEntity;

    @Column(name = "BQ_ID")
    private String bqId;

    @Column(name = "BR_ID")
    private String brId;

    @Column(name = "BA_ID")
    private String baId;

    @Column(name = "KS_ID")
    private String ksId;

    @Column(name = "M_PRIORITY")
    private String mPriority;

    @Column(name = "EXTEND1")
    private String extend1;

    @Column(name = "EXTEND2")
    private String extend2;

    @Column(name = "EXTEND3")
    private String extend3;

    @Column(name = "EXTEND4")
    private String extend4;

    @Column(name = "EXTEND5")
    private String extend5;

    @Column(name = "EXTEND6")
    private String extend6;

    @Column(name = "MSG_BUSI_TYPE")
    private String msgBusiType;

    @Column(name = "MSG_PARENT_ID")
    private String msgParentId;

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

    /**
     * @return M_CONTENT
     */
    public String getmContent() {
        return mContent;
    }

    /**
     * @param mContent
     */
    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    /**
     * @return CREATEMAN
     */
    public String getCreateman() {
        return createman;
    }

    /**
     * @param createman
     */
    public void setCreateman(String createman) {
        this.createman = createman;
    }

    /**
     * @return CREATEMAN_NM
     */
    public String getCreatemanNm() {
        return createmanNm;
    }

    /**
     * @param createmanNm
     */
    public void setCreatemanNm(String createmanNm) {
        this.createmanNm = createmanNm;
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
     * @return OPT_BUSI_ENTITY
     */
    public String getOptBusiEntity() {
        return optBusiEntity;
    }

    /**
     * @param optBusiEntity
     */
    public void setOptBusiEntity(String optBusiEntity) {
        this.optBusiEntity = optBusiEntity;
    }

    /**
     * @return BQ_ID
     */
    public String getBqId() {
        return bqId;
    }

    /**
     * @param bqId
     */
    public void setBqId(String bqId) {
        this.bqId = bqId;
    }

    /**
     * @return BR_ID
     */
    public String getBrId() {
        return brId;
    }

    /**
     * @param brId
     */
    public void setBrId(String brId) {
        this.brId = brId;
    }

    /**
     * @return BA_ID
     */
    public String getBaId() {
        return baId;
    }

    /**
     * @param baId
     */
    public void setBaId(String baId) {
        this.baId = baId;
    }

    /**
     * @return KS_ID
     */
    public String getKsId() {
        return ksId;
    }

    /**
     * @param ksId
     */
    public void setKsId(String ksId) {
        this.ksId = ksId;
    }

    /**
     * @return M_PRIORITY
     */
    public String getmPriority() {
        return mPriority;
    }

    /**
     * @param mPriority
     */
    public void setmPriority(String mPriority) {
        this.mPriority = mPriority;
    }

    /**
     * @return EXTEND1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * @param extend1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    /**
     * @return EXTEND2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * @param extend2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    /**
     * @return EXTEND3
     */
    public String getExtend3() {
        return extend3;
    }

    /**
     * @param extend3
     */
    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    /**
     * @return EXTEND4
     */
    public String getExtend4() {
        return extend4;
    }

    /**
     * @param extend4
     */
    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

    /**
     * @return EXTEND5
     */
    public String getExtend5() {
        return extend5;
    }

    /**
     * @param extend5
     */
    public void setExtend5(String extend5) {
        this.extend5 = extend5;
    }

    /**
     * @return EXTEND6
     */
    public String getExtend6() {
        return extend6;
    }

    /**
     * @param extend6
     */
    public void setExtend6(String extend6) {
        this.extend6 = extend6;
    }

    /**
     * @return MSG_BUSI_TYPE
     */
    public String getMsgBusiType() {
        return msgBusiType;
    }

    /**
     * @param msgBusiType
     */
    public void setMsgBusiType(String msgBusiType) {
        this.msgBusiType = msgBusiType;
    }

    /**
     * @return MSG_PARENT_ID
     */
    public String getMsgParentId() {
        return msgParentId;
    }

    /**
     * @param msgParentId
     */
    public void setMsgParentId(String msgParentId) {
        this.msgParentId = msgParentId;
    }
}