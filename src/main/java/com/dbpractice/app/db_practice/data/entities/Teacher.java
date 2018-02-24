package com.dbpractice.app.db_practice.data.entities;



import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="TEACHERS")
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	     
	@Column(name="birth_date")
	private Date birthDate;
	    
	@Column(name="cell_phone")
	private String cellphone;
	
	public Teacher(){
		
	}
	public Teacher(int id, String firstname, String lastname, Date birthDate, String phone){
		teacherId = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		cellphone = phone;
	}
	
	public int getId(){
		return teacherId;
	}
	public String getFirstname(){
		return firstname;
	}
	public String getLastname(){
		return lastname;
	}
	public Date getBirthDate(){
		return birthDate;
	}
	public String getCellphone(){
		return cellphone;
	}
	
	
	public void setId(int id){
		teacherId = id;
	}
	public void setFirstname(String name){
		this.firstname = name;
	}
	public void setLastname(String name){
		this.lastname = name;
	}
	public void setBirthDate(Date date){
		this.birthDate = date;
	}
	public void setCellphone(String phone){
		this.cellphone = phone;
	}
	
	public String toString(){
		return (firstname+" "+lastname + " "+birthDate+" "+cellphone);
	}
}
