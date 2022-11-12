package basics.iterative;

public class BreakAndContinue {

	public static void main(String[] args) {
    
		for(int i=1; i<=10;i++) {
			if(i==4) {
				break; //will break the entire loop when condition satisfies__loop stops over there
				//continue;//to skip a specific iteration among all iterations
			}
			System.out.println("value of i is "+i);
		}

	}

}
