package com.tcs.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestBean {
//	@Autowired
	static HelloService service;
	public static void main(String[] args) {
		ApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloWorld hello=(HelloWorld) ctxt.getBean("helloBean");
		System.out.println(hello.message());
//		HelloWorld hellomsg=(HelloWorld) ctxt.getBean("helloService");
//		service.callHello();
	}

}
