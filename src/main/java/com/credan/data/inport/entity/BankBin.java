package com.credan.data.inport.entity;

import javax.persistence.*;

@Table(name = "bank_bin")
public class BankBin {
    @Id
    private String bin;

    @Column(name = "bank_id")
    private Integer bankId;

    @Column(name = "num_of_digits")
    private Byte numOfDigits;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_type")
    private String cardType;

    private Boolean active;

    /**
     * @return bin
     */
    public String getBin() {
        return bin;
    }

    /**
     * @param bin
     */
    public void setBin(String bin) {
        this.bin = bin;
    }

    /**
     * @return bank_id
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * @param bankId
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * @return num_of_digits
     */
    public Byte getNumOfDigits() {
        return numOfDigits;
    }

    /**
     * @param numOfDigits
     */
    public void setNumOfDigits(Byte numOfDigits) {
        this.numOfDigits = numOfDigits;
    }

    /**
     * @return card_name
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * @return card_type
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
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