package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "merchant_rsa_config")
public class MerchantRsaConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商户ID
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * credan私钥
     */
    @Column(name = "credan_rsa_private_key")
    private String credanRsaPrivateKey;

    /**
     * credan公钥
     */
    @Column(name = "credan_rsa_public_key")
    private String credanRsaPublicKey;

    /**
     * 商户私钥
     */
    @Column(name = "rsa_private_key")
    private String rsaPrivateKey;

    /**
     * 商户公钥
     */
    @Column(name = "rsa_public_key")
    private String rsaPublicKey;

    /**
     * AES加密字符串
     */
    @Column(name = "aes_key")
    private String aesKey;

    /**
     * 商户方运行环境
     */
    private String environment;

    /**
     * 备注
     */
    private String memo;

    /**
     * 删除标识0，1
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
     * 获取credan私钥
     *
     * @return credan_rsa_private_key - credan私钥
     */
    public String getCredanRsaPrivateKey() {
        return credanRsaPrivateKey;
    }

    /**
     * 设置credan私钥
     *
     * @param credanRsaPrivateKey credan私钥
     */
    public void setCredanRsaPrivateKey(String credanRsaPrivateKey) {
        this.credanRsaPrivateKey = credanRsaPrivateKey;
    }

    /**
     * 获取credan公钥
     *
     * @return credan_rsa_public_key - credan公钥
     */
    public String getCredanRsaPublicKey() {
        return credanRsaPublicKey;
    }

    /**
     * 设置credan公钥
     *
     * @param credanRsaPublicKey credan公钥
     */
    public void setCredanRsaPublicKey(String credanRsaPublicKey) {
        this.credanRsaPublicKey = credanRsaPublicKey;
    }

    /**
     * 获取商户私钥
     *
     * @return rsa_private_key - 商户私钥
     */
    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    /**
     * 设置商户私钥
     *
     * @param rsaPrivateKey 商户私钥
     */
    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
    }

    /**
     * 获取商户公钥
     *
     * @return rsa_public_key - 商户公钥
     */
    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    /**
     * 设置商户公钥
     *
     * @param rsaPublicKey 商户公钥
     */
    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    /**
     * 获取AES加密字符串
     *
     * @return aes_key - AES加密字符串
     */
    public String getAesKey() {
        return aesKey;
    }

    /**
     * 设置AES加密字符串
     *
     * @param aesKey AES加密字符串
     */
    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    /**
     * 获取商户方运行环境
     *
     * @return environment - 商户方运行环境
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * 设置商户方运行环境
     *
     * @param environment 商户方运行环境
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
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
     * 获取删除标识0，1
     *
     * @return del_flag - 删除标识0，1
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识0，1
     *
     * @param delFlag 删除标识0，1
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