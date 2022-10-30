/*
 * wap to factorial
 * @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */
//declaring package
package com.pattern;
//declaring a class
public class Pyramid1 {

	//start pattern1
	static void pattern1() {
		for(int i = 1; i <= 5; i++) {
			System.out.println();
			for(int j = 1; j <= i; j++) 
			System.out.print(j + "   ");
			
		}//end of forloop
		}//end of pattern1
	
	//start pattern2
	static void pattern2(int num) {
			
			for(int i = 1; i <= num; i++) {
				System.out.println();
				for(int j = 1; j <= i; j++) 
				System.out.print(j+"   ");
			}//end of forloop
		}//end of pattern2
	
	//start pattern3
	static void pattern3(int num) {
		
		for(int i = num; i >= num; i--) {
			System.out.println();
			for(int j = num; j <= i; j++) 
			System.out.print(j+"   ");
		}//end of forloop
	}//end of pattern3
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call the method
		pattern1();
		System.out.println();
		pattern2(5);
		System.out.println();
		 pattern3(5);
		 System.out.println();
		 pattern4(5);
	}

	
}
