package com.dbpractice.app.db_practice.enity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lectures")
public class Lecture {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	private String name;
	private double credits;
	@OneToMany(mappedBy = "lecture")
	private List<Lecturer> lecturers;
	// Getters and settings
	public Lecture(){
		id = 0;
		name = "predmet";
		credits = 0;
		lecturers = new ArrayList<Lecturer>();
	}

	public Lecture(int id, String n, double c, List<Lecturer> l){
		this.id = id;
		name = n;
		credits = c;
		lecturers = l;
	}

	public List<Lecturer> getLecturers() {
		return lecturers;
	}

	public void setLecturers(List<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}

	public void setId(int id){
		this.id = id;
	}
	public void setName (String name){
		this.name = name;
	}
	public void setCredits(double credits){
		this.credits = credits;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getCredits(){
		return credits;
	}

	@Override
	public String toString() {
		return id + " "+ name + " "+ credits + " " + lecturers.get(0);
	}
}
