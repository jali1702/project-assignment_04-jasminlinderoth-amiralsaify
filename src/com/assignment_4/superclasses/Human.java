package com.assignment_4.superclasses;

/**
 * 
 * @author jasmin and Amir
 * My superclass Human that gets and sets name and age of our customer
 *
 */
public class Human {
	private String name = "";
	private int age = 0;

	/**
	 * Constructor method
	 * @param name
	 * @param age
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * getter
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter
	 * @param sets name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter
	 * @return int age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * setter
	 * @param sets age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
