package basics.iterative;

public class Continue_Demo {
	//write java program to display only even numbers from 2 to 10

	public static void main(String[] args) {
		
		for (int i=2; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}

	}

}
