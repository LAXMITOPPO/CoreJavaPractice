/*
program: Wap to print blood donate
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class GradingSystem//declaring a class
{
	//main started
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
	   //declaring variables
	   char grade;
	   float percentage;
	   
	   System.out.println("Enter percentage:");
	   percentage=sc.nextFloat();
	
		   if(percentage>85)
			   System.out.println("The grade is :A");
		   else if(percentage>=75)
			   System.out.println("The grade is :B");
	          else if(percentage>=60)
		          System.out.println("The grade is :C");
			  else if(percentage>=45)
		          System.out.println("The grade is :D");
			  else
				  System.out.println("The grade is :Fail");

	   	   //end of outer ifelse
			   
	}//end of main
}//end of class