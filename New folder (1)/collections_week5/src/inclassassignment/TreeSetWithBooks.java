package inclassassignment;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithBooks {

	public static void main(String[] args) {
		Book b1 = new Book("abc","supriya",900);
		Book b2 = new Book("the wall","dravid",300);
		Book b3 = new Book("xyz","sai",800);
		Book b4 = new Book("ghi","sree",500);
		
		Set<Book> setObj = new TreeSet<Book>();
		setObj.add(b1);
		setObj.add(b2);
		setObj.add(b3);
		setObj.add(b4);
		Iterator<Book> itrObj = setObj.iterator();
		While(itrObj.hasNext());
		System.out.println(itrObj.next());


	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
