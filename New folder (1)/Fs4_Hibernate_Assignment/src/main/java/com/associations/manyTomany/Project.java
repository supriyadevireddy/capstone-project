package com.associations.manyTomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Project_manyTomany")
public class Project {
    @Id
    @Column(name="p_id")
	private int pId;
    @Column(name="p_name")
	private String pName;
    @Column(name="teamSize")
	private int teamSize;
	public Project() {
		super();
	}
	public Project(int pId, String pName, int teamSize) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.teamSize = teamSize;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", teamSize=" + teamSize + "]";
	}
	
}
