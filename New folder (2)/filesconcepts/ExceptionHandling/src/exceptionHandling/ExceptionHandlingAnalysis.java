package exceptionHandling;

public class ExceptionHandlingAnalysis {

	public static void main(String[] args) {
		
		System.out.println("starting of main method");
   //System.out.println(10/0);
		try {
			System.out.println(20/0);
			System.out.println("some stmt here");
			
		}catch(ArithmeticException ex) {
			System.out.println("please dont try to divide any number with 0");
		}
		System.out.println("ending of main method");
		}
	}

