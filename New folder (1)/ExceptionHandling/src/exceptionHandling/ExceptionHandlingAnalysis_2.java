package exceptionHandling;

public class ExceptionHandlingAnalysis_2 {

	public static void main(String[] args) {
		System.out.println("starting of main method");
       // System.out.println(10/0);
		int[]marks = new int[5];
		try {
			System.out.println(20/0);
			System.out.println("some stmt here");
			System.out.println(marks [6]);
		}catch(ArithmeticException ex) {
			System.out.println("please dont try to divide any number with 0");
		}catch(NullPointerException ex) {
			System.out.println("please dont call any method on null");
		}catch(StringIndexOutOfBoundsException ex) {
			System.out.println("please check the index position on String were operating");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("please check the index position on array we are operating");
		}
		System.out.println("ending of main method");
	}

}
