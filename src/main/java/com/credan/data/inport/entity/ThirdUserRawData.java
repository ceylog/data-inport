package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "third_user_raw_data")
public class ThirdUserRawData {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 运营商数据：TEL
     */
    private String type;

    /**
     * 原始数据版本
     */
    @Column(name = "data_version")
    private Long dataVersion;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 原始数据的最后更新时间
     */
    @Column(name = "raw_updated")
    private Date rawUpdated;

    /**
     * 原始数据文件路径
     */
    @Column(name = "raw_data")
    private String rawData;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取运营商数据：TEL
     *
     * @return type - 运营商数据：TEL
     */
    public String getType() {
        return type;
    }

    /**
     * 设置运营商数据：TEL
     *
     * @param type 运营商数据：TEL
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取原始数据版本
     *
     * @return data_version - 原始数据版本
     */
    public Long getDataVersion() {
        return dataVersion;
    }

    /**
     * 设置原始数据版本
     *
     * @param dataVersion 原始数据版本
     */
    public void setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return last_updated - 更新时间
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpdated 更新时间
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 获取原始数据的最后更新时间
     *
     * @return raw_updated - 原始数据的最后更新时间
     */
    public Date getRawUpdated() {
        return rawUpdated;
    }

    /**
     * 设置原始数据的最后更新时间
     *
     * @param rawUpdated 原始数据的最后更新时间
     */
    public void setRawUpdated(Date rawUpdated) {
        this.rawUpdated = rawUpdated;
    }

    /**
     * 获取原始数据文件路径
     *
     * @return raw_data - 原始数据文件路径
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * 设置原始数据文件路径
     *
     * @param rawData 原始数据文件路径
     */
    public void setRawData(String rawData) {
        this.rawData = rawData;
    }
}