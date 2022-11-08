/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.Demo4;

import com.Demo3.PaperBook1;
//decalring paperbook2 class and access book2 class
public class PaperBook2 extends Book2{

	//instance variable
	int shipping_price=10;
	
	protected void display(){
		
		super.display();//call the method
		System.out.println("overrided.........");
	}
	//method of print
	void print()
	{
		
		display();//call the method
		System.out.println("Shipping charge :"+shipping_price);
	}
	
	//method of type
	protected void type() {
		System.out.println("paper.........");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaperBook2 ob = new PaperBook2();
		//call the method
		ob.print();
		ob.type();
	}
     //end main
}//end class
