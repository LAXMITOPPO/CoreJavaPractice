/*
program: grade system
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class StaticGrading//declaring a class
{
	//main started
    static void calcGrade(float percentage)
	{
	   //declaring variables
	   char grade;	   
	   	   
	    if(percentage>85)
			   grade ='A';
		   else if(percentage>=75)
			   grade ='B';
	          else if(percentage>=60)
		       grade ='C';
			    else if(percentage>=45)
		         grade ='D';
			      else
			        grade ='F';
		   
	   	   //end of ifelse
	    if(grade='F')
			System.out.println("sorry!!!  you have failed....workhard next time");
		else
			System.out.println("you have clear the exam with grade:"+grade);   
	}//end of method calcGrade
	
	//main started
	public static void main(String args[]) 
	{
	 //declaring the object of scanner
	 Scanner sc=new Scanner(System.in);
	 //declaringvariables
	 float percentage;
	 //taking input
	 System.out.println("Enter the percentage :");
	 percentage= sc.nextFloat();
	 //calling methodcalcGrade(per);
	}//end of main
	
}//end of class