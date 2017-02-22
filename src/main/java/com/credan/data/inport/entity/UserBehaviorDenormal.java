package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_behavior_denormal")
public class UserBehaviorDenormal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 1: device_id
2: email
3: phone
4: id_number
5:name
     */
    @Id
    @Column(name = "id_type")
    private Integer idType;

    /**
     * time interval:
24h,
48h,
168h
and so on
     */
    @Column(name = "count_24h")
    private Integer count24h;

    @Column(name = "count_2d")
    private Integer count2d;

    @Column(name = "count_7d")
    private Integer count7d;

    @Column(name = "count_30d")
    private Integer count30d;

    @Column(name = "count_3m")
    private Integer count3m;

    @Column(name = "last_updated")
    private Date lastUpdated;

    private Boolean active;

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
     * 获取1: device_id
2: email
3: phone
4: id_number
5:name
     *
     * @return id_type - 1: device_id
2: email
3: phone
4: id_number
5:name
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * 设置1: device_id
2: email
3: phone
4: id_number
5:name
     *
     * @param idType 1: device_id
2: email
3: phone
4: id_number
5:name
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     * 获取time interval:
24h,
48h,
168h
and so on
     *
     * @return count_24h - time interval:
24h,
48h,
168h
and so on
     */
    public Integer getCount24h() {
        return count24h;
    }

    /**
     * 设置time interval:
24h,
48h,
168h
and so on
     *
     * @param count24h time interval:
24h,
48h,
168h
and so on
     */
    public void setCount24h(Integer count24h) {
        this.count24h = count24h;
    }

    /**
     * @return count_2d
     */
    public Integer getCount2d() {
        return count2d;
    }

    /**
     * @param count2d
     */
    public void setCount2d(Integer count2d) {
        this.count2d = count2d;
    }

    /**
     * @return count_7d
     */
    public Integer getCount7d() {
        return count7d;
    }

    /**
     * @param count7d
     */
    public void setCount7d(Integer count7d) {
        this.count7d = count7d;
    }

    /**
     * @return count_30d
     */
    public Integer getCount30d() {
        return count30d;
    }

    /**
     * @param count30d
     */
    public void setCount30d(Integer count30d) {
        this.count30d = count30d;
    }

    /**
     * @return count_3m
     */
    public Integer getCount3m() {
        return count3m;
    }

    /**
     * @param count3m
     */
    public void setCount3m(Integer count3m) {
        this.count3m = count3m;
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
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }
}