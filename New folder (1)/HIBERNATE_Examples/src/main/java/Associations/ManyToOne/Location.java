package Associations.ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location_manyToOne")
public class Location {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="state")
	private String state;
	
	public Location() {
		super();
	}
	public Location(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	
	
}
