/*
program: to understand ifelse
@author: laxmi toppo
@date: 18 oct 20222
*/
import java.util.*;
//declariong a class
class VotingDemo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age :");
		int age= sc.nextInt();
		if(age>=18)
			System.out.println("you are eligible for voting :"+age);
		else
			System.out.println("you are not eligible for voting :"+age);			
	}
}