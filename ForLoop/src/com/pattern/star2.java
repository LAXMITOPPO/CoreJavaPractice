/*
 * wap to Star pattern
* @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */

package com.pattern;

public class star2 {
	//start starpattern3
	static void starpattern3(int num) {
			
			for(int i = 1; i <= num; i++) {
				System.out.println();
				for(int j = 1; j <= i; j++) 
				System.out.print(j+"   ");
			}//end of forloop
		}//end of starpattern3
	
	//start starpattern3
		static void starpattern5(int num) {
				
				for(int i = 1; i <= num - i; i++) {
					System.out.println();
					for(int j = 1; j <= i; j++) 
					System.out.print(j+"   ");
				}//end of forloop
			}//end of starpattern5
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling method

		starpattern3(5);
		starpattern5(5);
}
}
