package com.Student1construct;

import com.Student.student;

public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student(102,"laxmi",129);
		student s2 = new student(103,"ram",128);
		student s3 = new student(104,"mohan");
		
		
		student s4 = new student();
		s4.setId(102);
		s4.setName("lax");
		s4.setMarks(67.8f);
		
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
	
		System.out.println("student name :"+s4.getName());
		
	}
	

}
