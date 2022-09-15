package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj = new  ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student s = obj.getBean("s1",Student.class);
		System.out.println(s.hashCode());
		Student s1 = obj.getBean("s1",Student.class);
		System.out.println(s1.hashCode());
		
		Teacher t1 = obj.getBean("t1",Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = obj.getBean("t1",Teacher.class);
		System.out.println(t2.hashCode());
	}

}
