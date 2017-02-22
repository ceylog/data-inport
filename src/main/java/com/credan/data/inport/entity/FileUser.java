package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "file_user")
public class FileUser {
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
     * 文件ID
     */
    @Column(name = "file_id")
    private String fileId;

    /**
     * 类型（身份证正面：IDCARD_FACADE、身份证反面：IDACRD_REVERSE）
     */
    private String type;

    /**
     * 备注
     */
    private String memo;

    /**
     * 删除标识（0：未删除、1：已删除）
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
     * 获取文件ID
     *
     * @return file_id - 文件ID
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 设置文件ID
     *
     * @param fileId 文件ID
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取类型（身份证正面：IDCARD_FACADE、身份证反面：IDACRD_REVERSE）
     *
     * @return type - 类型（身份证正面：IDCARD_FACADE、身份证反面：IDACRD_REVERSE）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（身份证正面：IDCARD_FACADE、身份证反面：IDACRD_REVERSE）
     *
     * @param type 类型（身份证正面：IDCARD_FACADE、身份证反面：IDACRD_REVERSE）
     */
    public void setType(String type) {
        this.type = type;
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