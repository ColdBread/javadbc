package com.dbpractice.app.db_practice.dao;

import com.dbpractice.app.db_practice.enity.Lecturer;
import com.dbpractice.app.db_practice.enity.PIB;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class LecturerDao {
    @PersistenceContext
    private EntityManager em;

    public Lecturer addLecturer(Lecturer lecturer) {
        em.persist(lecturer);
        return lecturer;
    }

    public Lecturer getLecturer(PIB id) {
        return em.find(Lecturer.class, id);
    }

    public void saveLecturer(Lecturer lecture) {
        em.merge(lecture);
    }
}
