package com.session;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_tab")
public class Employee {
@Id
@Column(name = "emplId")
@GeneratedValue(strategy = GenerationType.AUTO)
private int emplId;
@Column(name="e_name")
private String name;
@Column(name="e_salary")
private int salary;

public Employee() {
	super();
}
public Employee(int emplId, String name, int salary) {
	super();
	this.emplId = emplId;
	this.name = name;
	this.salary = salary;
}
public int getEmplId() {
	return emplId;
}
public void setEmplId(int emplId) {
	this.emplId = emplId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [emplId=" + emplId + ", name=" + name + ", salary=" + salary + "]";
}

}

