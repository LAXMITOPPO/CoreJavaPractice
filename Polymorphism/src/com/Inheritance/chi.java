/*
 * inheritance
 * @author : Laxmi Toppo
 * @Date : 8 Nov 2022
 */
package com.Inheritance;
//start chi class and access the inh class
public class chi extends inh {

	
	public void full()
	{
		System.out.println("derived");
	}
	
	//start main
	public static void main(String[] args) {
	
		//chi ob= new chi();//derived
		//inh ob= new chi();//derived
		//inh ob= new inh();//house full
		chi ob= (chi)new inh();//exception
		
		ob.full();//call the method

	}//end main

}//end class
