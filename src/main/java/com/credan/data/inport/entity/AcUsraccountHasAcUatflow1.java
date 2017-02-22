package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "ac_usraccount_has_ac_uatflow1")
public class AcUsraccountHasAcUatflow1 {
    @Id
    @Column(name = "ac_usrAccount_idac_usrAccount")
    private Integer acUsraccountIdacUsraccount;

    @Id
    @Column(name = "ac_uatFlow_idac_uatFlow")
    private Integer acUatflowIdacUatflow;

    /**
     * @return ac_usrAccount_idac_usrAccount
     */
    public Integer getAcUsraccountIdacUsraccount() {
        return acUsraccountIdacUsraccount;
    }

    /**
     * @param acUsraccountIdacUsraccount
     */
    public void setAcUsraccountIdacUsraccount(Integer acUsraccountIdacUsraccount) {
        this.acUsraccountIdacUsraccount = acUsraccountIdacUsraccount;
    }

    /**
     * @return ac_uatFlow_idac_uatFlow
     */
    public Integer getAcUatflowIdacUatflow() {
        return acUatflowIdacUatflow;
    }

    /**
     * @param acUatflowIdacUatflow
     */
    public void setAcUatflowIdacUatflow(Integer acUatflowIdacUatflow) {
        this.acUatflowIdacUatflow = acUatflowIdacUatflow;
    }
}