package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.SelectedStudentInfo;
import com.app.entity.Student;

//by extending JpaRepository we no need to write queries on repository layer jpa will take care of it
public interface IStudentRepo extends JpaRepository<Student , Integer>{

	
	@Query("select  new com.app.entity.SelectedStudentInfo(s. rollNo , s.name , a.city , a.state)   from student s join s. adress a where s. rollNo > ?1")
	public List<SelectedStudentInfo> getStudentRequiredinfo(int rollNo);
		
	
	
}

