/*
 * java program to add elements to a linkedlist
 * @author : Laxmi Toppo
 * @Date : 21-12-2022
 */
package com.collection;

import java.util.LinkedList;

//declaring class
public class Linklist {
	// start main
	public static void main(String[] args) {

		// create object of class linkedlist
		LinkedList<Integer> ll = new LinkedList<>();
		LinkedList<String> ii = new LinkedList<>();
		// adding elements to the linked list
		ll.add(20);
		ll.add(30);
		ii.add("laxmi");
		ii.add("sunita");
		System.out.println(ll.size());
		System.out.println(ll.get(1));
		System.out.println(ll.contains(33));
		System.out.println(ll);
		System.out.println(ii.size());
		System.out.println(ii.get(1));
		System.out.println(ii.contains(88));
		System.out.println(ii);
	}// end main

}// end class
