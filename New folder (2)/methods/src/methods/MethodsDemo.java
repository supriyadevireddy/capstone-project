package methods;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("starting of main method");
   int r1 = additon(20, 30); //we are calling the method from main method
   System.out.println("output of addition recieved to main method is"+r1);
   double r2 = multiplication(10,2.3,4.5);
   System.out.println("output of multiplication recieved to main method is"+r2);
    
    System.out.println("Ending of main method"); 
    
	}
	  private static int additon(int i, int j) {
		return j;
		// TODO Auto-generated method stub
		
	}
	// requirement:write a method to perfome addition operation on 2 integer values as output
    int addition(int num1,int num2) {
    System.out.println("input recieved are"+num1+" and "+num2);
    int result = num1 + num2;
    System.out.println("output is  "+result);
    return result; //we are returning output back to caller statement of main method
    }
    
     static //requirement: write a method to perform multiplication on 1 integer and 2 decimal value as output
    double multiplication(int num1,double num2,double num3) {
    	System.out.println("input recieved are "+num1+" and "+num2+" and "+num3);
    	double result = num1*num2*num3;
    	return result;
    	
    	
    }
    
    
	}


