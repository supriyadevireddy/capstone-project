package com.app.Service;

import java.util.List;

import com.app.entity.SelectedStudentInfo;
import com.app.entity.Student;

public interface IStudentSrv {
	 String CreateStudent(Student st);
	 List<Student>getAllStudents();
	 List<SelectedStudentInfo>getStudentsSpecificData( int rollNo);
	 Long getCount();
	 boolean checkExistence(int rollNo);
}

