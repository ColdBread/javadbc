package com.dbpractice.app.db_practice.enity;

import javax.persistence.*;

@Entity
@Table(name = "credit_cards")
public class CreditCard {
    @Id
    private String number;
    private String expiryDate;
    private Integer controlNumber;
    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;
    @OneToOne(mappedBy = "card")
    private Lecturer lecturer;

    public CreditCard(){
        number="0000";
        expiryDate = "00/00";
        controlNumber = 0;
        creditCardType = CreditCardType.OTHER;
        lecturer = new Lecturer();
    }
    public CreditCard(String n, String d, int cn, CreditCardType t){
        number = n;
        expiryDate = d;
        controlNumber = cn;
        creditCardType = t;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Integer getControlNumber() {
        return controlNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
