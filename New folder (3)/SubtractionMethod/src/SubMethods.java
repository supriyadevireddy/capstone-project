
public class SubMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("starting of main method");
     
    int i = subtraction(2.5,8, 1 );//we are calling the method from main method
    System.out.println("output of subtraction recieved to main method is "+i);
    System.out.println("Ending of main method");
	

		// TODO Auto-generated method stub
		return;
	}
//requirement:write a method to perform subtraction on 1 decimal and 1 integer value and return decimal value
	
	private static int subtraction(double d, int i, int result) {
		System.out.println("input recieved are "+d+"and"+i);
		return result;//we are returning output back to caler statement of main method
	}

}
