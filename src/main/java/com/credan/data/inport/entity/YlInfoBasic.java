package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "yl_info_basic")
public class YlInfoBasic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * id
     */
    private Integer sid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 电话号码
     */
    private String mobile;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 工龄
     */
    private String workyear;

    /**
     * 公司
     */
    private String company;

    /**
     * 职位
     */
    private String position;

    /**
     * 学历
     */
    private String degree;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update")
    private String lastUpdate;

    /**
     * 身份证号码
     */
    @Column(name = "idcard_number")
    private String idcardNumber;

    /**
     * 自我介绍
     */
    @Column(name = "self_intro")
    private String selfIntro;

    private String email;

    private String hukou;

    @Column(name = "month_salary")
    private String monthSalary;

    private String scholl;

    private String department;

    private String industry;

    private String skills;

    private String avatar;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取id
     *
     * @return sid - id
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置id
     *
     * @param sid id
     */
    public void setSid(Integer sid) {
        this.sid = sid;
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
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取电话号码
     *
     * @return mobile - 电话号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话号码
     *
     * @param mobile 电话号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * 获取生日
     *
     * @return birthday - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取工龄
     *
     * @return workyear - 工龄
     */
    public String getWorkyear() {
        return workyear;
    }

    /**
     * 设置工龄
     *
     * @param workyear 工龄
     */
    public void setWorkyear(String workyear) {
        this.workyear = workyear;
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取职位
     *
     * @return position - 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职位
     *
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取学历
     *
     * @return degree - 学历
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置学历
     *
     * @param degree 学历
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update - 最后更新时间
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdate 最后更新时间
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * 获取身份证号码
     *
     * @return idcard_number - 身份证号码
     */
    public String getIdcardNumber() {
        return idcardNumber;
    }

    /**
     * 设置身份证号码
     *
     * @param idcardNumber 身份证号码
     */
    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    /**
     * 获取自我介绍
     *
     * @return self_intro - 自我介绍
     */
    public String getSelfIntro() {
        return selfIntro;
    }

    /**
     * 设置自我介绍
     *
     * @param selfIntro 自我介绍
     */
    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return hukou
     */
    public String getHukou() {
        return hukou;
    }

    /**
     * @param hukou
     */
    public void setHukou(String hukou) {
        this.hukou = hukou;
    }

    /**
     * @return month_salary
     */
    public String getMonthSalary() {
        return monthSalary;
    }

    /**
     * @param monthSalary
     */
    public void setMonthSalary(String monthSalary) {
        this.monthSalary = monthSalary;
    }

    /**
     * @return scholl
     */
    public String getScholl() {
        return scholl;
    }

    /**
     * @param scholl
     */
    public void setScholl(String scholl) {
        this.scholl = scholl;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * @return skills
     */
    public String getSkills() {
        return skills;
    }

    /**
     * @param skills
     */
    public void setSkills(String skills) {
        this.skills = skills;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}