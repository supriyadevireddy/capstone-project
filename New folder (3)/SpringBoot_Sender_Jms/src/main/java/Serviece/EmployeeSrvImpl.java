package Serviece;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import pojo.Employee;
import repository.IEmplRepo;
@Service
public class EmployeeSrvImpl implements IEmplSrv {
	
@Autowired	
private IEmplRepo emplRepo;
public void setEmplRepo(IEmplRepo emplRepo) {
	this.emplRepo = emplRepo;
}
@Autowired
private JmsTemplate jmsTemplate;
public void setJmsTemplate(JmsTemplate jmsTemplate) {
	this.jmsTemplate = jmsTemplate;
}

	public String createEmployee(Employee eObj) {
		int result = emplRepo.createEmployee(eObj);
		if(result ==0) {
			return "employee creation failure";
		}else
			jmsTemplate.convertAndSend( "first_jms" , eObj);
			return"employee creation sucess";
		
	}

	public String updateEmployee(Employee eObj) {
		int result = emplRepo.updateEmployee(eObj);
		if (result ==0) {
			return "employee updation failure";
		}else
			return"employee updation sucess";
	}

	public String deleteEmployee(int emplId) {
		int result = emplRepo.deleteEmployee(emplId);
if(result==0) {
	return "employee deletion sucess";
}else {
	return"employee deletion suess";
}
	}

	public List<Employee> getEmployees() {
		List<Employee> employees =emplRepo.getEmployees();
		return employees;
	}

	public Employee getEmployee(int emplId) {
		return emplRepo.getEmployee(emplId);
	}

}

