package com.hasA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_hasA")
public class Employee {
	@Id
	@Column(name="e_id")
private int emplId ; 
	@Column(name="e_name")
private String name;
	@Column(name="e_salary")
private int salary;
	
	@OneToOne
	@JoinColumn(name="doorNo")
private Address address;

public Employee() {
	
	super();
}
public Employee(int emplId, String name, int salary, Address address) {
	super();
	this.emplId = emplId;
	this.name = name;
	this.salary = salary;
	this.address = address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [emplId=" + emplId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}

}

