/*
program: Wap to print blood donate
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class NestedDemo3//declaring a class
{
	//main started
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
	   //declaring variables
	   char gender;
	   int age;
	   float weight;
	   
	   System.out.println("Enter your age :");
		   age=sc.nextInt();
	   if(age>=18)
	   {
		   //taking input
		   
		   
		   System.out.println("Enter your gender(m/f) :");
		   gender=sc.next().charAt(0);
		   
		   System.out.println("Enter your weight :");
	       weight= sc.nextFloat();
		   
		   if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
			   System.out.println("You candonate the blood.......");
		   else
			   System.out.println("you are underweight....better luck for next time");
	   }
	   else
		   System.out.println("you are to young to donate blood....plase wait");
	    //end of outer ifelse
	}//end of main
}//end of class