/*
 * Example2 class
 * @Author :Laxmi Toppo
 * @Date :28 oct 2022
 */

//declaring package
package com.demo;

//declaring class
public class Example2 {

	private static void printTable(int num) {
		//TODO Auto-generated method stub
		
		for (int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		
		}//end forloop
	}//end printTable
		
	public static void main(String[] args) {
		//TODO Auto-generated method stub
			
			printTable(Integer.parseInt(args[0]));
			
		}//end of main
}//end of class
