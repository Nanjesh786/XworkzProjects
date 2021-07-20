package com.book.bookapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookBean {
	
	private int isbn;
	private String bookName;
	private String author;
	private int price;
	
	private BookBean()
	{
		System.out.println(this.getClass().getSimpleName() +" created");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("bean initiated");
	}
 
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookBean [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
 @PreDestroy
	public void destory()
	{
		System.out.println("bean destroyed");
	}
	
}
