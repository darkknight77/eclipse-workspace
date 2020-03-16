package com.night.org;

public class Fibonnaci {
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
	
	private static void fib() {
	
		int a = 0,b=1,c=1;
		System.out.print(a+" "+b+" ");
		while(c<100) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
            
           
		}
		
		
	}
	
	public static void main(String[] args) {
		
		fib();
		
		
		
	}

}
