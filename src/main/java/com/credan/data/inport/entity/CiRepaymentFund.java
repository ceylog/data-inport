package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ci_repayment_fund")
public class CiRepaymentFund {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 还款明细ID
     */
    @Column(name = "repayment_id")
    private String repaymentId;

    /**
     * 还款总金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;

    /**
     * 打款状态（未打款：UN_TRANSFER、打款中：ON_TRANSFER、已打款：TRANSFERED）
     */
    @Column(name = "transfer_status")
    private String transferStatus;

    /**
     * 打款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 描述
     */
    private String memo;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 删除标识（0：未删除、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

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
     * 获取还款明细ID
     *
     * @return repayment_id - 还款明细ID
     */
    public String getRepaymentId() {
        return repaymentId;
    }

    /**
     * 设置还款明细ID
     *
     * @param repaymentId 还款明细ID
     */
    public void setRepaymentId(String repaymentId) {
        this.repaymentId = repaymentId;
    }

    /**
     * 获取还款总金额
     *
     * @return repayment_amount - 还款总金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 设置还款总金额
     *
     * @param repaymentAmount 还款总金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
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
     * 获取打款时间
     *
     * @return pay_time - 打款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置打款时间
     *
     * @param payTime 打款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取描述
     *
     * @return memo - 描述
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置描述
     *
     * @param memo 描述
     */
    public void setMemo(String memo) {
        this.memo = memo;
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