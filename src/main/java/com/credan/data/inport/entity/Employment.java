package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_phone")
    private String companyPhone;

    /**
     * 职位
     */
    private String title;

    @Column(name = "is_current")
    private Boolean isCurrent;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "company_address")
    private String companyAddress;

    @Column(name = "company_nature")
    private Integer companyNature;

    private Integer addtime;

    /**
     * @return id
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
     * @return company_name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return company_phone
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * @param companyPhone
     */
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    /**
     * 获取职位
     *
     * @return title - 职位
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置职位
     *
     * @param title 职位
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return is_current
     */
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    /**
     * @param isCurrent
     */
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    /**
     * @return last_updated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * @return company_address
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * @param companyAddress
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * @return company_nature
     */
    public Integer getCompanyNature() {
        return companyNature;
    }

    /**
     * @param companyNature
     */
    public void setCompanyNature(Integer companyNature) {
        this.companyNature = companyNature;
    }

    /**
     * @return addtime
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }
}