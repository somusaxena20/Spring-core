package com.springcore.standlone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/standlone/collection/standloneconfig.xml");
		Person p = obj.getBean("p1", Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getFees().getClass().getName());
	}

}
