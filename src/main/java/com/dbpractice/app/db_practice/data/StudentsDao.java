package com.dbpractice.app.db_practice.data;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);

}
