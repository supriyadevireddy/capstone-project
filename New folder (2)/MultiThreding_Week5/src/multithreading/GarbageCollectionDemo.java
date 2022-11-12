package multithreading;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
	
		Employee emp = new Employee(10,"harini", 9000);
		emp = new Employee(30,"sai", 8500);
		emp = new Employee(40,"supriya", 8000);
		emp = new Employee(50,"mastan", 9500);
        
System.out.println(emp);
System.gc();
	}

}
