package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "risk_key")
public class RiskKey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String key;

    private Long score;

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
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return score
     */
    public Long getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Long score) {
        this.score = score;
    }
}