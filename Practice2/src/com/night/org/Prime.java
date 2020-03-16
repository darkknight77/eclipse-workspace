package com.night.org;

public class Prime {

	// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
	// 73, 79, 83, 89, and 97

	private static void getPrimes(int count) {
		boolean prime = true;
		for (int i = 2; i < count; i++) {
			prime = true;
			for (int j = 2; j < 10; j++) {

				if (i % j == 0 & i != j) {
					prime = false;
					break;
				}

			}

			if (prime) {
				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPrimes(100);

	}

}
