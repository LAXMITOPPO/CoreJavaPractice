
/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.demo2;

//paperbook class access the book class
public class PaperBook extends Book{
	
	//declaring a instance variable
	int shipping_price=10;
	
	//method to print 
	void print()
	{
		//call method
		display();
		System.out.println("Shipping charge :"+shipping_price);
	}
	
	//declaring main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring object of class

		PaperBook ob = new PaperBook();
		
		//call the method
		ob.print();
		
	}

}
