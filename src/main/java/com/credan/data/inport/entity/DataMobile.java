package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "data_mobile")
public class DataMobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "rpt_id")
    private String rptId;

    private String token;

    private String version;

    @Column(name = "update_time")
    private String updateTime;

    @Column(name = "contacts_class1_blacklist_cnt")
    private Integer contactsClass1BlacklistCnt;

    @Column(name = "contacts_router_ratio")
    private String contactsRouterRatio;

    @Column(name = "contacts_class2_blacklist_cnt")
    private Integer contactsClass2BlacklistCnt;

    @Column(name = "contacts_router_cnt")
    private Integer contactsRouterCnt;

    @Column(name = "contacts_class1_cnt")
    private Integer contactsClass1Cnt;

    @Column(name = "phone_gray_score")
    private Integer phoneGrayScore;

    @Column(name = "register_org_cnt")
    private Integer registerOrgCnt;

    @Column(name = "searched_org_cnt")
    private Integer searchedOrgCnt;

    @Column(name = "arised_open_web")
    private String arisedOpenWeb;

    @Column(name = "phone_with_other_idcards")
    private String phoneWithOtherIdcards;

    @Column(name = "idcard_with_other_phones")
    private String idcardWithOtherPhones;

    @Column(name = "idcard_with_other_names")
    private String idcardWithOtherNames;

    @Column(name = "searched_org_type")
    private String searchedOrgType;

    @Column(name = "register_org_type")
    private String registerOrgType;

    @Column(name = "phone_with_other_names")
    private String phoneWithOtherNames;

    @Column(name = "id_card")
    private String idCard;

    private String name;

    @Column(name = "main_service")
    private String mainService;

    @Column(name = "behavior_check")
    private String behaviorCheck;

    @Column(name = "collection_contact")
    private String collectionContact;

    @Column(name = "contact_list")
    private String contactList;

    @Column(name = "ebusiness_expense")
    private String ebusinessExpense;

    @Column(name = "contact_region")
    private String contactRegion;

    @Column(name = "application_check")
    private String applicationCheck;

    @Column(name = "deliver_address")
    private String deliverAddress;

    @Column(name = "trip_info")
    private String tripInfo;

    @Column(name = "cell_behavior")
    private String cellBehavior;

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
     * @return rpt_id
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * @param rptId
     */
    public void setRptId(String rptId) {
        this.rptId = rptId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return update_time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return contacts_class1_blacklist_cnt
     */
    public Integer getContactsClass1BlacklistCnt() {
        return contactsClass1BlacklistCnt;
    }

    /**
     * @param contactsClass1BlacklistCnt
     */
    public void setContactsClass1BlacklistCnt(Integer contactsClass1BlacklistCnt) {
        this.contactsClass1BlacklistCnt = contactsClass1BlacklistCnt;
    }

    /**
     * @return contacts_router_ratio
     */
    public String getContactsRouterRatio() {
        return contactsRouterRatio;
    }

    /**
     * @param contactsRouterRatio
     */
    public void setContactsRouterRatio(String contactsRouterRatio) {
        this.contactsRouterRatio = contactsRouterRatio;
    }

    /**
     * @return contacts_class2_blacklist_cnt
     */
    public Integer getContactsClass2BlacklistCnt() {
        return contactsClass2BlacklistCnt;
    }

    /**
     * @param contactsClass2BlacklistCnt
     */
    public void setContactsClass2BlacklistCnt(Integer contactsClass2BlacklistCnt) {
        this.contactsClass2BlacklistCnt = contactsClass2BlacklistCnt;
    }

    /**
     * @return contacts_router_cnt
     */
    public Integer getContactsRouterCnt() {
        return contactsRouterCnt;
    }

    /**
     * @param contactsRouterCnt
     */
    public void setContactsRouterCnt(Integer contactsRouterCnt) {
        this.contactsRouterCnt = contactsRouterCnt;
    }

    /**
     * @return contacts_class1_cnt
     */
    public Integer getContactsClass1Cnt() {
        return contactsClass1Cnt;
    }

    /**
     * @param contactsClass1Cnt
     */
    public void setContactsClass1Cnt(Integer contactsClass1Cnt) {
        this.contactsClass1Cnt = contactsClass1Cnt;
    }

    /**
     * @return phone_gray_score
     */
    public Integer getPhoneGrayScore() {
        return phoneGrayScore;
    }

    /**
     * @param phoneGrayScore
     */
    public void setPhoneGrayScore(Integer phoneGrayScore) {
        this.phoneGrayScore = phoneGrayScore;
    }

    /**
     * @return register_org_cnt
     */
    public Integer getRegisterOrgCnt() {
        return registerOrgCnt;
    }

    /**
     * @param registerOrgCnt
     */
    public void setRegisterOrgCnt(Integer registerOrgCnt) {
        this.registerOrgCnt = registerOrgCnt;
    }

    /**
     * @return searched_org_cnt
     */
    public Integer getSearchedOrgCnt() {
        return searchedOrgCnt;
    }

    /**
     * @param searchedOrgCnt
     */
    public void setSearchedOrgCnt(Integer searchedOrgCnt) {
        this.searchedOrgCnt = searchedOrgCnt;
    }

    /**
     * @return arised_open_web
     */
    public String getArisedOpenWeb() {
        return arisedOpenWeb;
    }

    /**
     * @param arisedOpenWeb
     */
    public void setArisedOpenWeb(String arisedOpenWeb) {
        this.arisedOpenWeb = arisedOpenWeb;
    }

    /**
     * @return phone_with_other_idcards
     */
    public String getPhoneWithOtherIdcards() {
        return phoneWithOtherIdcards;
    }

    /**
     * @param phoneWithOtherIdcards
     */
    public void setPhoneWithOtherIdcards(String phoneWithOtherIdcards) {
        this.phoneWithOtherIdcards = phoneWithOtherIdcards;
    }

    /**
     * @return idcard_with_other_phones
     */
    public String getIdcardWithOtherPhones() {
        return idcardWithOtherPhones;
    }

    /**
     * @param idcardWithOtherPhones
     */
    public void setIdcardWithOtherPhones(String idcardWithOtherPhones) {
        this.idcardWithOtherPhones = idcardWithOtherPhones;
    }

    /**
     * @return idcard_with_other_names
     */
    public String getIdcardWithOtherNames() {
        return idcardWithOtherNames;
    }

    /**
     * @param idcardWithOtherNames
     */
    public void setIdcardWithOtherNames(String idcardWithOtherNames) {
        this.idcardWithOtherNames = idcardWithOtherNames;
    }

    /**
     * @return searched_org_type
     */
    public String getSearchedOrgType() {
        return searchedOrgType;
    }

    /**
     * @param searchedOrgType
     */
    public void setSearchedOrgType(String searchedOrgType) {
        this.searchedOrgType = searchedOrgType;
    }

    /**
     * @return register_org_type
     */
    public String getRegisterOrgType() {
        return registerOrgType;
    }

    /**
     * @param registerOrgType
     */
    public void setRegisterOrgType(String registerOrgType) {
        this.registerOrgType = registerOrgType;
    }

    /**
     * @return phone_with_other_names
     */
    public String getPhoneWithOtherNames() {
        return phoneWithOtherNames;
    }

    /**
     * @param phoneWithOtherNames
     */
    public void setPhoneWithOtherNames(String phoneWithOtherNames) {
        this.phoneWithOtherNames = phoneWithOtherNames;
    }

    /**
     * @return id_card
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
     * @return main_service
     */
    public String getMainService() {
        return mainService;
    }

    /**
     * @param mainService
     */
    public void setMainService(String mainService) {
        this.mainService = mainService;
    }

    /**
     * @return behavior_check
     */
    public String getBehaviorCheck() {
        return behaviorCheck;
    }

    /**
     * @param behaviorCheck
     */
    public void setBehaviorCheck(String behaviorCheck) {
        this.behaviorCheck = behaviorCheck;
    }

    /**
     * @return collection_contact
     */
    public String getCollectionContact() {
        return collectionContact;
    }

    /**
     * @param collectionContact
     */
    public void setCollectionContact(String collectionContact) {
        this.collectionContact = collectionContact;
    }

    /**
     * @return contact_list
     */
    public String getContactList() {
        return contactList;
    }

    /**
     * @param contactList
     */
    public void setContactList(String contactList) {
        this.contactList = contactList;
    }

    /**
     * @return ebusiness_expense
     */
    public String getEbusinessExpense() {
        return ebusinessExpense;
    }

    /**
     * @param ebusinessExpense
     */
    public void setEbusinessExpense(String ebusinessExpense) {
        this.ebusinessExpense = ebusinessExpense;
    }

    /**
     * @return contact_region
     */
    public String getContactRegion() {
        return contactRegion;
    }

    /**
     * @param contactRegion
     */
    public void setContactRegion(String contactRegion) {
        this.contactRegion = contactRegion;
    }

    /**
     * @return application_check
     */
    public String getApplicationCheck() {
        return applicationCheck;
    }

    /**
     * @param applicationCheck
     */
    public void setApplicationCheck(String applicationCheck) {
        this.applicationCheck = applicationCheck;
    }

    /**
     * @return deliver_address
     */
    public String getDeliverAddress() {
        return deliverAddress;
    }

    /**
     * @param deliverAddress
     */
    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    /**
     * @return trip_info
     */
    public String getTripInfo() {
        return tripInfo;
    }

    /**
     * @param tripInfo
     */
    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo;
    }

    /**
     * @return cell_behavior
     */
    public String getCellBehavior() {
        return cellBehavior;
    }

    /**
     * @param cellBehavior
     */
    public void setCellBehavior(String cellBehavior) {
        this.cellBehavior = cellBehavior;
    }

    @Override
    public String toString() {
        return "DataMobile{" +
                "id='" + id + '\'' +
                ", rptId='" + rptId + '\'' +
                ", token='" + token + '\'' +
                ", version='" + version + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", contactsClass1BlacklistCnt=" + contactsClass1BlacklistCnt +
                ", contactsRouterRatio='" + contactsRouterRatio + '\'' +
                ", contactsClass2BlacklistCnt=" + contactsClass2BlacklistCnt +
                ", contactsRouterCnt=" + contactsRouterCnt +
                ", contactsClass1Cnt=" + contactsClass1Cnt +
                ", phoneGrayScore=" + phoneGrayScore +
                ", registerOrgCnt=" + registerOrgCnt +
                ", searchedOrgCnt=" + searchedOrgCnt +
                ", arisedOpenWeb='" + arisedOpenWeb + '\'' +
                ", phoneWithOtherIdcards='" + phoneWithOtherIdcards + '\'' +
                ", idcardWithOtherPhones='" + idcardWithOtherPhones + '\'' +
                ", idcardWithOtherNames='" + idcardWithOtherNames + '\'' +
                ", searchedOrgType='" + searchedOrgType + '\'' +
                ", registerOrgType='" + registerOrgType + '\'' +
                ", phoneWithOtherNames='" + phoneWithOtherNames + '\'' +
                ", idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", mainService='" + mainService + '\'' +
                ", behaviorCheck='" + behaviorCheck + '\'' +
                ", collectionContact='" + collectionContact + '\'' +
                ", contactList='" + contactList + '\'' +
                ", ebusinessExpense='" + ebusinessExpense + '\'' +
                ", contactRegion='" + contactRegion + '\'' +
                ", applicationCheck='" + applicationCheck + '\'' +
                ", deliverAddress='" + deliverAddress + '\'' +
                ", tripInfo='" + tripInfo + '\'' +
                ", cellBehavior='" + cellBehavior + '\'' +
                '}';
    }
}