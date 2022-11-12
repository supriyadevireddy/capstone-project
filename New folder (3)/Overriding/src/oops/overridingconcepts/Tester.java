
package oops.overridingconcepts;

public class Tester extends Employee{
private int noOfIssuesRaised;
private int noOfIssuesClosed;
public Tester() {
	super();
}
public Tester(int id,String name,int salary,int noOfIssuesRaised,int noOfIssuesClosed) {
	super(id,name,salary);
	this.noOfIssuesRaised=noOfIssuesRaised;
	this.noOfIssuesClosed=noOfIssuesClosed;

}
int getbonus() {
	int bonus=(getSalary()* 30)/100;
	return bonus;
}
public int getNoOfIssuesRaised() {
	return noOfIssuesRaised;
}
public void setNoOfIssuesRaised(int noOfIssuesRaised) {
	this.noOfIssuesRaised = noOfIssuesRaised;
}
public int getNoOfIssuesClosed() {
	return noOfIssuesClosed;
}
public void setNoOfIssuesClosed(int noOfIssuesClosed) {
	this.noOfIssuesClosed = noOfIssuesClosed;
}
@Override
public String toString() {
	return "Tester [noOfIssuesRaised=" + noOfIssuesRaised + ", noOfIssuesClosed=" + noOfIssuesClosed + "]";
}
public String getbonus1() {
	return null;
}
}
