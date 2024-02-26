package com.tcs.patterns;

public class CarFactory {
	public static Car makeACar(String brand) {
		if(brand.equals("Hyundai"))
			return new Hyundai();
		else if(brand.equals("Toyota"))
			return new Toyota();
		return null;
	}

}
