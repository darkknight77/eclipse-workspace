package com.testing.org;

import java.util.ArrayList;

public class primeNum {

	// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
	// 73, 79, 83, 89, and 97

	public static String isPrime(int num) {
		boolean isPrime = true;
		String message ="";
		for (int i = 2; i < 10; i++) {
			isPrime = true;
			if (num % i == 0 && num!=i) {
				isPrime = false;
				message =  num + " is not a prime number.";
				break;
			}
		}
		if (isPrime)
			message = num + " is a prime number.";
		return message;
	}

	
	public static ArrayList<Integer> getPrimeNums(int totalNums) {

		ArrayList<Integer> primeNums = new ArrayList<>();

		for (int i = 2; i < totalNums; i++) {

			boolean isprime = false;

			for (int j = 2; j < 10; j++) {

				if (i % j == 0 && i != j) {
					isprime = false;
					break;
				} else
					isprime = true;
			}
			if (isprime)
				primeNums.add(i);
		}
		return primeNums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getPrimeNums(100));
		System.out.println(isPrime(9));

	}

}
