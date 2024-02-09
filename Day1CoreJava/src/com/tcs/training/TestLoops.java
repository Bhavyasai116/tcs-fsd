package com.tcs.training;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.starting point
		//2.condition
		//3.statements
		//4.direction
		//5.termination
		//int start=1;
		//int stop=12;
		/*while(start<=stop) {
			System.out.println("Run="+start);
			start++;
		}
		for(start=1;start<=stop;start++) {
			System.out.println("Run="+start);
		}
		start=1;
		for(stop=10;stop>=start;stop--) {
			System.out.println("Run="+stop);
			
		}
		for(start=1;start<=stop/2;start++) {
			System.out.println("Run="+start);
		}
		for(start=1;start<=stop;start++) {
			System.out.println("Run="+start);
		}
		
		//print the sum of three continuous numbers
		
		int sum=0;
		//int count=1;
		for(int i=1;i<12;i+=3) {
			for(int j=i;j<i+3;j++) {
				sum=sum+j;
			}
			System.out.println(sum);
			sum=0;
		}
		int i=0;
		for(;i<=20;i++); {
			System.out.println(i);
		}*/
		//double interest=0;
		float n=100000;
		for(float i=1;i<=25;i++) {
			n=n+(0.13f*n);
		}
		System.out.println(n);
		
		

	}

}
