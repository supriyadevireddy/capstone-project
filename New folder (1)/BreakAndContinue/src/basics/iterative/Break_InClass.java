package basics.iterative;

public class Break_InClass {
	//write java program to find out only first 3 numbers which are divisible by 5 in between 10 and 40

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 40;
		int num3 = 0;
		
		for (int i= num1; i<=num2; i++) {
			int count = 0;
			if(i%5==0) {
				count++;
				System.out.println(i);
			}
			if( count==3) {
				break;
			}
		}

	}

}
