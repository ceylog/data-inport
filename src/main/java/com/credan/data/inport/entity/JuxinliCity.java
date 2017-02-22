package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "juxinli_city")
public class JuxinliCity {
    /**
     * 唯一ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 市代码
     */
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    /**
     * 关联省代码
     */
    @Column(name = "PROVINCE_ID")
    private Integer provinceId;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 城市所属类型0：公用、1：公积金、2：社保
     */
    @Column(name = "TYPE")
    private Integer type;

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
     * 获取市代码
     *
     * @return CODE - 市代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置市代码
     *
     * @param code 市代码
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
     * 获取关联省代码
     *
     * @return PROVINCE_ID - 关联省代码
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置关联省代码
     *
     * @param provinceId 关联省代码
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
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

    /**
     * 获取城市所属类型0：公用、1：公积金、2：社保
     *
     * @return TYPE - 城市所属类型0：公用、1：公积金、2：社保
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置城市所属类型0：公用、1：公积金、2：社保
     *
     * @param type 城市所属类型0：公用、1：公积金、2：社保
     */
    public void setType(Integer type) {
        this.type = type;
    }
}