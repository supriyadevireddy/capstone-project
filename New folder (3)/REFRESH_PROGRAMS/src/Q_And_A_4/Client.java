package Q_And_A_4;
import java.util.Map;
import java.util.TreeMap;

public class Client {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "harsha", 9000);
		Employee e2 = new Employee(105, "vishnu", 9500);
		Employee e3 = new Employee(102, "sai", 7800);
		Employee e4 = new Employee(110, "anand", 9900);
		Employee e5 = new Employee(107, "yoshi", 4000);
		
		Dept d1 = new Dept(1, "IT",  "hyd");
		Dept d2 = new Dept(2, "CSE", "mumbai");
		Dept d3 = new Dept(3, "ECE", "noida");
		
		Map<Employee, Dept> mapObj = new TreeMap<Employee, Dept>();
		
		mapObj.put(e1,  d1);
		mapObj.put(e2,  d2);
		mapObj.put(e3,  d3);
		mapObj.put(e4,  d1);
		mapObj.put(e5,  d2);
		
		mapObj.entrySet().stream().forEach(x -> System.out.println(x.getKey()+" -- "+x.getValue()));
		
	}

}

