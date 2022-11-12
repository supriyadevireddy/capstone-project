package Q_And_A_4;

public class Dept {

	private int dId;
	private String dName;
	private String location;
	public Dept() {
		super();
	}
	public Dept(int dId, String dName, String location) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.location = location;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Dept [dId=" + dId + ", dName=" + dName + ", location=" + location + "]";
	}
	
	

}

