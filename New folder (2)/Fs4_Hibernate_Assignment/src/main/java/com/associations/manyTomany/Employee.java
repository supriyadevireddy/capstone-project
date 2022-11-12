package com.associations.manyTomany;

import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="empl_manyTomany")
public class Employee {
    @Id
    @Column(name="empl_Id")
	private int emplId;
    @Column(name="empl_name")
	private String name;
    @Column(name="salary")
	private int salary;
	
    
    @ManyToMany
    @JoinTable(name="Employee_Project_ManyToMany",
    joinColumns = {@JoinColumn(name = "empl_Id")},
    inverseJoinColumns = { @JoinColumn(name = "P_Id")})
	private Set<Project> Projects;

	public Employee() {
		super();

	}

	public Employee(int emplId, String name, int salary, Set<Project> projects) {
		super();
		this.emplId = emplId;
		this.name = name;
		this.salary = salary;
		Projects = projects;
	}

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
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

	public Set<Project> getProjects() {
		return Projects;
	}

	public void setProjects(Set<Project> projects) {
		Projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", name=" + name + ", salary=" + salary + ", Projects=" + Projects + "]";
	}
	
	
}
