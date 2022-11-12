package assignment_3;

public class Bowler1 extends Player {

//noOfWickets,noOfFiveFors
	private int noOfWickets;
	private int noOfFiveFors;
	public Bowler1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bowler1(int jerseyNo, String name, String role, int noOfCatches, int salary, int noOfWickets, int noOfFiveFors) {
		super(jerseyNo, name, role, noOfCatches, salary);
		// TODO Auto-generated constructor stub
	
	this.noOfWickets=noOfWickets;
	this.noOfFiveFors=noOfFiveFors;
	

	}
	public void Bowler(int i, String string, String string2, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	}
	double getbonus() {
		double bonus = 0.0;
		if(noOfFiveFors > 10) {
			bonus = (getSalary() * 30)/100;
		}else if (noOfFiveFors > 5) {
			bonus = (getSalary() * 20)/100;
		}else {
			bonus = (getSalary() * 10)/100;
		}
		return bonus;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public int getNoOfFiveFors() {
		return noOfFiveFors;
	}
	public void setNoOfFiveFors(int noOfFiveFors) {
		this.noOfFiveFors = noOfFiveFors;
	}
	@Override
	public String toString() {
		return "Bowler [noOfWickets=" + noOfWickets + ", noOfFiveFors=" + noOfFiveFors + "]";
	}

}
