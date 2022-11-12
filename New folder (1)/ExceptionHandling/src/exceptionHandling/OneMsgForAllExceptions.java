package exceptionHandling;

import java.rmi.ConnectException;

public class OneMsgForAllExceptions {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ConnectException {
		
		System.out.println("starting of main method");
		
		try {
			System.out.println(10/2);
			int x = Integer.parseInt("abc");
		}catch(ArithmeticException ex) {
			System.out.println("please enter try to divide any number with 0");
			
		}
		System.out.println("ending of main method");

	}

}
