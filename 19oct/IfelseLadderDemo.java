/*
program: Wap to print blood donate
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class IfelseLadderDemo//declaring a class
{
	//main started
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
	   //declaring variables
	   int num1,num2,num3;
	   
	   System.out.println("Enter number1 :");
	   num1=sc.nextInt();
	   System.out.println("Enter number2 :");
	   num2=sc.nextInt();
	   System.out.println("Enter number3 :");
	   num3=sc.nextInt();
	   
		   if((num1>num2)&&(num1>num3))
			   System.out.println("The greater number is :"+num1);
		   else if(num2>num3)
			   System.out.println("The greater number is :"+num2);
	          else
		          System.out.println("The greater number is :"+num3);
			  
	   	   //end of outer ifelse
			   
	}//end of main
}//end of class