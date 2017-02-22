package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_mobile_label")
public class TMobileLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     *  查询号码
     */
    private String phone;

    /**
     * 是否诈骗、营销、广告电话
     */
    @Column(name = "is_zhapian")
    private String isZhapian;

    /**
     * 号码所属省份
     */
    private String province;

    /**
     *  号码所属城市
     */
    private String city;

    /**
     * 号码所属运营商
     */
    private String sp;

    /**
     * 号码性质
     */
    @Column(name = "rpt_type")
    private String rptType;

    /**
     *  号码性质描述
     */
    @Column(name = "rpt_comment")
    private String rptComment;

    /**
     *   标记人数
     */
    @Column(name = "rpt_cnt")
    private Long rptCnt;

    /**
     * 号码详细，可能部分号码为NULL
     */
    private String hy;

    /**
     * 标记次数描述
     */
    @Column(name = "countDesc")
    private String countdesc;

    /**
     * 数据来源（JUHE： 聚合数据）
     */
    private String source;

    private String memo;

    /**
     * 删除标记（0：未删除、1：已删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;

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
     * 获取 查询号码
     *
     * @return phone -  查询号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置 查询号码
     *
     * @param phone  查询号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取 是否诈骗、营销、广告电话
     *
     * @return is_zhapian - 是否诈骗、营销、广告电话
     */
    public String getIsZhapian() {
        return isZhapian;
    }

    /**
     * 设置是否诈骗、营销、广告电话
     *
     * @param isZhapian 是否诈骗、营销、广告电话
     */
    public void setIsZhapian(String isZhapian) {
        this.isZhapian = isZhapian;
    }

    /**
     * 获取 号码所属省份
     *
     * @return province - 号码所属省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置 号码所属省份
     *
     * @param province  号码所属省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取  号码所属城市
     *
     * @return city - 号码所属城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置 号码所属城市
     *
     * @param city 号码所属城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取 号码所属运营商
     *
     * @return sp - 号码所属运营商
     */
    public String getSp() {
        return sp;
    }

    /**
     * 设置 号码所属运营商
     *
     * @param sp  号码所属运营商
     */
    public void setSp(String sp) {
        this.sp = sp;
    }

    /**
     * 获取 号码性质
     *
     * @return rpt_type - 号码性质
     */
    public String getRptType() {
        return rptType;
    }

    /**
     * 设置 号码性质
     *
     * @param rptType  号码性质
     */
    public void setRptType(String rptType) {
        this.rptType = rptType;
    }

    /**
     * 获取 号码性质描述
     *
     * @return rpt_comment -   号码性质描述
     */
    public String getRptComment() {
        return rptComment;
    }

    /**
     * 设置  号码性质描述
     *
     * @param rptComment 号码性质描述
     */
    public void setRptComment(String rptComment) {
        this.rptComment = rptComment;
    }

    /**
     * 获取   标记人数
     *
     * @return rpt_cnt - 标记人数
     */
    public Long getRptCnt() {
        return rptCnt;
    }

    /**
     * 设置 标记人数
     *
     * @param rptCnt 标记人数
     */
    public void setRptCnt(Long rptCnt) {
        this.rptCnt = rptCnt;
    }

    /**
     * 获取 号码详细，可能部分号码为NULL
     *
     * @return hy - 号码详细，可能部分号码为NULL
     */
    public String getHy() {
        return hy;
    }

    /**
     * 设置/*号码详细，可能部分号码为NULL
     *
     * @param hy 号码详细，可能部分号码为NULL
     */
    public void setHy(String hy) {
        this.hy = hy;
    }

    /**
     * 获取标记次数描述
     *
     * @return countDesc - 标记次数描述
     */
    public String getCountdesc() {
        return countdesc;
    }

    /**
     * 设置标记次数描述
     *
     * @param countdesc 标记次数描述
     */
    public void setCountdesc(String countdesc) {
        this.countdesc = countdesc;
    }

    /**
     * 获取数据来源（JUHE： 聚合数据）
     *
     * @return source - 数据来源（JUHE： 聚合数据）
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置数据来源（JUHE： 聚合数据）
     *
     * @param source 数据来源（JUHE： 聚合数据）
     */
    public void setSource(String source) {
        this.source = source;
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

    /**
     * 获取删除标记（0：未删除、1：已删除）
     *
     * @return del_flag - 删除标记（0：未删除、1：已删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记（0：未删除、1：已删除）
     *
     * @param delFlag 删除标记（0：未删除、1：已删除）
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