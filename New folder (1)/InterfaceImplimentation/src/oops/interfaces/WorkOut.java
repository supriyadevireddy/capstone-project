package oops.interfaces;

public class WorkOut {

	private String type;
	private String equipment;
	private int weights;
	private int repititions;
	private String reason;
	
	public WorkOut() {
		super();
	
	}

	public WorkOut(String type, String equipment, int weights, int repititions, String reason) {
		super();
		this.type = type;
		this.equipment = equipment;
		this.weights = weights;
		this.repititions = repititions;
		this.reason = reason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public int getWeights() {
		return weights;
	}

	public void setWeights(int weights) {
		this.weights = weights;
	}

	public int getRepititions() {
		return repititions;
	}

	public void setRepititions(int repititions) {
		this.repititions = repititions;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "WorkOut [type=" + type + ", equipment=" + equipment + ", weights=" + weights + ", repititions="
				+ repititions + ", reason=" + reason + "]";
	}
	
	
	
	
	
	
	
	



	}


