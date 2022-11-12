package Associations.OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args) {
		
Configuration configObj=new Configuration();
configObj.configure();

Session sessObj=configObj.buildSessionFactory().openSession();

Item item1 = new Item(11 , "laptop" , 9999);
Item item2 = new Item(22 , "mobile" , 2000);
Item item3 = new Item(33 , "earpods" , 999);
Item item4 = new Item(44 , "pen" , 22);

Cart cartObj = new Cart ();
cartObj.setCartId(1);
cartObj.setUserName("nitha");
cartObj.setGender('f');

Set<Item> items = new HashSet<Item>();
items.add(item1);
items.add(item2);
items.add(item3);
items.add(item4);

cartObj.setItems(items);

Transaction txObj = sessObj.beginTransaction();

sessObj.save(item1);
sessObj.save(item2);
sessObj.save(item3);
sessObj.save(item4);
sessObj.save(cartObj);

txObj.commit();
sessObj.close();


	}

}

