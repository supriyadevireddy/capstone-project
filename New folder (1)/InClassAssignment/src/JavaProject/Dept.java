package JavaProject;

public class Dept {

	private static Object Name = null;
	private static Object Salary = null;

	public static void main(String[] args) {
		
		String  Id;
		String Name;

	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
		public Object getId() {
			Object Id = null;
			return Id;
		}

		private void getBonus() {
			// TODO Auto-generated method stub
			
		}

		public void setId(Object id) {
			Object Id = id;
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
		return "Dept [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
