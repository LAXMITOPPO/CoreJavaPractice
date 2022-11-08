/*
 * polymorphism
 * @author : Laxmi Toppo
 * @Date : 7 Nov 2022
 */
package com.Demo;

import java.util.Scanner;
//declaring class
public class calculation {

    
	public void add (int a) {
		a++;
		System.out.println(a);
	}

	public void add (int a ,int b) {
		
		System.out.println(a+b);
	}
    public void add (char ch) {
		
		System.out.println((int)ch);
	}
    public void add (float x ,float y) {
	
	System.out.println(x+y);
    }
	//declaring main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring object of class
		calculation cal=new calculation();
		//call the method
		cal.add('a');
		cal.add(9);
		cal.add(2,3);
		cal.add(9.4f,9.2f);
	}//end main

}//end class
