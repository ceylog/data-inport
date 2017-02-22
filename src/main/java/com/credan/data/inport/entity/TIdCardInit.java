package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "t_id_card_init")
public class TIdCardInit {
    /**
     * 前六位
     */
    @Id
    private String code;

    /**
     * 中文名称
     */
    private String name;

    /**
     * 获取前六位
     *
     * @return code - 前六位
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置前六位
     *
     * @param code 前六位
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取中文名称
     *
     * @return name - 中文名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置中文名称
     *
     * @param name 中文名称
     */
    public void setName(String name) {
        this.name = name;
    }
}