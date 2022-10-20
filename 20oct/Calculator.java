/*
program: wap to  using swichcase
@author: laxmi toppo
@date: 20 oct 20222
*/
import java.util.*;
class Calculator//declaring a class
{
	//main started
    static void add(float n1 ,float n2)//formal//dummy arguments
	{
     float result = n1+n2;
	 System.out.println("Result is :"+result);
    }
	
	static void sub(float n1, float n2)//formal//dummy arguments
	{
     float result = n1-n2;
	 System.out.println("Result is :"+result);
    }
	
	static void mul(float n1, float n2)//formal//dummy arguments
	{
     float result = n1*n2;
	 System.out.println("Result is :"+result);
    }
	
	static void div(float n1, float n2)//formal//dummy arguments
	{
     float result = n1/n2;
	 System.out.println("Result is :"+result);
    }
	
	//main started
	public static void main(String args[]) 
	{
	 //declaring the object of scanner
	 Scanner sc=new Scanner(System.in);
	 
	 //declaring variables
	 float num1,num2;
	 int choice;
	 
	 //taking input 2 numbers
	 System.out.println("Enter two numbers :");
	 num1= sc.nextFloat();
	 num2= sc.nextFloat();
	 	 
		 //menu
		 System.out.println("1.Add ");
		 System.out.println("2.Sub ");
		 System.out.println("3.Mul ");
		 System.out.println("4.Div ");
		 System.out.println("5.Exit ");
		 System.out.println("Enter your choice :" );
		 choice= sc.nextInt();
		 switch(choice)
	 {
		 
		case 1:add(num1,num2);
		        break;
		case 2:sub(num1,num2);
		        break;
		case 3:mul(num1,num2);
		        break;
		case 4:div(num1,num2);
		        break;
		case 5:System.exit(0);
		        break;				
		default :System.out.println("Wrong choice");
		        		
	 }//end of swithcase
	}//end of main
	
	
}//end of class