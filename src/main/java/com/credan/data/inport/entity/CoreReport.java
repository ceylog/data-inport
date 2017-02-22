package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "core_report")
public class CoreReport {
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PARENT")
    private String parent;

    @Column(name = "TYPE")
    private Double type;

    @Column(name = "POSITION")
    private Double position;

    @Column(name = "XML")
    private String xml;

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return NAME
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
     * @return PARENT
     */
    public String getParent() {
        return parent;
    }

    /**
     * @param parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * @return TYPE
     */
    public Double getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Double type) {
        this.type = type;
    }

    /**
     * @return POSITION
     */
    public Double getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(Double position) {
        this.position = position;
    }

    /**
     * @return XML
     */
    public String getXml() {
        return xml;
    }

    /**
     * @param xml
     */
    public void setXml(String xml) {
        this.xml = xml;
    }
}