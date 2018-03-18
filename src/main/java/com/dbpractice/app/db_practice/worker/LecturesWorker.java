package com.dbpractice.app.db_practice.worker;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbpractice.app.db_practice.dao.LecturesDAO;
import com.dbpractice.app.db_practice.enity.Lecture;

public class LecturesWorker {
	@Autowired
	LecturesDAO lecturesDao;

	public Lecture addLecture(Lecture lecture) {
		lecture = lecturesDao.addLecture(lecture);
		System.out.println(lecture);
		return lecture;
	}

	public Lecture getLecture(int id){
		Lecture lecture = lecturesDao.getLecture(id);
		System.out.println(lecture);
		return lecture;
	}
}
