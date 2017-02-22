package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "file_info")
public class FileInfo {
    /**
     * 文件ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 文件分类（图片：IMAGE）
     */
    @Column(name = "file_type")
    private String fileType;

    /**
     * 原文件名
     */
    @Column(name = "old_filename")
    private String oldFilename;

    /**
     * 服务器文件名
     */
    private String filename;

    /**
     * 服务器路径
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * 删除标识（0：无效、1：有效）
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
     * 获取文件ID
     *
     * @return id - 文件ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置文件ID
     *
     * @param id 文件ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取文件分类（图片：IMAGE）
     *
     * @return file_type - 文件分类（图片：IMAGE）
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 设置文件分类（图片：IMAGE）
     *
     * @param fileType 文件分类（图片：IMAGE）
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * 获取原文件名
     *
     * @return old_filename - 原文件名
     */
    public String getOldFilename() {
        return oldFilename;
    }

    /**
     * 设置原文件名
     *
     * @param oldFilename 原文件名
     */
    public void setOldFilename(String oldFilename) {
        this.oldFilename = oldFilename;
    }

    /**
     * 获取服务器文件名
     *
     * @return filename - 服务器文件名
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置服务器文件名
     *
     * @param filename 服务器文件名
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取服务器路径
     *
     * @return file_path - 服务器路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置服务器路径
     *
     * @param filePath 服务器路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取删除标识（0：无效、1：有效）
     *
     * @return del_flag - 删除标识（0：无效、1：有效）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0：无效、1：有效）
     *
     * @param delFlag 删除标识（0：无效、1：有效）
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