package com.dbpractice.app.db_practice.dao;


import com.dbpractice.app.db_practice.enity.CreditCard;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CreditCardDao {
    @PersistenceContext
    private EntityManager em;

    public CreditCard addCreditCard(CreditCard card) {
        em.persist(card);
        return card;
    }

    public CreditCard getCreditCard(String id) {
        return em.find(CreditCard.class, id);
    }

    public void saveCreditCard(CreditCard card) {
        em.merge(card);
    }
}
