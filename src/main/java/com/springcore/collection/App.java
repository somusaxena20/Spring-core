package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		Emp e = (Emp)obj.getBean("emp1");
		System.out.println(e);
		
	}

}
