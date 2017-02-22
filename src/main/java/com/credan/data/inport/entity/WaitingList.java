package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "waiting_list")
public class WaitingList {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phone;

    private String email;

    /**
     * 1：电子商务；2：时尚轻奢；3：汽车销售；4：房屋租赁；5：教育培训；6：生活旅游；7：医疗美容
     */
    private Byte field;

    private String company;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * @return ID
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
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
     * 获取1：电子商务；2：时尚轻奢；3：汽车销售；4：房屋租赁；5：教育培训；6：生活旅游；7：医疗美容
     *
     * @return field - 1：电子商务；2：时尚轻奢；3：汽车销售；4：房屋租赁；5：教育培训；6：生活旅游；7：医疗美容
     */
    public Byte getField() {
        return field;
    }

    /**
     * 设置1：电子商务；2：时尚轻奢；3：汽车销售；4：房屋租赁；5：教育培训；6：生活旅游；7：医疗美容
     *
     * @param field 1：电子商务；2：时尚轻奢；3：汽车销售；4：房屋租赁；5：教育培训；6：生活旅游；7：医疗美容
     */
    public void setField(Byte field) {
        this.field = field;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
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
}