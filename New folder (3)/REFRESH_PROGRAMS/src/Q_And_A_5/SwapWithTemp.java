package Q_And_A_5;

public class SwapWithTemp {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		int temp = x + y;  // temp = 30
		y = temp - y;  // y = 30-20 = 10    ---- x = 10, y = 10, temp = 30
		
		x = temp - y;  //30-10 - 20
		
		
		System.out.println(x);  // 20
		System.out.println(y);  // 10
		
	}

}

