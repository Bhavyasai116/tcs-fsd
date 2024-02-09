package com.tcs.training;

public class TestTypesVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=0;
		if(a<=10) {
			c= a+b;
		}
		if(a>10) {
			c=a-b;
		}
		//System.out.println(c);
		boolean result= a>b && a>c;

		result = false == false;
		result= false == result;
		result = !true;
		boolean flag=true;
		if(flag == true) {
			System.out.println(flag);
		}else {
			System.out.println(flag);
		}
		System.out.println(result);
		
		//test a is negative or positive
		a= -20;
		if(a!=0) {
			if(a<0) {
				System.out.println("a is negative");
			}else {
				System.out.println("a is positive");
			}
		}else {
			System.out.println("a is zero");
		}
		
	
	int total =500;
	int subjects = 6;
	//prgm to print the grade 'a+','a','b','c','d','fail'
	double avg=total/subjects;
	if(avg>=90) {
		System.out.println("a+");
	}else if(avg<90 && avg>=80){
		System.out.println("a");
	}else if(avg<80 && avg>=70){
		System.out.println("b");
	}else if(avg<70 && avg>=60){
		System.out.println("c");
	}else if(avg<60 && avg>=50){
		System.out.println("d");
	}else {
		System.out.println("fail");
	}
	
}}

