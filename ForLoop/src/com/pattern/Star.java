/*
 * wap to Star pattern
* @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */

//declaring package
package com.pattern;
//declaring class
public class Star {

	static void starpattern1(int rows) {
		int j;
		//outer loop
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			//inner loop for spaces
			for(j = rows -1; j >= i; j-- ) {
				System.out.print("   ");
			}
			//inner loop to print star
			for(j =1; j <= i; j++) {
				System.out.print("*");
			}//inner loop ends
		}//outer loop ends
	}
	//start pattern2
static void starpattern2(int num) {
		
		for(int i = num; i >= 1; i--) {
			System.out.println();
			for(int j = 1; j <= i; j++) 
			System.out.print(" *  ");
		}//end of forloop
	}//end of pattern2

//start starpattern3
	static void starpattern3(int num) {
			
			for(int i = 1; i <= num; i++) {
				System.out.println();
				for(int j = 1; j <= i; j++) 
				System.out.print(" *  ");
			}//end of forloop
		}//end of starpattern3
	
//start starpattern4
	static void starpattern4(int num) {
			
			for(int i = 1; i <= num; i++) {
				System.out.println();
				for(int j = 1; j <= i; j++) 
				System.out.print(j+"   ");
			}//end of forloop
		}//end of starpattern4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling method
		starpattern1(5);
		System.out.println();
        starpattern2(6);
        System.out.println();
        starpattern3(5);
        System.out.println();
		starpattern4(5);
        
       
	}//end of main

}//end of class
