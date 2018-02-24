package com.dbpractice.app.db_practice.data.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dbpractice.app.db_practice.data.TeachersDao;
import com.dbpractice.app.db_practice.data.entities.Teacher;

@Repository
public class HibernateTeachersDao implements TeachersDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addTeacher(Teacher teacher) {
		currentSession().save(teacher);
	}

	public Teacher getTeacherById(int id) {
		return (Teacher) currentSession().get(Teacher.class, id);
	}

	public void saveTeacher(Teacher teacher) {
		currentSession().update(teacher);
	}
}
