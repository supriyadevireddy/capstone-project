package Repository;



import java.util.List;

public interface IEmplRepo {
	
int createEmployee (Pojo.Employee eObj);
int updateEmployee(EmployeeRepoImpl eObj);
int deleteEmployee(int emplId);
List<Pojo.Employee> getEmployees();
Pojo.Employee getEmployee(int emplId);
}

