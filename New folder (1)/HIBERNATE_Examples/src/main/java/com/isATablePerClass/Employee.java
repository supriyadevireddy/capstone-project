package com.isATablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name =  "emp_Tableperclass")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@Column(name = "emplId")
private int emplId;
	@Column(name = "name")
private String Name;
	@Column(name ="designation")
private String designation;

public Employee() {
	super();
}
public Employee(int emplId, String name, String designation) {
	super();
	this.emplId = emplId;
	Name = name;
	this.designation = designation;
}
public int getEmplId() {
	return emplId;
}
public void setEmplId(int emplId) {
	this.emplId = emplId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [emplId=" + emplId + ", Name=" + Name + ", designation=" + designation + "]";
}

}

