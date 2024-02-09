package com.ioc;

public class C{
	A a;
	public C() {
		// TODO Auto-generated constructor stub
	}

	public C(A a) {
		super();
		this.a=a;
		// TODO Auto-generated constructor stub
	}
	public void other() {
		System.out.println(getClass());
		a.method();
	}

}
