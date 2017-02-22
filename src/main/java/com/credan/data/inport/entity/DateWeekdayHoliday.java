package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "date_weekday_holiday")
public class DateWeekdayHoliday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private String week;

    /**
     * 0：代表节假日，1：代表工作日
     */
    @Column(name = "date_code")
    private Integer dateCode;

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
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return week
     */
    public String getWeek() {
        return week;
    }

    /**
     * @param week
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * 获取0：代表节假日，1：代表工作日
     *
     * @return date_code - 0：代表节假日，1：代表工作日
     */
    public Integer getDateCode() {
        return dateCode;
    }

    /**
     * 设置0：代表节假日，1：代表工作日
     *
     * @param dateCode 0：代表节假日，1：代表工作日
     */
    public void setDateCode(Integer dateCode) {
        this.dateCode = dateCode;
    }
}