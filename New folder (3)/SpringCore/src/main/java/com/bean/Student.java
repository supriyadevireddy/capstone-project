package com.bean;

public class Student {
	
private int rollNo;
private String name;
private Address adr;

public Student() {
	super();
}
public Student(int rollNo, String name, Address adr) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.adr = adr;
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
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", adr=" + adr + "]";
}


}

