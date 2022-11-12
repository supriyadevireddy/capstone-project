package java_8_features;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the 1 abstract method of Functional interface can be implemented through using lambda expressions
				ATM icici = (pinNo) -> {
										System.out.println("this is icici way of implementing validatePin method of Atm interface");
										return true;
								  };
				
				boolean result = icici.validatePin(2020);
				System.out.println("icici object result is "+result);
				icici.addNumbers(1, 3);
				ATM.m1();
				
				System.out.println();
				
				ATM sbi = (pinNo) -> {
									System.out.println("this is sbi way of implementing validatePin method of Atm interface");
									return false;
									};
									
		     boolean result2 = sbi.validatePin(34343);
		     System.out.println("sbi result is "+result2);
		     sbi.addNumbers(4,  5);
				
			}

		

	}


