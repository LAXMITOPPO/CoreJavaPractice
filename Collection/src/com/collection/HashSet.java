/*
 * java program to add elements to a linkedlist
 * @author : Laxmi Toppo
 * @Date : 21-12-2022
 */
package com.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//declaring class
public class HashSet {
	// declaring main
	public static void main(String[] args) {

		// create object of class hashset
		Set<Integer> s1 = new TreeSet<>();
		Set<Integer> s2 = new TreeSet<>();
		// adding elements to the set
		s1.add(11);
		s1.add(22);
		System.out.println(s1);
		s2.add(33);
		s2.add(44);
		System.out.println(s2);
		s1.addAll(s2);
		Iterator<Integer> i = s1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		} // end whileloop

	}// end main

}// end class
