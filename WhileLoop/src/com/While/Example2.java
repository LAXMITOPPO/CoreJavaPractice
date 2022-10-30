/*
 * wap to do while loop
 * @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */
package com.While;
//declaring import
import java.util.Scanner;
//declaring class
public class Example2 {

	private static String fruit;
	
	//declaring main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring object of class
		Scanner sc =new Scanner(System.in);
		boolean ch = true;
	
		do//ch ==true
		{
			System.out.println("enter a fruit :");
			fruit=sc.next();
			System.out.println("Do you want to entre more fruit(true/false) :");
			ch=sc.nextBoolean();

		}while (ch);//end of do whileloop
		
		sc.close();
  	}//end of main

}//end of class
