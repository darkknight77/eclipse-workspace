package com.night.org;

public class FactorialRecursion {

	static double factorial = 1;

	private static double factorial(int num) {

		if (num > 0) {
			factorial *= num * factorial(num - 1);
			//System.out.println(factorial);
		}
		
		return factorial;
	}

	/// 1.307674368E12
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(15));
	}

}
