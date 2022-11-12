package com.isATablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contractemp_tablepercalss")
public class ContractEmployee  extends Employee {
	
	@Column(name="hourlyPrice")
private int hourlyPrice;
	@Column(name ="duration")
private int duration;

public ContractEmployee() {
	super();
}
public ContractEmployee( int emplId , String name , String designation , int hourlyPrice, int duration) {
	super(emplId , name , designation);
	this.hourlyPrice = hourlyPrice;
	this.duration = duration;
}
public int getHourlyPrice() {
	return hourlyPrice;
}
public void setHourlyPrice(int hourlyPrice) {
	this.hourlyPrice = hourlyPrice;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "ContractEmployee [hourlyPrice=" + hourlyPrice + ", duration=" + duration + "]";
}


}



