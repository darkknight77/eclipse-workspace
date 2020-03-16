package com.night.org;

public class Factorial {

	private static double factorial(int num) {
		double factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}

		return factorial;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(15));
		
	}

}
