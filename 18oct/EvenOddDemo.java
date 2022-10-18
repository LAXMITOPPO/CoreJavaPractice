/*
program: to understand ifelse
@author: laxmi toppo
@date: 18 oct 20222
*/
import java.util.*;
class EvenOddDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number :");
		 int num=sc.nextInt();
		 
		 if((num%2)==0)
			 System.out.println("The Even number is :"+num);
		 else
	         System.out.println("The Odd number is :"+num); 
	}
}