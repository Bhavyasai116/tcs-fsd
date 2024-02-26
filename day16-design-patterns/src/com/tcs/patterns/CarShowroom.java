package com.tcs.patterns;

public class CarShowroom {
	public static void main(String[] args) {
		Car car=CarFactory.makeACar("Hyundai");
		System.out.println(car);
		Car car1=CarFactory.makeACar("Toyota");
		System.out.println(car1);
		
	}

}
