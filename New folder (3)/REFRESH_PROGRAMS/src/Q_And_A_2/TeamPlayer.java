package Q_And_A_2;

public class TeamPlayer extends Employee {

	private String role;
	private boolean isOnBench;
	
	public TeamPlayer() {
		super();
	}
	public TeamPlayer(int id, String name, int salary, double experience, String role, boolean isOnBench) {
		super(id, name, salary, experience);
		this.role = role;
		this.isOnBench = isOnBench;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isOnBench() {
		return isOnBench;
	}
	public void setOnBench(boolean isOnBench) {
		this.isOnBench = isOnBench;
	}
	
	double generateBonus(double exp){
		
		double exp1 = getExperience();
		// (if experience > 5 and not on bench then generate 30% of salary as bonus)
		if(exp1 > 5 && !isOnBench) {
			 return (getSalary() * 30)/100;
		}else if (exp1 > 5 && isOnBench) {
			return (getSalary() * 20)/100;
		}else if(exp1 < 5 && !isOnBench) {
			return (getSalary() * 25)/100;
		}else if (exp1 < 5 && isOnBench) {
			return (getSalary() * 10)/100;
		}else {
			return getSalary() * 0.1;
		}
		
	}
	
	
	
}

