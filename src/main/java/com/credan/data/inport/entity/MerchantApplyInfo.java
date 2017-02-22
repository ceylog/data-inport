package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_apply_info")
public class MerchantApplyInfo {
    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商户ID
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 工商注册名称
     */
    @Column(name = "reg_name")
    private String regName;

    /**
     * 商户简称
     */
    @Column(name = "short_name")
    private String shortName;

    /**
     * 工商注册号
     */
    @Column(name = "reg_num")
    private String regNum;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 公司详细地址
     */
    private String address;

    /**
     * 银行卡号码
     */
    @Column(name = "bank_num")
    private String bankNum;

    /**
     * 所属银行
     */
    @Column(name = "bank_bin")
    private String bankBin;

    /**
     * 法人姓名
     */
    private String name;

    /**
     * 法人手机号码
     */
    private String phone;

    /**
     * 法人身份证号码
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 业务类型 1：xian线下实体、2：线上电商
     */
    private String model;

    /**
     * 状态 完善信息：NEW、提交开户：AUDIT、等待录入开户信息:AUDITED、等待制作链接:WAITING、已完成：SUCCESS
     */
    private String status;

    /**
     * 二维码链接
     */
    @Column(name = "qr_code")
    private String qrCode;

    /**
     * 网址链接
     */
    private String link;

    /**
     * 附件地址
     */
    @Column(name = "doc_file")
    private String docFile;

    @Column(name = "del_flag")
    private String delFlag;

    private String remarks;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

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
     * 获取商户ID
     *
     * @return merchant_id - 商户ID
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户ID
     *
     * @param merchantId 商户ID
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取工商注册名称
     *
     * @return reg_name - 工商注册名称
     */
    public String getRegName() {
        return regName;
    }

    /**
     * 设置工商注册名称
     *
     * @param regName 工商注册名称
     */
    public void setRegName(String regName) {
        this.regName = regName;
    }

    /**
     * 获取商户简称
     *
     * @return short_name - 商户简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置商户简称
     *
     * @param shortName 商户简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 获取工商注册号
     *
     * @return reg_num - 工商注册号
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * 设置工商注册号
     *
     * @param regNum 工商注册号
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /**
     * 获取所在城市
     *
     * @return city - 所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在城市
     *
     * @param city 所在城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取公司详细地址
     *
     * @return address - 公司详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置公司详细地址
     *
     * @param address 公司详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取银行卡号码
     *
     * @return bank_num - 银行卡号码
     */
    public String getBankNum() {
        return bankNum;
    }

    /**
     * 设置银行卡号码
     *
     * @param bankNum 银行卡号码
     */
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    /**
     * 获取所属银行
     *
     * @return bank_bin - 所属银行
     */
    public String getBankBin() {
        return bankBin;
    }

    /**
     * 设置所属银行
     *
     * @param bankBin 所属银行
     */
    public void setBankBin(String bankBin) {
        this.bankBin = bankBin;
    }

    /**
     * 获取法人姓名
     *
     * @return name - 法人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置法人姓名
     *
     * @param name 法人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取法人手机号码
     *
     * @return phone - 法人手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置法人手机号码
     *
     * @param phone 法人手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取法人身份证号码
     *
     * @return id_card - 法人身份证号码
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置法人身份证号码
     *
     * @param idCard 法人身份证号码
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取业务类型 1：xian线下实体、2：线上电商
     *
     * @return model - 业务类型 1：xian线下实体、2：线上电商
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置业务类型 1：xian线下实体、2：线上电商
     *
     * @param model 业务类型 1：xian线下实体、2：线上电商
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取状态 完善信息：NEW、提交开户：AUDIT、等待录入开户信息:AUDITED、等待制作链接:WAITING、已完成：SUCCESS
     *
     * @return status - 状态 完善信息：NEW、提交开户：AUDIT、等待录入开户信息:AUDITED、等待制作链接:WAITING、已完成：SUCCESS
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 完善信息：NEW、提交开户：AUDIT、等待录入开户信息:AUDITED、等待制作链接:WAITING、已完成：SUCCESS
     *
     * @param status 状态 完善信息：NEW、提交开户：AUDIT、等待录入开户信息:AUDITED、等待制作链接:WAITING、已完成：SUCCESS
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取二维码链接
     *
     * @return qr_code - 二维码链接
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * 设置二维码链接
     *
     * @param qrCode 二维码链接
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * 获取网址链接
     *
     * @return link - 网址链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置网址链接
     *
     * @param link 网址链接
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取附件地址
     *
     * @return doc_file - 附件地址
     */
    public String getDocFile() {
        return docFile;
    }

    /**
     * 设置附件地址
     *
     * @param docFile 附件地址
     */
    public void setDocFile(String docFile) {
        this.docFile = docFile;
    }

    /**
     * @return del_flag
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}