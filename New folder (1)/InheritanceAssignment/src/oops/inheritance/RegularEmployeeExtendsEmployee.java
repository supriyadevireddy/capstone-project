package oops.inheritance;

public class RegularEmployeeExtendsEmployee {

	private int salary;
	private int bonus;
	
	public int getsalary() {
		return salary;
		
	}
	public void setsalary(int salary) {
		this.salary = salary;
		
	}
	public int getbonus() {
		return bonus;
	}
	public void setbonus(int bous, int bonus) {
		this.bonus = bonus;
	}
}