package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "phone_fintech_list")
public class PhoneFintechList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String number;

    private String fintech;

    /**
     * 1：银行电话；2：贷款公司电话；3：律所类电话；4：银行短信号码；5：贷款公司短信号码；6：律所类短信号码；7：依照号码规律类推出来的号码。
     */
    private Integer type;

    private String status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

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
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return fintech
     */
    public String getFintech() {
        return fintech;
    }

    /**
     * @param fintech
     */
    public void setFintech(String fintech) {
        this.fintech = fintech;
    }

    /**
     * 获取1：银行电话；2：贷款公司电话；3：律所类电话；4：银行短信号码；5：贷款公司短信号码；6：律所类短信号码；7：依照号码规律类推出来的号码。
     *
     * @return type - 1：银行电话；2：贷款公司电话；3：律所类电话；4：银行短信号码；5：贷款公司短信号码；6：律所类短信号码；7：依照号码规律类推出来的号码。
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1：银行电话；2：贷款公司电话；3：律所类电话；4：银行短信号码；5：贷款公司短信号码；6：律所类短信号码；7：依照号码规律类推出来的号码。
     *
     * @param type 1：银行电话；2：贷款公司电话；3：律所类电话；4：银行短信号码；5：贷款公司短信号码；6：律所类短信号码；7：依照号码规律类推出来的号码。
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}