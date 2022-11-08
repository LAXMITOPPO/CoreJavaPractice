/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.Demo4;
//declaring class
public class Book2 {

    //take variables
	private int book_id;
	private String book_name,author_name;
	private float price;

	public Book2() {
		super();
		this.book_id = 101;
		this.book_name = "kkkjkj";
		this.author_name = "author_name";
		this.price = 2222f;
	}
	protected void display() {
		System.out.println("ID:"+book_id);
		System.out.println("Name:"+book_name);
		System.out.println("Auther Name::"+author_name);
		System.out.println("Price:"+price);
	}
	
}//end class
