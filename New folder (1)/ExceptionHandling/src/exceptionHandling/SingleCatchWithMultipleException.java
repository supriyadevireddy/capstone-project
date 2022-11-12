package exceptionHandling;

public class SingleCatchWithMultipleException {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.out.println(Integer.parseInt("abc"));
		}catch(ArithmeticException | NumberFormatException ex) {//none of those exception should be related
     System.out.println("please check the input");
     
	}

}
}