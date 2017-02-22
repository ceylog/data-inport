package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "third_raw_data_info")
public class ThirdRawDataInfo {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 数据源ID
     */
    @Column(name = "data_source_id")
    private Long dataSourceId;

    /**
     * 类型（TEL：解析通话明细）
     */
    private String type;

    /**
     * 删除标识（0：未删除、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 备注
     */
    private String memo;

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
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取数据源ID
     *
     * @return data_source_id - 数据源ID
     */
    public Long getDataSourceId() {
        return dataSourceId;
    }

    /**
     * 设置数据源ID
     *
     * @param dataSourceId 数据源ID
     */
    public void setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * 获取类型（TEL：解析通话明细）
     *
     * @return type - 类型（TEL：解析通话明细）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（TEL：解析通话明细）
     *
     * @param type 类型（TEL：解析通话明细）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取删除标识（0：未删除、1：已删除）
     *
     * @return del_flag - 删除标识（0：未删除、1：已删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0：未删除、1：已删除）
     *
     * @param delFlag 删除标识（0：未删除、1：已删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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