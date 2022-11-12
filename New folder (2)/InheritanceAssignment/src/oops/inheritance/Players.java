package oops.inheritance;

public class Players {

	
		// TODO Auto-generated method stub
		private int jerseyNO;
		private String name;
		private String role;
		private int noOfCatches;
		private int salary;
		
		public Players() {
			super();
			
		}
		public Players(int jerseyNO, String name, String role, int noOfCatches, int salary) {
			super();
			this.jerseyNO = jerseyNO;
			this.name = name;
			this.role = role;
			this.noOfCatches = noOfCatches;
			this.salary = salary;
		}
	    public void Players1() {
			// TODO Auto-generated constructor stub
		}
		int getbonus() {
			int bonus=(salary*10)/100;
			return bonus;
			
		}
		public int getJerseyNO() {
			return jerseyNO;
		}
		public void setJerseyNO(int jerseyNO) {
			this.jerseyNO = jerseyNO;
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
			return "Players [jerseyNO=" + jerseyNO + ", name=" + name + ", role=" + role + ", noOfCatches=" + noOfCatches
					+ ", salary=" + salary + "]";
		}
		
		
		
	}


