package Q_And_A_5;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		
		x = x+y;   // x = 30, y = 20
		y = x-y;  //30-20 - 10   -- y=10
		x = x-y;  // 30-10 = 20   -- x = 20
		
		
		System.out.println(x);
		
		System.out.println(y);
	}

}
