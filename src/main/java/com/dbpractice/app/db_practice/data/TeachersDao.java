package com.dbpractice.app.db_practice.data;

import com.dbpractice.app.db_practice.data.entities.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);
	Teacher getTeacherById(int id);
	void saveTeacher(Teacher teacher);
}
