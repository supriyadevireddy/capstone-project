package oops.inheritance;

public class Bowlers extends Players{
private int noOfWickets;
private int noOfFiveFor;
public Bowlers() {
	super();
	
}
public Bowlers(int jerseyNo , String name , String role , int noOfCatches , int salary , int noOfWickets, int noOfFiveFor) {
	super(jerseyNo,name,role, noOfCatches,salary);
	this.noOfWickets = noOfWickets;
	this.noOfFiveFor = noOfFiveFor;
}
    @SuppressWarnings("unused")
	int getbonus() {
    	int b=11;
   	 if(9>10) {
   		 System.out.println("bowlers bonus is 30%");
   	 }
   	 if (9>5) {
   		 System.out.println("bowlers bonus is 20%");
   	 }
   	 else {
   		 System.out.println("bowlers bonus is 10%");
   	 }
    	int bonus=(getSalary()*20)/100;
		return bonus;
	 
}

public int getNoOfWickets() {
	return noOfWickets;
}
public void setNoOfWickets(int noOfWickets) {
	this.noOfWickets = noOfWickets;
}
public int getNoOfFiveFor() {
	return noOfFiveFor;
}
public void setNoOfFiveFor(int noOfFiveFor) {
	this.noOfFiveFor = noOfFiveFor;
}


}
