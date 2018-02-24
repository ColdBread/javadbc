package com.dbpractice.app.db_practice.Worker;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbpractice.app.db_practice.data.Student;
import com.dbpractice.app.db_practice.data.StudentsDao;

public class WorkWithStudents {
	@Autowired
	private StudentsDao studentsDao;
	
	public void saveStudentToDb(Student student){
		if((student != null)&&(student.getPib()!=null)&&
				(!"".equals(student.getPib()))&&
				(student.getCourse()>0)){
		studentsDao.addStudent(student);
		System.out.println("Students have been saved " + student);
		}
	}
}
