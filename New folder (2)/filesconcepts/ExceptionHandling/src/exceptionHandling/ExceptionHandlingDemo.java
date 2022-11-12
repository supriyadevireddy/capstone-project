package exceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("starting of main method");
		int[]marks = new int[4];
		try {
			System.out.println(10/2);
			System.out.println(marks[0]);
		}catch(ArithmeticException ex) {
			System.out.println("please check the input provided");
		}
		System.out.println("ending of main method");
	}

}
