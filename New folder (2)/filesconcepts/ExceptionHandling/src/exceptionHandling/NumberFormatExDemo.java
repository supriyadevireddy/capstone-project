package exceptionHandling;

public class NumberFormatExDemo {

	public static void main(String[] args) {
	
		String num = "90";
		String num2 = "abc";
//convert 90 from String format to Integer format__parseInt
		Integer x = Integer.parseInt(num);
		System.out.println(x);
		Integer y = Integer.parseInt(num2);
		System.out.println(y);
		
		String num3 = x.toString();
		System.out.println(num3);
	}
	

}
