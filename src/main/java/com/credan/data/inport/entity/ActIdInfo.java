package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_id_info")
public class ActIdInfo {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "USER_ID_")
    private String userId;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "KEY_")
    private String key;

    @Column(name = "VALUE_")
    private String value;

    @Column(name = "PARENT_ID_")
    private String parentId;

    @Column(name = "PASSWORD_")
    private byte[] password;

    /**
     * @return ID_
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
     * @return REV_
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * @param rev
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    /**
     * @return USER_ID_
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return TYPE_
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return KEY_
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return VALUE_
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return PARENT_ID_
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return PASSWORD_
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(byte[] password) {
        this.password = password;
    }
}