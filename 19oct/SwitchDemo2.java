/*
program: wap to print grade
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class SwitchDemo//declaring a class
{
	//main started
    static void printRemarks(char gr)//formal//dummy arguments
	{
	 switch(gr)
	 {
		 
		 case 'A':System.out.println("Excellent .........");
		        break;
		 case 'B':System.out.println("very good.........");
		        break;
		 case 'C':System.out.println("good...can do better");
		        break;
		 case 'D':System.out.println("fail....need to work very hard");
		        break;
		
		 default :System.out.println("Wrong input");
		        		
	 }//end of swithcase
    }//main started
	
	public static void main(String args[]) 
	{
	 //declaring the object of scanner
	 Scanner sc=new Scanner(System.in);
	 
	 //declaring variables
	 char grade;
	 
	 //taking input
	 System.out.println("Enter the grade:");
	 grade= sc.next().charAt(0);
	 printRemarks(grade);
	}//end of main
	
}//end of class