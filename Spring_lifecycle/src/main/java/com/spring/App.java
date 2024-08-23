package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xml.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xml/config.xml");
		Student st=context.getBean("st",Student.class);
		System.out.println(st);
    }
}
