package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
//@Scope("prototype")
public class Student {
	@Value("Jabalpur")
	private String city;
	@Value("M.P.")
	private String state;
	@Value("#{l1}")
	private List<String> l;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<String> getL() {
		return l;
	}
	public void setL(List<String> l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return "Student [city=" + city + ", state=" + state + ", l=" + l + "]";
	}
}
