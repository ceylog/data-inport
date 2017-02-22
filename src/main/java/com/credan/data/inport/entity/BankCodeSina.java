package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "bank_code_sina")
public class BankCodeSina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 预留用
     */
    private Integer type;

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
     * @return bank_name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return bank_code
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * @param bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取预留用
     *
     * @return type - 预留用
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置预留用
     *
     * @param type 预留用
     */
    public void setType(Integer type) {
        this.type = type;
    }
}