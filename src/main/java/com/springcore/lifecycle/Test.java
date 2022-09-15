package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext obj = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s = (Samosa)obj.getBean("s1");
		System.out.println(s);
		
		// for enable register shutdown hook so AbstractApplicationContext having that method so we need to enable that from there
		obj.registerShutdownHook();
		
		Pepsi p = (Pepsi)obj.getBean("p1");
		System.out.println(p);
		
		Example ex = (Example)obj.getBean("sub1");
		System.out.println(ex);
		
		
	}

}
