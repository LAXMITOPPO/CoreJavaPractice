/*
program: to understand data type using scanner or incement/decrement
@author: laxmi toppo
@date: 18 oct 20222
*/
 import java.util.Scanner;
//declaring a class
class ScannerDTD
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a charecter");
		
	char charValue = sc.next().charAt(0);//taking the charecter input
		
	int asciiValue = charValue;//converting char to asciiValue
		
	System.out.println("The Ascii Value of"+  charValue +" is: "+asciiValue);//print asciivalue
     
	 //number1++ //post increment:value is used and then incremented
    int number1= 67;
	int sum1= number1++;
    System.out.println("value of sum using number1++ :"+ sum1);
	  
	 //++number2 //pre increment:value is incremented and then used
    int number2= 67;
    int sum2= ++number2;
    System.out.println("value of sum2 using ++number2 :"+ sum2);
	
	//~tlide:negative of each each number
	//The negative of 0 is 1
	System.out.println("not sum2:"+ ~sum2);
	
	int n= 1;
	System.out.println("not n:"+ ~n);
	 
	 //number3-- //post decrement:value is used and then decremented
	int number3= 67;
	int sum3= number3--;
    System.out.println("value of sum3 using number3-- :"+ sum3);
	
	//number4 //pre decrement:value is decremented and then used
	int number4= 67;
    int sum4= --number4;
    System.out.println("value of sum4 using --number4 :"+ sum4);
	
	}//end of main
}//end of class