
/*
 * wap to while loop
 * @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */
package com.While;

import java.util.Scanner;
//declaring class
public class Example1 {

	private static String fruit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  int i = 0;
		   while (i <= 10) {
			System.out.println(i);
			i++;
				}	*/
        Scanner sc= new Scanner(System.in);
		boolean ch= true;
		
		while(ch) {
			System.out.println("enter a fruit :");
			fruit=sc.next();
			System.out.println("Do you want to entre more fruit(true/false) :");
			ch=sc.nextBoolean();
			
		}//ends whileloop
		sc.close();
	}//end of main
	

}//end of class
