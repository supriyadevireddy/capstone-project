package oops.overridingconcepts;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(1,"harsha",9000);
		Developer dev = new Developer(2,"vishnu",8000,20,10);
        Tester test = new Tester(3,"kumar",7000,20,5);
        //get bonus __10% of salary andreturn the output
        
        
        System.out.println("Employee bonus generated is "+emp.getbonus());
        System.out.println("Developer bonus generated is "+dev.getbonu());
        System.out.println("Tester bonus generated is"+test.getbonus());
	}

}
