package com.beanInheritance;

public class RegEmployee extends Employee {

	private int salary;
	private int bonus;
	
	public RegEmployee() {
		super();
	}
	public RegEmployee(int id, String name, String gender ,int salary, int bonus) {
		super(id, name, gender);
		this.salary=salary;
		this.bonus=bonus;
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
		return "RegEmployee [id=" + getId() + ", name=" + getName() + ", gender=" + getGender()  +  " ,salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
