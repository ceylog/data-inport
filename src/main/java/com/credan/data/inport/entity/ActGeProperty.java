package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_ge_property")
public class ActGeProperty {
    @Id
    @Column(name = "NAME_")
    private String name;

    @Column(name = "VALUE_")
    private String value;

    @Column(name = "REV_")
    private Integer rev;

    /**
     * @return NAME_
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
     * @return VALUE_
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return REV_
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * @param rev
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }
}