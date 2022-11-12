package com.Strings;

public class Strings {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String course = "java";
    		       //0123
    System.out.println(course.length());//4
    System.out.println(course.charAt(0));//j
    System.out.println(course.indexOf('a'));//1
    System.out.println(course.lastIndexOf('a'));//3
    System.out.println(course.isEmpty());//true
    System.out.println(course.endsWith("a"));//true
    System.out.println(course.substring(2));//v
    System.out.println(course.concat("script"));//javascript
    System.out.println(course.toUpperCase());//JAVA
    System.out.println(course.toLowerCase());//java
     
    
    String Player =  "   virat kohli  " ;
     
    System.out.println(Player);//" virat kohli "
    System.out.println(Player.trim());//"virat kohli"
    System.out.println(String.join("__",course,"java","pant","jadeja"));
    System.out.println(course.replace('a', 'z'));
    String heading = "india clinches towards Victory";
    String[] tokens = heading.split(", ");
    
    
    
    

}
}