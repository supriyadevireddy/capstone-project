package Q_And_A_2;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp = new Employee(10, "harsha", 9500, 6);
		
		Employee emp2 = new Employee(20, "vishnu", 6000, 2);
		
		System.out.println("bonus generated based on salary for harsha is "+emp.generateBonus(emp.getSalary()));
		System.out.println("bonus generated based on exp for harsha is "+ emp.generateBonus(emp.getExperience()));
		
		System.out.println("bonus generated based on salary for vishnu is "+emp2.generateBonus(emp2.getSalary()));
		System.out.println("bonus generated based on exp for vishnu is "+ emp2.generateBonus(emp2.getExperience()));
		
		
	}

}
