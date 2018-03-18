package com.dbpractice.app.db_practice.worker;

import com.dbpractice.app.db_practice.dao.LecturerDao;
import com.dbpractice.app.db_practice.enity.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturersWorker {
    @Autowired
    LecturerDao lecturersDao;

    public Lecturer addLecturer(Lecturer lecturer) {
        lecturer = lecturersDao.addLecturer(lecturer);
        System.out.println(lecturer);
        return lecturer;
    }
}
