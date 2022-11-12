package oops.classesAndobjects;

public class Student {


	
	private	int rollNo;
	private String name;
	private char gender;
	private static String course;
	private static String institute;
	
	
    public Student() {
    	super();
    	
	}
   //constructor is used to initialize the data in the objects 
    @SuppressWarnings("static-access")
	public Student (int rollNo,String name, char gender, String course, String institute) {
    	super();
    
    	this.rollNo = rollNo;
    	this.name = name;
    	this.gender = gender;
    	this.course = course;
    	this.institute = institute;
}
   public int getRollNo() { 
	   return rollNo;
   }
   public void setrollNo(int rollNo) {
	   this.rollNo =(1);
   }
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name = ("supriya");
   }
   public char getgender() {
	   return gender;
   }
   public void setgender(char gender) {
	   this.gender= ('f');
      
   }
public static String getCourse() {
	return course;
}
public static void setCourse(String course) {
	Student.course = ("java");
}
public static String getInstitute() {
	return institute;
}
public static void setInstitute(String institute) {
	Student.institute =("Odinschool");
}
public  static void main(String[] args) {
	System.out.println();
}
}
