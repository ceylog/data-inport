package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "rong360_bank_info")
public class Rong360BankInfo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    /**
     * 关联银行表的
     */
    @Column(name = "BANK_INFO_ID")
    private Long bankInfoId;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return CODE
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
     * @return NAME
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
     * 获取关联银行表的
     *
     * @return BANK_INFO_ID - 关联银行表的
     */
    public Long getBankInfoId() {
        return bankInfoId;
    }

    /**
     * 设置关联银行表的
     *
     * @param bankInfoId 关联银行表的
     */
    public void setBankInfoId(Long bankInfoId) {
        this.bankInfoId = bankInfoId;
    }
}