/*
 * Arrays
 * @author : Laxmi Toppo
 * @Date : 8 Nov 2022
 */
package com.arrays;
//declaring class
public class array {

	enum days{sun(5),mon(10),tue(30);
	//take variable
		int i;
	days(int i){
		this.i=i;
	}};
	//start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(days d:days.values())
		{
			System.out.println(d+"-"+d.i);
			//System.out.println(d);
		}
	}//end main

}//end class
