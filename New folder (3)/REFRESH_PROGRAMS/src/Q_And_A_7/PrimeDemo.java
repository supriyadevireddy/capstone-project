package Q_And_A_7;

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 7;
		boolean flag = true;
		
		for(int i=2; i<target/2; i++) {
			  if(target%i  == 0) {
				  flag = false;
				  break;
			  }
		}
		
		String result = (flag) ? "PRIME" : "NOT PRIME";
		
		System.out.println(result);
	}

}
