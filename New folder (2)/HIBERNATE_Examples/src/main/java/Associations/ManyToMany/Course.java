package Associations.ManyToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="course_manytomany")
	public class Course {

		@Id
		@Column(name="c_id")
		private int cId;
		@Column(name="c_name")
		private String name;
		@Column(name="duration")
		private int duration;
		@Column(name="fee")
		private int fee;
		@Column(name="tutor")
		private String tutor;
		public Course() {
			super();
		}
		public Course(int cId, String name, int duration, int fee, String tutor) {
			super();
			this.cId = cId;
			this.name = name;
			this.duration = duration;
			this.fee = fee;
			this.tutor = tutor;
		}
		public int getcId() {
			return cId;
		}
		public void setcId(int cId) {
			this.cId = cId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
		public String getTutor() {
			return tutor;
		}
		public void setTutor(String tutor) {
			this.tutor = tutor;
		}
		@Override
		public String toString() {
			return "Course [cId=" + cId + ", name=" + name + ", duration=" + duration + ", fee=" + fee + ", tutor=" + tutor
					+ "]";
		}
		
	}

