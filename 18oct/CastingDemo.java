/*
program: to understand data type (Quotient/Modulus operator)
@author: laxmi toppo
@date: 18 oct 20222
*/
 
//declaring a class
class CastingDemo
{
	public static void main(String args[])
	{
		//shortis of 2 bytes -32768 to 32767
		//declaring short data type
		short s1=56;
		short s2=98;
		//calculate the sum
		short sum;
		sum=(short)(s1+s2);//by default all the arithmetic operation given int output
		System.out.println("The sum is :"+sum);
		
		//byte -128 to 127
		byte b1= 67;
		byte b2= 23;
		byte cal= (byte)(b1+b2);
		System.out.println("the calc is :"+cal);
	
		
		double d1=89.5;
		double d2= 67.4;
		float dd= (float)(d1+d2);
		System.out.println("the dd is :"+dd);
	}
}