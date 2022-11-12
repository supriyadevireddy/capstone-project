package java_8_features;

public interface Calculator {
int generateSum(int num1, int num2, int num3);
	
	
	default void multiply(int x, int y) {
		System.out.println("result of multiplication is "+ x*y );
}
}