package java_8_features;

@FunctionalInterface
public interface ATM {
	
	boolean validatePin(int pinNo);
	
	default void addNumbers(int x, int y){
		System.out.println("result is "+(x+y));
	}
	
	static void m1() {
		System.out.println("this is m1 method");
	}
	
	static void m2() {
		System.out.println("this is m2 method");
	}

}

