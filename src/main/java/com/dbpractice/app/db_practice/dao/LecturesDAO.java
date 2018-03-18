package com.dbpractice.app.db_practice.dao;

import com.dbpractice.app.db_practice.enity.Lecture;

public interface LecturesDAO {
	Lecture addLecture(Lecture lecture);

	Lecture getLecture(int id);

	void saveLecture(Lecture lecture);

}
