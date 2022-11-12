package Q_And_A_2;

public class Employee {
		
		private int id;
		private String name;
		private int salary;
		private double experience;
		public Employee() {
			super();
		}
		public Employee(int id, String name, int salary, double experience) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.experience = experience;
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
		public double getExperience() {
			return experience;
		}
		public void setExperience(double experience) {
			this.experience = experience;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
		}
		
		double generateBonus(int salary){
			 if(salary > 9000) {
				 return (salary * 20)/100;
			 }else {
				 return (salary * 10)/100;
			 }
		}
		
		double generateBonus(double exp){
			  if(exp > 5) {
				  return (this.getSalary() * 20)/100;
			  }else {
				  return (this.getSalary() * 10)/100;
			  }
		

	

	}

}
