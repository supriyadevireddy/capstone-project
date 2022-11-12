package exceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		
		System.out.println("starting of main method");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ex) {
			System.out.println("please dont try to divide any number with 0");
		}finally {
			System.out.println("one important statement here");
		}
		System.out.println("ending of main method");

	}

}
