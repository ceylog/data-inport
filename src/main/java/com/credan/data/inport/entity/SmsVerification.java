package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_verification")
public class SmsVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    private String code;

    @Column(name = "date_created")
    private Date dateCreated;

    /**
     * 1,表示验证成功,2表示失败
     */
    @Column(name = "is_verifed")
    private Boolean isVerifed;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return date_created
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * 获取1,表示验证成功,2表示失败
     *
     * @return is_verifed - 1,表示验证成功,2表示失败
     */
    public Boolean getIsVerifed() {
        return isVerifed;
    }

    /**
     * 设置1,表示验证成功,2表示失败
     *
     * @param isVerifed 1,表示验证成功,2表示失败
     */
    public void setIsVerifed(Boolean isVerifed) {
        this.isVerifed = isVerifed;
    }
}