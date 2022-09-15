package com.springcore.noconfig;

public class Student {
	private Samosa food;
	
	
	@Override
	public String toString() {
		return "Student [food=" + food + "]";
	}


	public Student(Samosa food) {
		super();
		this.food = food;
	}


	public void doStudy()
	{
		System.out.println("Doing study!");
	}
}
