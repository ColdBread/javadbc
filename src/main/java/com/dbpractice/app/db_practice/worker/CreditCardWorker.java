package com.dbpractice.app.db_practice.worker;

import com.dbpractice.app.db_practice.dao.CreditCardDao;
import com.dbpractice.app.db_practice.enity.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;

public class CreditCardWorker {
    @Autowired
    CreditCardDao creditCardDao;

    public CreditCard addCreditCard(CreditCard creditCard) {
        creditCard = creditCardDao.addCreditCard(creditCard);
        System.out.println(creditCard);
        return creditCard;
    }
}
