package collections;

import java.util.ArrayList;

public class CollectionIntroduction_2 {

	public static void main(String[] args) {
	ArrayList<Object>listObj = new ArrayList<Object>();
    listObj.add(90);
    listObj.add(45);
    listObj.add("java");
    System.out.println(listObj.size());//3
    ArrayList<Object>listObj2=new ArrayList<Object>();
    listObj2.add("vishnu");
    listObj2.add("html");
    listObj2.add(listObj);
    
    System.out.println(listObj2.size());
    System.out.println(listObj.contains(45));//true
    System.out.println(listObj.containsAll(listObj));//true
    
    listObj.remove(0);
    listObj.removeAll(listObj);//5-3=2
    listObj.retainAll(listObj);//5-2==3
	}

}
