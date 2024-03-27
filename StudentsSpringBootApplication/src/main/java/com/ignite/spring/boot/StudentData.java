package com.ignite.spring.boot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students_info")
public class StudentData {

	@Id
	@GeneratedValue
	int id;

	String name;
	String course;

	String college;

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", course=" + course + ", college=" + college + "]";
	}

	public StudentData() {
		super();
	}

	public StudentData(int id, String name, String course, String college) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.college = college;
	}

	public StudentData(String name, String course, String college) {
		super();
		this.name = name;
		this.course = course;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
