package com.dbpractice.app.db_practice;



import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbpractice.app.db_practice.Worker.WorkWithStudents;
import com.dbpractice.app.db_practice.Worker.WorkWithTeacher;
import com.dbpractice.app.db_practice.data.Student;
import com.dbpractice.app.db_practice.data.entities.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
        Student testStudent = new Student("Vlad Valt", 5);
        worker.saveStudentToDb(testStudent);
        WorkWithTeacher workWithTeacher = 
        		(WorkWithTeacher) context.getBean("teacherWorker");
        		Teacher teacher = new Teacher();
        		teacher.setFirstname("Oleksandr");
        		teacher.setLastname("Malinovkiy");
        		teacher.setCellphone("+380675847365");
        		teacher = workWithTeacher.addTeacher(teacher);
        		teacher.setBirthDate(new Date());
        		workWithTeacher.saveTeacher(teacher);

    }
}
