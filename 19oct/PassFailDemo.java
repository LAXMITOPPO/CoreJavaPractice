/*
program: Wap to print pass and fail according to the mRKS
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class PassFailDemo//declaring a class
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc =new Scanner(System.in);
         //declaringthe the variables
		float subject1,subject2,subject3,percentage;
		//taking input
		System.out.println("Enter the marks subject1 :");
		subject1= sc.nextFloat();
		System.out.println("Enter the marks subject2 :");
		subject2= sc.nextFloat();
		System.out.println("Enter the marks subject3 :");
		subject3= sc.nextFloat();
		//calulating percentage
		percentage=((subject1+subject2+subject3)/300)*100;
		if(percentage>=40)
	        System.out.println("congratulations..... you have passed :");//here printing the output
		else
			System.out.println("you have failed.........Do hardwork :");
	}//end of main
}//end of class