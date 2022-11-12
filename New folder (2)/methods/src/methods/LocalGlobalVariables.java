package methods;

public class LocalGlobalVariables {
    
	static int rollno = 50; //global variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("starting of main method");
    String course ="java"; //local variables
    System.out.println("value of course is"+course);
    System.out.println("rollno");
    
    System.out.println("Ending of main method");
    
	}
    static void display() {
    	
    	
    	System.out.println("this is display method");
		char[] course = null;
		System.out.println(course);
    	System.out.println(rollno);
    }
    }