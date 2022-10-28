/*
 * Wap to print number through break and continue
 * @Author :Laxmi Toppo
 * @Date :26 oct 2022
 */
package com.demo;
//Declaring a class
public class BreakcontinueDemo {
//Declaring a main
	public static void main(String args[]) {
		// TODO Auto-generated method stub
        System.out.println("----------with Break--------");
		for(int i= 0; i<=10; i++) { 
			 if(i==7)
		     break;
			System.out.println(i);
		 }
		//break : to come out of the loop
		
		 System.out.println("----------with Continue-------");
		 for(int i= 0; i<=10; i++) { 
		 if(i==7)
		 continue;//skips the iteration for that particular value
		 System.out.println(i);//these statements are skipped
	 }
	
	}//end of main
}//end of class
