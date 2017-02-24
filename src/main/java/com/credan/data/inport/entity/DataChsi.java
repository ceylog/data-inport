package com.credan.data.inport.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Table(name = "data_chsi")
public class DataChsi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "real_name")
    @JsonProperty("real_name")
    private String realName;

    private String sex;

    @Column(name ="date_birth")
    @JsonProperty("date_birth")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateBirth;

    private String nation;

    @Column(name = "id_card")
    @JsonProperty("id_card")
    private String idCard;

    @Column(name = "academy_name")
    @JsonProperty("academy_name")
    private String academyName;

    @Column(name = "academic_level")
    @JsonProperty("academic_level")
    private String academicLevel;

    @Column(name = "major_name")
    @JsonProperty("major_name")
    private String majorName;

    @Column(name = "length_school")
    @JsonProperty("length_school")
    private String lengthSchool;

    @Column(name = "education_background")
    @JsonProperty("education_background")
    private String educationBackground;

    @Column(name = "learning_form")
    @JsonProperty("learning_form")
    private String learningForm;

    private String series;

    @Column(name = "class")
    @JsonProperty("class")
    private String class1;

    @Column(name = "student_number")
    @JsonProperty("student_number")
    private String studentNumber;

    @Column(name = "date_enrollment")
    @JsonProperty("date_enrollment")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateEnrollment;

    @Column(name = "date_graduation")
    @JsonProperty("date_graduation")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateGraduation;

    @Column(name = "school_status")
    @JsonProperty("school_status")
    private String schoolStatus;

    @Column(name = "exam_number")
    @JsonProperty("exam_number")
    private String examNumber;

    @Column(name = "branch_courts")
    @JsonProperty("branch_courts")
    private String branchCourts;

    @Column(name = "accept_letter_pic")
    @JsonProperty("accept_letter_pic")
    private String acceptLetterPic;
    @Column(name = "study_fee_pic")
    @JsonProperty("study_fee_pic")
    private String studyFeePic;
    @Column(name = "education_type")
    @JsonProperty("education_type")
    private String educationType;


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
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
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
     * @return academy_name
     */
    public String getAcademyName() {
        return academyName;
    }

    /**
     * @param academyName
     */
    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    /**
     * @return academic_level
     */
    public String getAcademicLevel() {
        return academicLevel;
    }

    /**
     * @param academicLevel
     */
    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    /**
     * @return major_name
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * @param majorName
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    /**
     * @return length_school
     */
    public String getLengthSchool() {
        return lengthSchool;
    }

    /**
     * @param lengthSchool
     */
    public void setLengthSchool(String lengthSchool) {
        this.lengthSchool = lengthSchool;
    }

    /**
     * @return education_background
     */
    public String getEducationBackground() {
        return educationBackground;
    }

    /**
     * @param educationBackground
     */
    public void setEducationBackground(String educationBackground) {
        this.educationBackground = educationBackground;
    }

    /**
     * @return learning_form
     */
    public String getLearningForm() {
        return learningForm;
    }

    /**
     * @param learningForm
     */
    public void setLearningForm(String learningForm) {
        this.learningForm = learningForm;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return series;
    }

    /**
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * @return class
     */
    public String getClass1() {
        return class1;
    }

    /**
     * @param class1
     */
    public void setClass1(String class1) {
        this.class1 = class1;
    }

    /**
     * @return student_number
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return date_enrollment
     */
    public Date getDateEnrollment() {
        return dateEnrollment;
    }

    /**
     * @param dateEnrollment
     */
    public void setDateEnrollment(Date dateEnrollment) {
        this.dateEnrollment = dateEnrollment;
    }

    /**
     * @return date_graduation
     */
    public Date getDateGraduation() {
        return dateGraduation;
    }

    /**
     * @param dateGraduation
     */
    public void setDateGraduation(Date dateGraduation) {
        this.dateGraduation = dateGraduation;
    }

    /**
     * @return school_status
     */
    public String getSchoolStatus() {
        return schoolStatus;
    }

    /**
     * @param schoolStatus
     */
    public void setSchoolStatus(String schoolStatus) {
        this.schoolStatus = schoolStatus;
    }

    /**
     * @return exam_number
     */
    public String getExamNumber() {
        return examNumber;
    }

    /**
     * @param examNumber
     */
    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }

    /**
     * @return branch_courts
     */
    public String getBranchCourts() {
        return branchCourts;
    }

    /**
     * @param branchCourts
     */
    public void setBranchCourts(String branchCourts) {
        this.branchCourts = branchCourts;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAcceptLetterPic() {
        return acceptLetterPic;
    }

    public void setAcceptLetterPic(String acceptLetterPic) {
        this.acceptLetterPic = acceptLetterPic;
    }

    public String getStudyFeePic() {
        return studyFeePic;
    }

    public void setStudyFeePic(String studyFeePic) {
        this.studyFeePic = studyFeePic;
    }

    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    @Override
    public String toString() {
        return "DataChsi{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", sex='" + sex + '\'' +
                ", dateBirth=" + dateBirth +
                ", nation='" + nation + '\'' +
                ", idCard='" + idCard + '\'' +
                ", academyName='" + academyName + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", majorName='" + majorName + '\'' +
                ", lengthSchool='" + lengthSchool + '\'' +
                ", educationBackground='" + educationBackground + '\'' +
                ", learningForm='" + learningForm + '\'' +
                ", series='" + series + '\'' +
                ", class1='" + class1 + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", dateEnrollment=" + dateEnrollment +
                ", dateGraduation=" + dateGraduation +
                ", schoolStatus='" + schoolStatus + '\'' +
                ", examNumber='" + examNumber + '\'' +
                ", branchCourts='" + branchCourts + '\'' +
                '}';
    }
}