package oops.overridingconcepts;

public class Employee {
  private int Id;
  private String name;
  private int salary;
  
  public Employee() {
	  super();
  }
  public Employee(int Id, String name, int Salary) {
	  super();
	  this.Id = Id;
	  this.name = name;
	  this.salary = Salary;
  }
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
}
@SuppressWarnings("null")
int getbonus() {
	// TODO Auto-generated method stub
	return (Integer) null;
}
  
  }

