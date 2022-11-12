package com.pojo;

public class User {

	private int userId;
	private String fName;
	private String lName;
	private String userName;
	private String pwd;
	public User() {
		super();
	}
	public User(int userId, String fName, String lName, String userName, String pwd) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.pwd = pwd;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", userName=" + userName
				+ ", pwd=" + pwd + "]";
	}
	
	
}
