
public class StringsDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String course = "java";
    
    System.out.println(course.length());//4
    System.out.println(course.charAt(0));//j
    System.out.println(course.indexOf('a'));//1
    System.out.println(course.lastIndexOf('a'));//3
    System.out.println(course.isEmpty());//false
    System.out.println(course.startsWith("j"));//true
    System.out.println(course.endsWith("a"));//true
    System.out.println(course.substring(2));//va
    System.out.println(course.concat("script"));//javascript
    System.out.println(course.toUpperCase());//JAVA
    System.out.println(course.toLowerCase());//java
    
    
    String player = " virat kohli ";
    
    System.out.println(player);//" virat kohli "
    System.out.println(player.trim());//"virat  kohli"
    System.out.println(String.join("__", course,"java","pant","jadeja"));
    
    System.out.println(course.replace('a','j')); 
    String heading ="India clinches towards victory ";
    String[] takes = heading.split(",");
	}
}
  
  
    
    
    
    


