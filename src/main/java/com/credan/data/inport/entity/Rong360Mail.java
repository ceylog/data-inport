package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "rong360_mail")
public class Rong360Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 邮箱后缀
     */
    @Column(name = "mail_suffix")
    private String mailSuffix;

    private String description;

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
     * 获取邮箱后缀
     *
     * @return mail_suffix - 邮箱后缀
     */
    public String getMailSuffix() {
        return mailSuffix;
    }

    /**
     * 设置邮箱后缀
     *
     * @param mailSuffix 邮箱后缀
     */
    public void setMailSuffix(String mailSuffix) {
        this.mailSuffix = mailSuffix;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}