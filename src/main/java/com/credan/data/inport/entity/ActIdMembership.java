package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_id_membership")
public class ActIdMembership {
    @Id
    @Column(name = "USER_ID_")
    private String userId;

    @Id
    @Column(name = "GROUP_ID_")
    private String groupId;

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
     * @return GROUP_ID_
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}