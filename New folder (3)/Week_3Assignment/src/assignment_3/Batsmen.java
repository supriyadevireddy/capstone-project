package assignment_3;

public class Batsmen extends Player {
//noOfRuns,battingAverage
	private int noOfRuns;
	private int battingAverage;
	
	public Batsmen(int i, String string, String string2, int j, int k, int l, int m) {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Batsmen1(int jerseyNo, String name, String role, int noOfCatches, int salary, int noOfRuns, int battingAverage) {
		
		this.noOfRuns=noOfRuns;
		this.battingAverage=battingAverage;
	}
	double getBonus(){
		double bonus = 0.0;
		if(battingAverage > 45) {
			bonus=(getSalary()* 30)/100;
		}else if(battingAverage < 40) {
			bonus=(getSalary()* 20)/100;
			
		}else {
			bonus = (getSalary()* 10)/100;
			
		}
		return bonus;
		}
	public int getNoOfRuns() {
		return noOfRuns;
	}
	public void setNoOfRuns(int noOfRuns) {
		this.noOfRuns = noOfRuns;
	}
	public int getBattingAverage() {
		return battingAverage;
	}
	public void setBattingAverage(int battingAverage) {
		this.battingAverage = battingAverage;
	}
	@Override
	public String toString() {
		return "Batsmen [noOfRuns=" + noOfRuns + ", battingAverage=" + battingAverage + "]";
	}
	
	}
	

