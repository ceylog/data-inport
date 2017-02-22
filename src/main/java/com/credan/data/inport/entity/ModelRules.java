package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "model_rules")
public class ModelRules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

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
}