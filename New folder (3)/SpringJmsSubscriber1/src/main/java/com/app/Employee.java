package com.app;

import java.io.Serializable;

public class Employee  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8638235613232426759L;
	private int  emplId;
	private String name;
	private String gender;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(int emplId, String name, String gender, int salary) {
		super();
		this.emplId = emplId;
		this.name = name;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}


