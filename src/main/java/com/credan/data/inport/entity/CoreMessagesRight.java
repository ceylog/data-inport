package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_messages_right")
public class CoreMessagesRight {
    @Column(name = "MSG_TYPEID")
    private String msgTypeid;

    @Column(name = "RID")
    private String rid;

    @Column(name = "RTYPE")
    private String rtype;

    @Column(name = "MSG_CLASSID")
    private String msgClassid;

    /**
     * @return MSG_TYPEID
     */
    public String getMsgTypeid() {
        return msgTypeid;
    }

    /**
     * @param msgTypeid
     */
    public void setMsgTypeid(String msgTypeid) {
        this.msgTypeid = msgTypeid;
    }

    /**
     * @return RID
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return RTYPE
     */
    public String getRtype() {
        return rtype;
    }

    /**
     * @param rtype
     */
    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    /**
     * @return MSG_CLASSID
     */
    public String getMsgClassid() {
        return msgClassid;
    }

    /**
     * @param msgClassid
     */
    public void setMsgClassid(String msgClassid) {
        this.msgClassid = msgClassid;
    }
}