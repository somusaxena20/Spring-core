package com.springcore.coninjec;

public class Person {
	private String name;
	private int id;
	private String str;
	private Certi c;
	public Person(String name, int id , Certi c) {
		super();
		System.out.println("Integer constructor called!");
		this.name = name;
		this.id = id;
		this.c = c;
	}
	
	public Person(String name, String id , Certi c) {
		super();
		System.out.println("String constructor called!");
		this.name = name;
		this.str = id;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", str=" + str + ", c=" + c + "]";
	}
	
	
	
}
