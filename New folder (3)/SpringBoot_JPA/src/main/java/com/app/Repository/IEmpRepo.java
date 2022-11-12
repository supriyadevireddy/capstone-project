package com.app.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.Employee;

public interface IEmpRepo extends JpaRepository<Employee , Integer> {

	// if we want to get salary above 5000 we use conditions like this(restrictions)
	
	@Query( " from Employee e  where e.salary > ?1")//hql Query
public List<Employee> getEmployeesBasedOnSalary(int  salary) ;
	
}



