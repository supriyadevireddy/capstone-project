package Associations.ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_manyToOne")
public class Student {
	@Id
	@Column(name="rollNo")
private  int rollNo;
	@Column(name="name")
private String name;
	@Column(name="gender")
private char gender;
	@ManyToOne
	@JoinColumn
private Location location;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, char gender, Location location) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.location = location;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", location=" + location + "]";
	}
	

}
