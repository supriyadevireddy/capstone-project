package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.ResponseEntity;
import com.app.entity.SelectedStudentInfo;
import com.app.entity.Student;
import com.app.service.IStudentSrv;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	 @Autowired
	private IStudentSrv studentsrv;
	public void setStudentsrv(IStudentSrv studentsrv) {
		this.studentsrv = studentsrv;
		
	}@PostMapping(value="/action")
		public ResponseEntity createStudent(@RequestBody Student st) {
		String result =	studentsrv.CreateStudent(st);
		ResponseEntity resp = new ResponseEntity(200 , result);
			return resp;	
	}
	@GetMapping(value="/action")
	public ResponseEntity getAllStudents() {
		List<Student>students = studentsrv.getAllStudents();
		ResponseEntity resp = new ResponseEntity(200 , students);
		return resp;
	}
	@GetMapping(value="/selectedData")
	public ResponseEntity getsSelectedDataOfStudents( @PathVariable int rollNo) {
		List<SelectedStudentInfo> result = studentsrv.getStudentsSpecificData(rollNo);
		ResponseEntity resp = new ResponseEntity(200 , result);
		return resp;
		
	}
	@GetMapping(value="/getcount")
	public ResponseEntity getCount() {
		long result = studentsrv.getCount();
		ResponseEntity resp = new ResponseEntity(200 , result);
		return resp;
		
	}
	@GetMapping(value="/check")
	public ResponseEntity checkExistence(@PathVariable int rollNo) {
		boolean result = studentsrv.checkExistence(rollNo);
		ResponseEntity resp = new ResponseEntity(200 , result);
		return resp;
		
	}
	
	
}

