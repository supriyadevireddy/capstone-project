package com.app;

import java.io.Serializable;

public class Book implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 7736986996576789455L;
private int amount;
private int bookId;
private String author;
private String name;

public Book() {
	super();
}

public Book(int amount, int bookId, String author, String name) {
	super();
	this.amount = amount;
	this.bookId = bookId;
	this.author = author;
	this.name = name;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Book [amount=" + amount + ", bookId=" + bookId + ", author=" + author + ", name=" + name + "]";
}

}

