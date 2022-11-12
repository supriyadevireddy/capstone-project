package com.pojo;
import java.io.Serializable;

public class Employee implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -106483496613312095L;
private int empId ;
private String name ;
private int salary;

public Employee() {
	super();
}
public Employee(int empId, String name, int salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
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
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
}

}

