package com.testing.org;

public class Factorial {
	
	public static double getFactorialRecursion(int num) {

		int factorial = 1;
		
	return 	 factorial*getFactorial(num--);
		
	}
	
	public static double getFactorial(int num) {
			
			double factorial=1;
			
			for (int i = 1; i <= num; i++) {
				
				factorial*=i;
			}
			
			return factorial;
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFactorial(20));
		System.out.println(getFactorialRecursion(5));
	}

}
