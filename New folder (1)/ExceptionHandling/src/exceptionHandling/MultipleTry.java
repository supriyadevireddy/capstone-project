package exceptionHandling;

public class MultipleTry {

	public static void main(String[] args) {
		System.out.println("starting of main method");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ex) {
			System.out.println("some mistake happen in code");
		}
		try {
			System.out.println(Integer.parseInt("abc"));
		}catch(NumberFormatException ex) {
			System.out.println("please check the number");
		}
		System.out.println("ending of main method");
}

}
