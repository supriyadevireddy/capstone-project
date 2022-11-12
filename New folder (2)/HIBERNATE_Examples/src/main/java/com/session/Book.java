package com.session;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="amount")

private int amount;
	@Column(name="b_name")
private String name;
	@Column(name="b_author")
private String author;

public Book() {
	super();
}
public Book(int amount, String name, String author) {
	super();
	this.amount = amount;
	this.name = name;
	this.author = author;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [amount=" + amount + ", name=" + name + ", author=" + author + "]";
}

}

