package com.springcore.collection;

import java.util.*;

public class Emp {
	private String name;
	private Set<String>phone;
	private List<String>address;
	private Map<String, String>course;
	private Properties prop;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, Set<String> phone, List<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", address=" + address + ", course=" + course + "]";
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
}
