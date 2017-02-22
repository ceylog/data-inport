package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "risk_scence_config")
public class RiskScenceConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 方案ID
     */
    @Column(name = "scene_id")
    private String sceneId;

    /**
     * 2：前置、4：反欺诈、8：决策
     */
    private Integer type;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取方案ID
     *
     * @return scene_id - 方案ID
     */
    public String getSceneId() {
        return sceneId;
    }

    /**
     * 设置方案ID
     *
     * @param sceneId 方案ID
     */
    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    /**
     * 获取2：前置、4：反欺诈、8：决策
     *
     * @return type - 2：前置、4：反欺诈、8：决策
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置2：前置、4：反欺诈、8：决策
     *
     * @param type 2：前置、4：反欺诈、8：决策
     */
    public void setType(Integer type) {
        this.type = type;
    }
}