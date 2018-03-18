package com.dbpractice.app.db_practice.enity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lecturers")
public class Lecturer {
    @EmbeddedId
    private PIB pib;
    private String degree;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "card_fk",nullable=false)
    private CreditCard card;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lecture_fk")
    private Lecture lecture;
    public Lecturer(){
        pib = new PIB();
        degree = "lecturer";
        dateOfBirth = new Date();
        lecture = new Lecture();
    }
    public Lecturer(PIB p,String d, Date b, CreditCard c, Lecture l){
        pib = p;
        degree = d;
        dateOfBirth = b;
        card = c;
        lecture = l;
    }

    public PIB getPib() {
        return pib;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public CreditCard getCard() {
        return card;
    }

    public String getDegree() {
        return degree;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPib(PIB pib) {
        this.pib = pib;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
}
