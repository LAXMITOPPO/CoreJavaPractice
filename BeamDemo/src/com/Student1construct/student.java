package com.Student1construct;

public class student {

	private int id;
	private String name;
	private float marks;
	
	public student(){
		super();
		System.out.println("default.......");
		}
	public student(int id, String name,float marks) {
		super();
		System.out.println("paramiter1.....");
		
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	public student(int id,String name) {
		super();
		System.out.println("paramiter2.....");
		this.id= id;
		this.name= name;
	}
	 
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
