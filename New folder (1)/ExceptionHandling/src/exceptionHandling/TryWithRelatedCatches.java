package exceptionHandling;

public class TryWithRelatedCatches {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//invalid code
		  try{
		  int x = Integer.parseInt("abc");
		  }catch(Exception ex){
		  System.out.println("some mistake happen in code");
		  }
   //valid code
		  System.out.println("starting of try block");
	try {
		int x = Integer.parseInt("abc");
		System.out.println("please check the number");
	}catch(Exception ex) {
		System.out.println("some mistake happen in code");
	}
	System.out.println("ending of try block");

}
}