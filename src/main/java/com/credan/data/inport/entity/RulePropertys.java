package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rule_propertys")
public class RulePropertys {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 分类ID
     */
    private String classify;

    /**
     * 规则代码
     */
    private String code;

    /**
     * 规则名称
     */
    private String name;

    /**
     * pojo属性
     */
    private String property;

    /**
     * pojo属性关联字段
     */
    @Column(name = "property_link")
    private String propertyLink;

    /**
     * java类型(支持Integer, String, Double)
     */
    @Column(name = "java_type")
    private String javaType;

    /**
     * 默认值条件(支持，eq、noteq、gt、gte、lt、lte) 字符串类型仅支持前两种
     */
    @Column(name = "defaule_criteria")
    private String defauleCriteria;

    /**
     * 默认值条件值,匹配defaule_criteria条件
     */
    @Column(name = "default_value_criteria")
    private String defaultValueCriteria;

    /**
     * 默认值
     */
    @Column(name = "default_value")
    private String defaultValue;

    /**
     * 备注
     */
    private String memo;

    /**
     * 删除标识（1:删除、0：有效）
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 获取唯一ID
     *
     * @return id - 唯一ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取分类ID
     *
     * @return classify - 分类ID
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 设置分类ID
     *
     * @param classify 分类ID
     */
    public void setClassify(String classify) {
        this.classify = classify;
    }

    /**
     * 获取规则代码
     *
     * @return code - 规则代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置规则代码
     *
     * @param code 规则代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取规则名称
     *
     * @return name - 规则名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置规则名称
     *
     * @param name 规则名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取pojo属性
     *
     * @return property - pojo属性
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置pojo属性
     *
     * @param property pojo属性
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * 获取pojo属性关联字段
     *
     * @return property_link - pojo属性关联字段
     */
    public String getPropertyLink() {
        return propertyLink;
    }

    /**
     * 设置pojo属性关联字段
     *
     * @param propertyLink pojo属性关联字段
     */
    public void setPropertyLink(String propertyLink) {
        this.propertyLink = propertyLink;
    }

    /**
     * 获取java类型(支持Integer, String, Double)
     *
     * @return java_type - java类型(支持Integer, String, Double)
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * 设置java类型(支持Integer, String, Double)
     *
     * @param javaType java类型(支持Integer, String, Double)
     */
    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    /**
     * 获取默认值条件(支持，eq、noteq、gt、gte、lt、lte) 字符串类型仅支持前两种
     *
     * @return defaule_criteria - 默认值条件(支持，eq、noteq、gt、gte、lt、lte) 字符串类型仅支持前两种
     */
    public String getDefauleCriteria() {
        return defauleCriteria;
    }

    /**
     * 设置默认值条件(支持，eq、noteq、gt、gte、lt、lte) 字符串类型仅支持前两种
     *
     * @param defauleCriteria 默认值条件(支持，eq、noteq、gt、gte、lt、lte) 字符串类型仅支持前两种
     */
    public void setDefauleCriteria(String defauleCriteria) {
        this.defauleCriteria = defauleCriteria;
    }

    /**
     * 获取默认值条件值,匹配defaule_criteria条件
     *
     * @return default_value_criteria - 默认值条件值,匹配defaule_criteria条件
     */
    public String getDefaultValueCriteria() {
        return defaultValueCriteria;
    }

    /**
     * 设置默认值条件值,匹配defaule_criteria条件
     *
     * @param defaultValueCriteria 默认值条件值,匹配defaule_criteria条件
     */
    public void setDefaultValueCriteria(String defaultValueCriteria) {
        this.defaultValueCriteria = defaultValueCriteria;
    }

    /**
     * 获取默认值
     *
     * @return default_value - 默认值
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置默认值
     *
     * @param defaultValue 默认值
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取删除标识（1:删除、0：有效）
     *
     * @return del_flag - 删除标识（1:删除、0：有效）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（1:删除、0：有效）
     *
     * @param delFlag 删除标识（1:删除、0：有效）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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