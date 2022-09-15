package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		System.out.println("Setting Emp Value!");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Emp(Address address) {
		super();
		System.out.println("Inside Emp Constructor!");
		this.address = address;
	}
	
	
}
