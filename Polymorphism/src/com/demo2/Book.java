/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.demo2;

//declaring class Book
public class Book {
	
     //take variables
	int book_id;
	String book_name,author_name;
	float price;

	public Book() {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.price = price;
	}
	//
	public void display() {
		System.out.println("ID:"+book_id);
		System.out.println("Name:"+book_name);
		System.out.println("Auther Name::"+author_name);
		System.out.println("Price:"+price);
	}
	
}//end class Book
