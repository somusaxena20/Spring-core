package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A)obj.getBean("aref");
		System.out.println(a);
		
	}

}
	