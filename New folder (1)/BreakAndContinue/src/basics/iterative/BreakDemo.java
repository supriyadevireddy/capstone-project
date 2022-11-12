package basics.iterative;

public class BreakDemo {
	//write java program to find 3 even numbers in between 10 and 20

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		int num3 = 0;
		
		for(int i=num1; i<=num2; i++) {
			if(i % 2==0) {
				int count = 0;
				count++;
				System.out.println(i);
				if(count==3) {
					break;
				}
			}
		}

	}

}
