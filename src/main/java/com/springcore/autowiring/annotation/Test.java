package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autoconfig.xml");
		Emp e = obj.getBean("e1", Emp.class);
		System.out.println(e);
	}

}
