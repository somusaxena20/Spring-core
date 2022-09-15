package com.springcore.coninjec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/coninjec/ciconfig.xml");
		Person p = (Person)obj.getBean("person1");
		System.out.println(p);
		Addition add = (Addition)obj.getBean("add");
		add.doSum();
	}

}
