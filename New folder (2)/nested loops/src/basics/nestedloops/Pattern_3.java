package basics.nestedloops;

public class Pattern_3 {

	public static void main(String[] args) {
		
		int spacecount =0;
		int numberscount =9;
		
   for(int row=1; row<=9; row++) {//for rows
	   for(int col=1; col<=spacecount; col++) {//for spaces
		   System.out.println("  ");
		   
	   }
	   for(int col=1; col<=numberscount; col++) {//for numbers
           System.out.print(col+" ");
	}
       System.out.println();
       spacecount++; //increment
       numberscount--; //decrement
       

	}
		

	}

}
