/*
 * wap to nested loop
 * @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */
package com.demo;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//outer for loop
		for(int i = 1; i <= 5; i++) {
			System.out.println();
			
			//inner for loop
			for(int j = i; j <= 5; j++) {
				if(i == j)
					continue;
				System.out.print(j + " ");
			}//end of inner loop
				
		}//end of outer loop
	}//end of main

}//end of class
