package oops.Strings;

public class ScpAndHeap {

	public static void main(String[] args) {
		
		
	String fName1 = "virat"; //Scp
	String fName2 = "virat"; //Scp
	String fName3 = "setwag";//Scp
	
	
	String fName4 = "rishab"; //Heap
	String fName5 = "rishab"; //Heap
	String fName6 = "Ashwin"; //Heap
	
	
	System.out.println("REFERENCE COMPARISION");
	System.out.println(fName1==fName2);//true
	System.out.println(fName2==fName3);//false
	System.out.println(fName4==fName5);//false
	System.out.println(fName5==fName6);//false
	
	System.out.println("CONTENT COMPARISION");
	System.out.println(fName1.equals(fName2));//true
	System.out.println(fName2.equals(fName3));//false
	System.out.println(fName4.equals(fName5));//true
	System.out.println(fName5.equals(fName6));//false
	
	

	}

}
