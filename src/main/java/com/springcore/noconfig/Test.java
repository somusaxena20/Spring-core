package com.springcore.noconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext obj = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = obj.getBean("student1",Student.class);
		System.out.println(s1);
		s1.doStudy();
	}

}
