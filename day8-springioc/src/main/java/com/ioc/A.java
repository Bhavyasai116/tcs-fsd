package com.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A {
	public void method() {
		System.out.println("from A()");
	}
//	@PostConstruct
//	public void myInit() {
//		System.out.println(getClass()+"init()");
//	}
//	@PreDestroy
//	public void myDestroy() {
//		System.out.println(getClass()+"destroy()");
//	}
	
}
