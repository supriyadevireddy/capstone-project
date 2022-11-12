package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsIntruduction {

	public static void main(String[] args) {
//below statements..we are creating 1 collection Object 
		ArrayList <Object>listObj = new ArrayList<Object>();
//below stmts .. we stored data in the collection object--add method
		
listObj.add(90);
listObj.add(78);
listObj.add("vishnu");
listObj.add(90);
listObj.add("babu");
listObj.add("M");
listObj.add(true);

//below stmts --to read data from collection 2 by 1
Iterator<Object>itrObj = listObj.iterator();
While(itrObj.hasNext());{//which checks whether do we have any value existed in the collection or not
System.out.println(itrObj.next());//next()just give you 1 value from the collection
}
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
