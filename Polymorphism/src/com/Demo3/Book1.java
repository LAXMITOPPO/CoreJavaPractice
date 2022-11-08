/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.Demo3;
//declaring class
public class Book1 {

	//take variables
	int book_id;
	String book_name,author_name;
	float price;

	
	public Book1() {
		super();
		this.book_id = 101;
		this.book_name = "kkkjkj";
		this.author_name = "author_name";
		this.price = 2222f;
	}
	public void display() {
		System.out.println("ID:"+book_id);
		System.out.println("Name:"+book_name);
		System.out.println("Auther Name::"+author_name);
		System.out.println("Price:"+price);
	}
	
}//end class
