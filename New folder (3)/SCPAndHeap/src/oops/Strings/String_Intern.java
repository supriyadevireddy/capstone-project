package oops.Strings;

public class String_Intern {

	public static void main(String[] args) {
		
	String s1 = "java"; //Scp
	String s2 = new String("java"); //Heap
	String s3 = s2.intern(); //this will give you Scp memory reference of java
	
	System.out.println(s1==s3);
	System.out.println(s1==s2);

	}

}
