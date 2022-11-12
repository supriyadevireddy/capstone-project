package exceptionHandling;

public class ExceptionObjectInfo {

	public static void main(String[] args) {
		
		System.out.println("starting of main method");
		System.out.println(10/0);
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		   // System.out.println(ex.toString());
		}  //ex.printstackTrace();
		System.out.println("ending of main method");
	}

}
