package com.springcore.noconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
	@Bean("samosa1")
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean("student1")
	public Student getStudent()
	{
		return new Student(getSamosa());
	}
}
