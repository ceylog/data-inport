package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "juxinli_province")
public class JuxinliProvince {
    /**
     * 唯一ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 省代码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 省中文名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 获取唯一ID
     *
     * @return ID - 唯一ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取省代码
     *
     * @return CODE - 省代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置省代码
     *
     * @param code 省代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取省中文名称
     *
     * @return NAME - 省中文名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置省中文名称
     *
     * @param name 省中文名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}