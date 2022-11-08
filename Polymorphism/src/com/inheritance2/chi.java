/*
 * inheritance
 * @author : Laxmi Toppo
 * @Date : 8 Nov 2022
 */
package com.inheritance2;

//declaring class
public class chi extends inh {

	public void full()
	{
		System.out.println("derived");
	}
	
	//start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chi ob= new chi();
		
		//call the method
		ob.full(); //derived
		ob.full(8);//housefull
	}//end main

}//end class
