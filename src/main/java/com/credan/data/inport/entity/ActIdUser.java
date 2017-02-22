package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_id_user")
public class ActIdUser {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "FIRST_")
    private String first;

    @Column(name = "LAST_")
    private String last;

    @Column(name = "EMAIL_")
    private String email;

    @Column(name = "PWD_")
    private String pwd;

    @Column(name = "PICTURE_ID_")
    private String pictureId;

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
     * @return FIRST_
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return LAST_
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * @return EMAIL_
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return PWD_
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return PICTURE_ID_
     */
    public String getPictureId() {
        return pictureId;
    }

    /**
     * @param pictureId
     */
    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }
}