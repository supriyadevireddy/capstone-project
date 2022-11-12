package com.depCheck;

public class Employee {
	 
	private int id;
	private String name;
	private int salary;
	
	private Atm atm;
	private Address adr;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int salary, Atm atm, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.atm = atm;
		this.adr = adr;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Atm getAtm() {
		return atm;
	}

	public void setAtm(Atm atm) {
		this.atm = atm;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", atm=" + atm + ", adr=" + adr + "]";
	}
	
	
}
