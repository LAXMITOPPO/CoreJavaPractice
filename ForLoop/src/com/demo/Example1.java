package com.demo;

public class Example1 {
	static void printEven() {
		for (int i =0; i<=20; i++) {
			if(i%2==0) {
				System.out.println(i);			}
		}//end of if
	}//end of loop
private static void printTable(int num) {
	
	for (int i=1;i<=10;i++) {
		System.out.println(num+"x"+i+"="+(num*i));
	}
}
	public static void main(String[] args) {
		printEven();
		printTable(Integer.parseInt(args[0]));
		
	}
}
