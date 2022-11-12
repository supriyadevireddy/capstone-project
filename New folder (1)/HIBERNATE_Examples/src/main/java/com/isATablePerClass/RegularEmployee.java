package com.isATablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regularEmp_tableperclass")
public class RegularEmployee extends Employee{
	
	@Column(name="salary")
private int salary;
	@Column(name="bonus")
private int bonus;
	
public RegularEmployee() {
	super();
}
public RegularEmployee( int emplId , String name , String designation  , int salary, int bonus  ) {
	super(emplId , name , designation);
	this.salary = salary;
	this.bonus = bonus;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
}

}

