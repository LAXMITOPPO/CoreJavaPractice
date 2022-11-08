/*
 *Arrays
 * @author : Laxmi Toppo
 * @Date : 8 Nov 2022
 */
package com.arrays;
//declaring class
public class arr {

	//start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		int b[]= {1,2,3};
		int[][] c= new int[2][2];
		int d[][]= {{1,2},{3,4}};
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
			//System.out.println(b[i]);
		}*/
		
		//outer forloop
		for(int[]x:d) 
		{
			
			for(int y:x)//inner forloop
			{
				System.out.println(y);
			}
		}//end outer forloop
	}//end main

}//end class
