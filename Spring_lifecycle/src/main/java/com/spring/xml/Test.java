package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import org.springframework.context.support.*;


public class Test {
	public static void main(String a[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xml/config.xml");
		context.registerShutdownHook();
		Student st=context.getBean("st",Student.class);
		System.out.println(st);
	}
}
