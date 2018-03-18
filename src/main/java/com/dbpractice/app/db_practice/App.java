package com.dbpractice.app.db_practice;

import java.util.Date;

import com.dbpractice.app.db_practice.enity.CreditCard;
import com.dbpractice.app.db_practice.enity.CreditCardType;
import com.dbpractice.app.db_practice.enity.Lecturer;
import com.dbpractice.app.db_practice.enity.PIB;
import com.dbpractice.app.db_practice.worker.CreditCardWorker;
import com.dbpractice.app.db_practice.worker.LecturersWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbpractice.app.db_practice.enity.Lecture;
import com.dbpractice.app.db_practice.worker.LecturesWorker;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		Lecture lecture = new Lecture();

		lecture.setName("Introduction to Spring");
		lecture.setCredits(2.5);
		LecturesWorker lectureWorker = (LecturesWorker) context.getBean("lectureWorker");
		LecturersWorker lecturersWorker = (LecturersWorker) context.getBean("lecturerWorker");
		CreditCardWorker creditCardWorker = (CreditCardWorker) context.getBean("creditCardWorker");
		CreditCard card = new CreditCard("0000","01/10",222,CreditCardType.VISA);
		creditCardWorker.addCreditCard(card);
		Lecturer lecturer = new Lecturer();
		lecturer.setPib(new PIB("Symonenko","Dmitryi","Valerievich"));
		lecturer.setDegree("hohland");
		lecturer.setDateOfBirth(new Date());
		lecturer.setCard(card);
		lecturer.setLecture(lecture);
		lectureWorker.addLecture(lecture);
		lecturersWorker.addLecturer(lecturer);
		lectureWorker.getLecture(1);



	}
}
