/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.Demo3;

import com.Demo3.PaperBook1;
import com.demo2.Book;
import com.demo2.PaperBook;
//declaring paperbook1 and access the book1 class
public class PaperBook1 extends Book1{

	//instace variables
    int shipping_price=10;
    
    //method of print
	void print()
	{
		//call the method
		display();
		System.out.println("Shipping charge :"+shipping_price);
	}
	
	//state main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaperBook1 ob = new PaperBook1();
		//call method
		ob.print();
	}//end main

}//end class
