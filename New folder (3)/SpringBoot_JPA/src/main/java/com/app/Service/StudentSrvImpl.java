package com.app.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.SelectedStudentInfo;
import com.app.entity.Student;
import com.app.repository.IAddressRepo;
import com.app.repository.IStudentRepo;
@Service
public class StudentSrvImpl implements IStudentSrv{
	
	@Autowired
	private IStudentRepo studentrepo;
	public void setStudentrepo(IStudentRepo studentrepo) {
		this.studentrepo = studentrepo;
	}
	
	
	@Autowired
	private IAddressRepo addressrepo;
	public void setAddressrepo(IAddressRepo addressrepo) {
		this.addressrepo = addressrepo;
	}
	
	public String CreateStudent(Student st) {
		addressrepo.save(st.getAddress());
		studentrepo.save(st);
		return "student  creation sucess";
	}

	public List<Student> getAllStudents() {
		List<Student>students =studentrepo.findAll();
		return students;
	}

	public List<SelectedStudentInfo> getStudentsSpecificData( int rollNo) {
	List<SelectedStudentInfo> result=	studentrepo.getStudentRequiredinfo(rollNo);
		return result;
	}

	public Long getCount() {
		long result =studentrepo.count();
		return result;
	}

	public boolean checkExistence(int rollNo) {
		boolean result = studentrepo.existsById(rollNo);
		return result;
	}

}

