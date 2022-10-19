/*
program: wap to print day using swichcase
@author: laxmi toppo
@date: 19 oct 20222
*/
import java.util.*;
class SwitchDemo//declaring a class
{
	//main started
    static void printDay(int d)//formal//dummy arguments
	{
	 switch(d)
	 {
		 
		 case 1:System.out.println("Monday");
		        break;
		 case 2:System.out.println("Tuesday");
		        break;
		case 3:System.out.println("Wednesday");
		        break;
		case 4:System.out.println("Thuesday");
		        break;
		case 5:System.out.println("Friday");
		        break;
		case 6:System.out.println("Satureday");
		        break;	
        case 7:System.out.println("Sunday");
		        break;				
		default :System.out.println("Wrong");
		        		
	 }//end of swithcase
    }
	
	//main started
	public static void main(String args[]) 
	{
	 //declaring the object of scanner
	 Scanner sc=new Scanner(System.in);
	 
	 //declaringvariables
	 int day;
	 
	 //taking input
	 System.out.println("Enter the day number :");
	 day= sc.nextInt();
	 printDay(day);
	}//end of main
	
}//end of class