package typesofcollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//list<Object> listObj= new Arraylist<Object>();
    List<Object> listObj = new LinkedList<Object>();
    listObj.add(90);
    listObj.add("supriya");
    listObj.add(95);
    listObj.add(90);
    listObj.add(true);
    listObj.add(true);
    Iterator<Object> itrObj=listObj.iterator();
    While(itrObj.hasNext());{
    	System.out.println(itrObj.next());
    }

	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
