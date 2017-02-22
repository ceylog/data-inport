package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "tmp_dual")
public class TmpDual {
    @Id
    private String du;

    /**
     * @return du
     */
    public String getDu() {
        return du;
    }

    /**
     * @param du
     */
    public void setDu(String du) {
        this.du = du;
    }
}