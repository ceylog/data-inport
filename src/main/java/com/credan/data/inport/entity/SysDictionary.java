package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "sys_dictionary")
public class SysDictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 字典分类
     */
    @Column(name = "dict_type")
    private String dictType;

    /**
     * 名称
     */
    @Column(name = "dict_name")
    private String dictName;

    /**
     * 值
     */
    @Column(name = "dict_code")
    private String dictCode;

    private Integer rank;

    @Column(name = "parent_id")
    private Integer parentId;

    private String memo;

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
     * 获取字典分类
     *
     * @return dict_type - 字典分类
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 设置字典分类
     *
     * @param dictType 字典分类
     */
    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    /**
     * 获取名称
     *
     * @return dict_name - 名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置名称
     *
     * @param dictName 名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取值
     *
     * @return dict_code - 值
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * 设置值
     *
     * @param dictCode 值
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    /**
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}