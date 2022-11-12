package Q_And_A;

public class Q_1_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q_1_Calculator obj = new Q_1_Calculator();
		
		System.out.println("addition result is "+ obj.addition(10,  20));
		System.out.println("subtraction result is "+ obj.subtraction(20,  10));
		System.out.println("multiplication result is "+ obj.multiplication(2,  5));
		System.out.println("division result is "+obj.division(5,  2));
		
	}
	
	
	int addition(int num1, int num2) {
		int sumResult = num1 + num2;
		return sumResult;
	}
	
	int subtraction(int num1, int num2) {
		int subtResult = num1 - num2;
		return subtResult;
	}
	
	int multiplication(int num1, int num2){
		 int multResult = num1 * num2;
		 return multResult;
	}
	
	double division(int num1, int num2){
		double divResult = (double) num1/num2;
		return divResult;
	}


	}


