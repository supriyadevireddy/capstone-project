package typesofcollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> setObj=new TreeSet<Integer>();
		setObj.add(90);
		setObj.add(80);
		setObj.add(90);
		setObj.add(40);
		setObj.add(30);
		setObj.add(40);
		setObj.add(10);
		setObj.add(97);
		
		Iterator<Integer>itrObj = setObj.iterator();
		While(itrObj.hasNext());{
			System.out.println(itrObj.next());
		}


	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
