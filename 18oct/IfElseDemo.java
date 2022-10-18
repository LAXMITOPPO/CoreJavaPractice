/*
program: to understand ifelse
@author: laxmi toppo
@date: 18 oct 20222
*/
import java.util.*;
//declaring a class
 class IfElseDemo
 {
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter first number :");
		 int num1=sc.nextInt();
		 System.out.println("enter second number :");
		 int num2=sc.nextInt();
		 if(num1>num2)
			 System.out.println("The greater number is :"+num1);
		 else
	         System.out.println("The greater number is :"+num2); 
	 }
 }