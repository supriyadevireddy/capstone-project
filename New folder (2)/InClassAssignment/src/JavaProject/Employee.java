package JavaProject;

public class Employee {

	public static void main(String[] args) {
	 
		int Id;
		String Name;
		 int Salary;
	
	}

	private Object Id;
	private Object Name;
	private Object Salary;

	public Employee() {
		super();

		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
		
	
	}

	public Object getId() {
		return Id;
	}

	private void getBonus() {
		// TODO Auto-generated method stub
		
	}

	public void setId(Object id) {
		Id = id;
	}

	public Object getName() {
		return Name;
	}

	public void setName(Object name) {
		Name = name;
	}

	public Object getSalary() {
		return Salary;
	}

	public void setSalary(Object salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	


	}


