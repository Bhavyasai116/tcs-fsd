package com.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
		Object obj=context.getBean("b");
		B b=(B) obj; //casting
		b.other();
		C c=(C) context.getBean("c");
		c.other();
//		boolean result=context.isPrototype("a");
//		System.out.println(result);
		
	}
	
}
