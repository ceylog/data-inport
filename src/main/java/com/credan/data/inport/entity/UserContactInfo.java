package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_contact_info")
public class UserContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 
产品类型：0：商品贷；1：现金贷；2：闪电贷
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * 1:配偶；2：父母；3：子女；4：兄弟姐妹；5：同事；6：朋友；10：父亲；11：母亲；
     */
    @Column(name = "relation_type")
    private Integer relationType;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 1：第一联系人；2：第二联系人；3：第三联系人
     */
    private Integer rank;

    /**
     * 0：有效；1：删除
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
     * 获取
产品类型：0：商品贷；1：现金贷；2：闪电贷
     *
     * @return product_type - 
产品类型：0：商品贷；1：现金贷；2：闪电贷
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置
产品类型：0：商品贷；1：现金贷；2：闪电贷
     *
     * @param productType 
产品类型：0：商品贷；1：现金贷；2：闪电贷
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取1:配偶；2：父母；3：子女；4：兄弟姐妹；5：同事；6：朋友；10：父亲；11：母亲；
     *
     * @return relation_type - 1:配偶；2：父母；3：子女；4：兄弟姐妹；5：同事；6：朋友；10：父亲；11：母亲；
     */
    public Integer getRelationType() {
        return relationType;
    }

    /**
     * 设置1:配偶；2：父母；3：子女；4：兄弟姐妹；5：同事；6：朋友；10：父亲；11：母亲；
     *
     * @param relationType 1:配偶；2：父母；3：子女；4：兄弟姐妹；5：同事；6：朋友；10：父亲；11：母亲；
     */
    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取1：第一联系人；2：第二联系人；3：第三联系人
     *
     * @return rank - 1：第一联系人；2：第二联系人；3：第三联系人
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置1：第一联系人；2：第二联系人；3：第三联系人
     *
     * @param rank 1：第一联系人；2：第二联系人；3：第三联系人
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取0：有效；1：删除
     *
     * @return del_flag - 0：有效；1：删除
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置0：有效；1：删除
     *
     * @param delFlag 0：有效；1：删除
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