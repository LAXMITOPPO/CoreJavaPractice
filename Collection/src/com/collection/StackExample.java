/*
 * java program to implement a stack using linkedlist
 * @author : Laxmi Toppo
 * @Date : 21-12-2022
 */
package com.collection;

import java.util.Stack;

//class declaring
public class StackExample {
	// declaring main
	public static void main(String[] args) {
		// create object of class Stackexample
		Stack<String> st = new Stack<>();
		// insert stack values
		st.push("RAM");
		st.push("SITA");
		st.push("MOHAN");
		System.out.println(st);
		st.pop();// delete top element of stack
		System.out.println(st);
		System.out.println(st.search("RAM"));
	}// end main
}// end class
