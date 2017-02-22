package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_project_fund")
public class CiProjectFund {
    /**
     * 项目ID
     */
    @Id
    @Column(name = "project_id")
    private String projectId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 项目分期总额
     */
    private BigDecimal amount;

    /**
     * 资金匹配状态(未匹配：UN_MATCHED、匹配中：MATCHING、已匹配：MATCHED)
     */
    @Column(name = "matched_status")
    private String matchedStatus;

    /**
     * 打款状态（未打款：UN_TRANSFER、打款中：ON_TRANSFER、已打款：TRANSFERED）
     */
    @Column(name = "transfer_status")
    private String transferStatus;

    /**
     * 资金匹配时间
     */
    @Column(name = "matched_date")
    private Date matchedDate;

    /**
     * 付款时间
     */
    @Column(name = "transfer_date")
    private Date transferDate;

    /**
     * 删除标识（0：有效、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 备注
     */
    private String memo;

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
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取项目分期总额
     *
     * @return amount - 项目分期总额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置项目分期总额
     *
     * @param amount 项目分期总额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取资金匹配状态(未匹配：UN_MATCHED、匹配中：MATCHING、已匹配：MATCHED)
     *
     * @return matched_status - 资金匹配状态(未匹配：UN_MATCHED、匹配中：MATCHING、已匹配：MATCHED)
     */
    public String getMatchedStatus() {
        return matchedStatus;
    }

    /**
     * 设置资金匹配状态(未匹配：UN_MATCHED、匹配中：MATCHING、已匹配：MATCHED)
     *
     * @param matchedStatus 资金匹配状态(未匹配：UN_MATCHED、匹配中：MATCHING、已匹配：MATCHED)
     */
    public void setMatchedStatus(String matchedStatus) {
        this.matchedStatus = matchedStatus;
    }

    /**
     * 获取打款状态（未打款：UN_TRANSFER、打款中：ON_TRANSFER、已打款：TRANSFERED）
     *
     * @return transfer_status - 打款状态（未打款：UN_TRANSFER、打款中：ON_TRANSFER、已打款：TRANSFERED）
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    /**
     * 设置打款状态（未打款：UN_TRANSFER、打款中：ON_TRANSFER、已打款：TRANSFERED）
     *
     * @param transferStatus 打款状态（未打款：UN_TRANSFER、打款中：ON_TRANSFER、已打款：TRANSFERED）
     */
    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    /**
     * 获取资金匹配时间
     *
     * @return matched_date - 资金匹配时间
     */
    public Date getMatchedDate() {
        return matchedDate;
    }

    /**
     * 设置资金匹配时间
     *
     * @param matchedDate 资金匹配时间
     */
    public void setMatchedDate(Date matchedDate) {
        this.matchedDate = matchedDate;
    }

    /**
     * 获取付款时间
     *
     * @return transfer_date - 付款时间
     */
    public Date getTransferDate() {
        return transferDate;
    }

    /**
     * 设置付款时间
     *
     * @param transferDate 付款时间
     */
    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * 获取删除标识（0：有效、1：已删除）
     *
     * @return del_flag - 删除标识（0：有效、1：已删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0：有效、1：已删除）
     *
     * @param delFlag 删除标识（0：有效、1：已删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
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
}