package Associations.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_oneToMany")
public class Item {
	@Id
	@Column(name="itemId")
private int itemId;
	@Column(name="name")
private String name;
	@Column(name=" cost")
private int cost;

public Item() {
	super();
}
public Item(int itemId, String name, int cost) {
	super();
	this.itemId = itemId;
	this.name = name;
	this.cost = cost;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Item [itemId=" + itemId + ", name=" + name + ", cost=" + cost + "]";
}


}

