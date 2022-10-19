/*
program: Wap to print pass and fail according to the mRKS
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class MarksDemo//declaring a class
{
	//main started
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		//declaring the variables
		System.out.println("Enter your marks1 :");
		float marks1= sc.nextFloat();
		System.out.println("Enter your marks2 :");
		float marks2= sc.nextFloat();
		System.out.println("Enter your marks3 :");
		float marks3= sc.nextFloat();
		float sum= (marks1+marks2+marks3);
		float percent= (sum/300)*100;
		System.out.println(percent);
		
		if(percent>=40)
			System.out.println("congratulations..... you have passed :"+percent);//here printing the output
		else
			System.out.println("you have failed.........Do hardwork :"+percent);
	}//end of main
}//end of class