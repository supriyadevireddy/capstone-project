package typesofcollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import multithreading.Employee;

public class TreeSetWithObjects {

	public static void main(String[] args) {
		Employee emp1 = new Employee(10,"supriya,9000");
		Employee emp2 = new Employee(20,"sai,8000");
		Employee emp3 = new Employee(30,"sreenitha,9500");
		Employee emp4 = new Employee(40,"sruthi,8500");
		Employee emp5 = new Employee(50,"mastan,7500");
		
		Set<Employee>setObj = new TreeSet<Employee>();
		setObj.add(emp1);
		setObj.add(emp2);
		setObj.add(emp3);
		setObj.add(emp4);
		setObj.add(emp5);
		
		Iterator<Employee>itrObj = setObj.iterator();
		While(itrObj.hasNext());{
		

			System.out.println(itrObj.next());
		}


		
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
