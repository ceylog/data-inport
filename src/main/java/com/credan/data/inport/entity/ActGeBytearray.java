package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "act_ge_bytearray")
public class ActGeBytearray {
    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private Integer rev;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "DEPLOYMENT_ID_")
    private String deploymentId;

    @Column(name = "GENERATED_")
    private Byte generated;

    @Column(name = "BYTES_")
    private byte[] bytes;

    /**
     * @return ID_
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
     * @return DEPLOYMENT_ID_
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * @param deploymentId
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * @return GENERATED_
     */
    public Byte getGenerated() {
        return generated;
    }

    /**
     * @param generated
     */
    public void setGenerated(Byte generated) {
        this.generated = generated;
    }

    /**
     * @return BYTES_
     */
    public byte[] getBytes() {
        return bytes;
    }

    /**
     * @param bytes
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}