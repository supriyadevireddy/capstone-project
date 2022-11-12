package com.Bulk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="st_tab ")
public class Student {
	@Id
	@Column(name ="rollNo")
	@GeneratedValue(strategy=GenerationType.AUTO)
private int rollNo;
	@Column(name="name")
private String name;
	@Column(name="course")
private String course;

public Student() {
	super();
}
public Student(int rollNo, String name, String course) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.course = course;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
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
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
}


}

