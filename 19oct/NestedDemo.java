/*
program: Wap to print pass and fail according to the mRKS
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class NestedDemo//declaring a class
{
	//main started
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
	   //declaring variables
	   int gender;
	   float weight;
	   System.out.println("Enter your gender :");
	   gender= sc.next().charAt(0);
	   
	   System.out.println("Enter your weight :");
	   weight= sc.nextFloat();
	   
	   if(gender=='f')
	   {
		   if(weight>=60)
			   System.out.println("You can donate the blood.......");
		   else
			   System.out.println("you are underweight....please start healty eating habits");
	   }
	   else(gender=='m')
	   {
	   if(weight>=60)
			   System.out.println("You can donate the blood.......");
		   else
			   System.out.println("you are underweight....please start healty eating habits");
	   }  
		   System.out.println("You can't donate the blood.......");


	}//end of main
}//end of class