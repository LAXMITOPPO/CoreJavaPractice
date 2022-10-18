/*
program: to understand data type (Quotient/Modulus operator)
@author: laxmi toppo
@date: 18 oct 20222
*/
 
//declaring a class
class DataTypeDemo2
{
	public static void main(String args[])
	{
    int num1 = 90;
	int d= 6;
	System.out.println("Quotient:"+ num1/d);
	System.out.println("Remainder:"+ +num1%d);//modulus operator
	
	System.out.println(num1>89);
	
	boolean x=true, y=false;
	System.out.println("And:"+( x&y));
	System.out.println("OR:"+ (x|y));
	System.out.println("Not:"+ (!y));
	System.out.println("XOR:"+ (x^y));
	
	int a=6, b=8;
	System.out.println("And:"+( a&b));//here int is converted to the binary equivalent
	System.out.println("OR:"+ (a|b));
	System.out.println("Not:"+ (~b));
	System.out.println("XOR:"+ (a^b));
	System.out.println("--------------------------------------------------------------------");
	boolean status;
	System.out.println(status = (true&&false));
	System.out.println((a>=5)||(b>=10));
	System.out.println(20<<3);
	System.out.println(20>>3);
	

	}//end of main
}//end of class