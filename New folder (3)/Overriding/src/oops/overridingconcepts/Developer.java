package oops.overridingconcepts;

public class Developer extends Employee {
	private int noOfIssuesAssigned;
	private int noOfIssuesResolved;
	public Developer(int i, String string, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public int getNoOfIssuesAssigned() {
		return noOfIssuesAssigned;
	}
	public int getNoOfIssuesResolved() {
		return noOfIssuesResolved;
	}
	public void setNoOfIssuesResolved(int noOfIssuesResolved) {
		this.noOfIssuesResolved = noOfIssuesResolved;
	}
	public void setNoOfIssuesAssigned(int noOfIssuesAssigned) {
		this.noOfIssuesAssigned = noOfIssuesAssigned;
	}
	@Override
	public String toString() {
		return "Developer [noOfIssuesAssigned=" + noOfIssuesAssigned + ", noOfIssuesResolved=" + noOfIssuesResolved
				+ "]";
	}
	public String getbonu() {
		// TODO Auto-generated method stub
		return null;
	}

}
