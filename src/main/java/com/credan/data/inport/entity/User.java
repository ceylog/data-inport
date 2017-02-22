package com.credan.data.inport.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    /**
     * 身份证号
     */
    @Column(name = "id_num")
    private String idNum;

    private String phone;

    private String email;

    /**
     * Unknown 0, 高中及以下 1，大专 2，本科 3，研究生及以上 4，其它 5；学生分期：10，大专；11，本科；12，研究生
     */
    @Column(name = "edu_level")
    private Integer eduLevel;

    /**
     * 未知0， 未婚1， 已婚无子女2， 已婚有子女3，离异4，丧偶5
     */
    @Column(name = "marital_status")
    private Integer maritalStatus;

    private Integer score;

    @Column(name = "monthly_after_tax")
    private BigDecimal monthlyAfterTax;

    @Column(name = "event_id")
    private String eventId;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private Date lastUpdated;

    /**
     * 0: active
10:验证手机号

100:验证四要素
1000:分期成功
     */
    @Column(name = "status_bit")
    private byte[] statusBit;

    @Column(name = "device_id")
    private String deviceId;

    /**
     * 支付密码
     */
    @Column(name = "pay_psw")
    private String payPsw;

    private String ip;

    /**
     * hukou:0,country;1,city
     */
    @Column(name = "register_type")
    private Integer registerType;

    private Integer position;

    private Integer profession;

    /**
     * guojia
     */
    private String country;

    @Column(name = "max_amount")
    private BigDecimal maxAmount;

    @Column(name = "min_amount")
    private BigDecimal minAmount;

    /**
     * 获审批利率
     */
    private BigDecimal interest;

    /**
     * 可用额度
     */
    @Column(name = "available_limit")
    private BigDecimal availableLimit;

    /**
     * 信用额度
     */
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;

    @Column(name = "risk_rate")
    private BigDecimal riskRate;

    @Column(name = "work_name")
    private String workName;

    @Column(name = "house_hold")
    private Integer houseHold;

    private Integer spouse;

    private Integer sex;

    private Integer age;

    private Integer title;

    @Column(name = "company_nature")
    private Integer companyNature;

    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "work_time")
    private String workTime;

    /**
     * 专业
     */
    private String major;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取身份证号
     *
     * @return id_num - 身份证号
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 设置身份证号
     *
     * @param idNum 身份证号
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取Unknown 0, 高中及以下 1，大专 2，本科 3，研究生及以上 4，其它 5；学生分期：10，大专；11，本科；12，研究生
     *
     * @return edu_level - Unknown 0, 高中及以下 1，大专 2，本科 3，研究生及以上 4，其它 5；学生分期：10，大专；11，本科；12，研究生
     */
    public Integer getEduLevel() {
        return eduLevel;
    }

    /**
     * 设置Unknown 0, 高中及以下 1，大专 2，本科 3，研究生及以上 4，其它 5；学生分期：10，大专；11，本科；12，研究生
     *
     * @param eduLevel Unknown 0, 高中及以下 1，大专 2，本科 3，研究生及以上 4，其它 5；学生分期：10，大专；11，本科；12，研究生
     */
    public void setEduLevel(Integer eduLevel) {
        this.eduLevel = eduLevel;
    }

    /**
     * 获取未知0， 未婚1， 已婚无子女2， 已婚有子女3，离异4，丧偶5
     *
     * @return marital_status - 未知0， 未婚1， 已婚无子女2， 已婚有子女3，离异4，丧偶5
     */
    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置未知0， 未婚1， 已婚无子女2， 已婚有子女3，离异4，丧偶5
     *
     * @param maritalStatus 未知0， 未婚1， 已婚无子女2， 已婚有子女3，离异4，丧偶5
     */
    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return monthly_after_tax
     */
    public BigDecimal getMonthlyAfterTax() {
        return monthlyAfterTax;
    }

    /**
     * @param monthlyAfterTax
     */
    public void setMonthlyAfterTax(BigDecimal monthlyAfterTax) {
        this.monthlyAfterTax = monthlyAfterTax;
    }

    /**
     * @return event_id
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * @param eventId
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * @return date_created
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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

    /**
     * 获取0: active
10:验证手机号

100:验证四要素
1000:分期成功
     *
     * @return status_bit - 0: active
10:验证手机号

100:验证四要素
1000:分期成功
     */
    public byte[] getStatusBit() {
        return statusBit;
    }

    /**
     * 设置0: active
10:验证手机号

100:验证四要素
1000:分期成功
     *
     * @param statusBit 0: active
10:验证手机号

100:验证四要素
1000:分期成功
     */
    public void setStatusBit(byte[] statusBit) {
        this.statusBit = statusBit;
    }

    /**
     * @return device_id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取支付密码
     *
     * @return pay_psw - 支付密码
     */
    public String getPayPsw() {
        return payPsw;
    }

    /**
     * 设置支付密码
     *
     * @param payPsw 支付密码
     */
    public void setPayPsw(String payPsw) {
        this.payPsw = payPsw;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取hukou:0,country;1,city
     *
     * @return register_type - hukou:0,country;1,city
     */
    public Integer getRegisterType() {
        return registerType;
    }

    /**
     * 设置hukou:0,country;1,city
     *
     * @param registerType hukou:0,country;1,city
     */
    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * @return profession
     */
    public Integer getProfession() {
        return profession;
    }

    /**
     * @param profession
     */
    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    /**
     * 获取guojia
     *
     * @return country - guojia
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置guojia
     *
     * @param country guojia
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return max_amount
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * @param maxAmount
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * @return min_amount
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * @param minAmount
     */
    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * 获取获审批利率
     *
     * @return interest - 获审批利率
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置获审批利率
     *
     * @param interest 获审批利率
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取可用额度
     *
     * @return available_limit - 可用额度
     */
    public BigDecimal getAvailableLimit() {
        return availableLimit;
    }

    /**
     * 设置可用额度
     *
     * @param availableLimit 可用额度
     */
    public void setAvailableLimit(BigDecimal availableLimit) {
        this.availableLimit = availableLimit;
    }

    /**
     * 获取信用额度
     *
     * @return credit_limit - 信用额度
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * 设置信用额度
     *
     * @param creditLimit 信用额度
     */
    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * @return risk_rate
     */
    public BigDecimal getRiskRate() {
        return riskRate;
    }

    /**
     * @param riskRate
     */
    public void setRiskRate(BigDecimal riskRate) {
        this.riskRate = riskRate;
    }

    /**
     * @return work_name
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * @param workName
     */
    public void setWorkName(String workName) {
        this.workName = workName;
    }

    /**
     * @return house_hold
     */
    public Integer getHouseHold() {
        return houseHold;
    }

    /**
     * @param houseHold
     */
    public void setHouseHold(Integer houseHold) {
        this.houseHold = houseHold;
    }

    /**
     * @return spouse
     */
    public Integer getSpouse() {
        return spouse;
    }

    /**
     * @param spouse
     */
    public void setSpouse(Integer spouse) {
        this.spouse = spouse;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return title
     */
    public Integer getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(Integer title) {
        this.title = title;
    }

    /**
     * @return company_nature
     */
    public Integer getCompanyNature() {
        return companyNature;
    }

    /**
     * @param companyNature
     */
    public void setCompanyNature(Integer companyNature) {
        this.companyNature = companyNature;
    }

    /**
     * @return session_id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * @return work_time
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * @param workTime
     */
    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }
}