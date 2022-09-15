package com.springcore.expressionlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/expressionlang/config.xml");
		Demo d = obj.getBean("d1",Demo.class);
		System.out.println(d);
	}

}
