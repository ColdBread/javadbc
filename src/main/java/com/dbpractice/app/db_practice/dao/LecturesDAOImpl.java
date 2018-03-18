package com.dbpractice.app.db_practice.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dbpractice.app.db_practice.enity.Lecture;

@Repository
@Transactional
public class LecturesDAOImpl implements LecturesDAO {
	@PersistenceContext
	private EntityManager em;

	public Lecture addLecture(Lecture lecture) {
		em.persist(lecture);
		return lecture;
	}

	public Lecture getLecture(int id) {
		return em.find(Lecture.class, id);
	}

	public void saveLecture(Lecture lecture) {
		em.merge(lecture);
	}
}
