package Associations.ManyToMany;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
	@Table(name="st_manytomany")
	public class Student {

		@Id
		@Column(name="roll_no")
		private int rollNo;
		@Column(name="st_name")
		private String name;
		@Column(name="gender")
		private char gender;
		@Column(name="mobile")
		private long mobile;
		@Column(name="email")
		private String email;

		@ManyToMany
		@JoinTable(name = "st_course_manytomany", 
		joinColumns = { @JoinColumn(name = "roll_no") },
		inverseJoinColumns = { @JoinColumn(name = "c_id") })
		private Set<Course> courses;

		public Student() {
			super();
		}

		public Student(int rollNo, String name, char gender, long mobile, String email, Set<Course> courses) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.gender = gender;
			this.mobile = mobile;
			this.email = email;
			this.courses = courses;
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

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Set<Course> getCourses() {
			return courses;
		}

		public void setCourses(Set<Course> courses) {
			this.courses = courses;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile + ", email="
					+ email + ", courses=" + courses + "]";
		}

	}

