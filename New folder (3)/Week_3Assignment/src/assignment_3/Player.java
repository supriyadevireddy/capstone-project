package assignment_3;

public class Player {
//jerseyNo,name,role,noOfCatches,salary,
	
	private int jerseyNo;
	private String name;
	private String role;
	private int noOfCatches;
	private int salary;
	public Player() {
		super();
		
	}
	public Player(int jerseyNo, String name, String role, int noOfCatches, int salary) {
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.role = role;
		this.noOfCatches = noOfCatches;
		this.salary = salary;
	}
	double getbonus() {
		double bonus = (salary * 10)/100;
		return bonus;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getNoOfCatches() {
		return noOfCatches;
	}
	public void setNoOfCatches(int noOfCatches) {
		this.noOfCatches = noOfCatches;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", name=" + name + ", role=" + role + ", noOfCatches=" + noOfCatches
				+ ", salary=" + salary + "]";
	}
	
	

	}


