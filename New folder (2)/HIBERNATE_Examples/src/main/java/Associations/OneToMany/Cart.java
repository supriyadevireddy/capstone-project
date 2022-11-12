package Associations.OneToMany;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="cart_onetoMany")
public class Cart {
@Id
@Column(name="cartId")
private int cartId;
@Column(name="username")
private String userName;
@Column(name="gender")
private char gender;

@OneToMany
@JoinColumn
private Set<Item>items;

public Cart() {
	super();
}
public Cart(int cartId, String userName, char gender, Set<Item> items) {
	super();
	this.cartId = cartId;
	this.userName = userName;
	this.gender = gender;
	this.items = items;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public Set<Item> getItems() {
	return items;
}
public void setItems(Set<Item> items) {
	this.items = items;
}
@Override
public String toString() {
	return "Cart [cartId=" + cartId + ", userName=" + userName + ", gender=" + gender + ", items=" + items + "]";
}


}

