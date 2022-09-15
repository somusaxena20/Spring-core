package com.springcore;

public class Student {
	private int id;
	private String name;
	private String address;

//	Constructor

//	Default
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	Parameterized
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

//	Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

//	Setters
	public void setName(String name) {
		System.out.println("Setting Name"); // For checking purpose is SETTER INJECTION is used or not
		this.name = name;
	}

	public void setId(int id) {
		System.out.println("Setting Id"); // For checking purpose is SETTER INJECTION is used or not
		this.id = id;
	}

	public void setAddress(String address) {
		System.out.println("Setting Address"); // For checking purpose is SETTER INJECTION is used or not
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
