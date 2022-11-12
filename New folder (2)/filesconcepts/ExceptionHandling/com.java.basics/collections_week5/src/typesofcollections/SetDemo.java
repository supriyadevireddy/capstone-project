package typesofcollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Object> setObj=new HashSet<Object>();
		setObj.add(90);
		setObj.add(95);
		setObj.add(90);
		setObj.add("supriya");
		setObj.add("sai");
		setObj.add("bujji");

Iterator<Object> itrObj= setObj.iterator();
While(itrObj.hasNext());{
	System.out.println(itrObj.next());
}
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
