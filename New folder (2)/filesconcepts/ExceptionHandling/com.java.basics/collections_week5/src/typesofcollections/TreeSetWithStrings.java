package typesofcollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithStrings {

	public static void main(String[] args) {
    Set<String>setObj = new TreeSet<String>();
    setObj.add("html");
    setObj.add("css");
    setObj.add("java");
    setObj.add("Spring");
    setObj.add("angular");
    setObj.add("typeScript");

Iterator<String>itrObj = setObj.iterator();
While( itrObj.hasNext());{
	System.out.println(itrObj.next());
}
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
