package com.testing.org;

import java.util.ArrayList;

public class Fibonnaci {

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

	public static ArrayList<Integer> getFibonnaciFor(int count) {

		ArrayList<Integer> fibonnaciNums = new ArrayList<Integer>();
		int a = 0, b = 1, c = 0;
		fibonnaciNums.add(a);
		fibonnaciNums.add(b);

		for (int i = 0; c < count; i++) {

			c = a + b;
			fibonnaciNums.add(c);
			a = b;
			b = c;
		}

		return fibonnaciNums;

	}

	public static ArrayList<Integer> getFibonnaciWhile(int count) {

		ArrayList<Integer> fibonnaciNums = new ArrayList<Integer>();
		int a = 0, b = 1, c = 0;
		fibonnaciNums.add(a);
		fibonnaciNums.add(b);
		while (c < count) {

			c = a + b;
			fibonnaciNums.add(c);
			a = b;
			b = c;
			count--;

		}

		return fibonnaciNums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibonnaciWhile(100));
		System.out.println(getFibonnaciFor(100));
		
	}

}
