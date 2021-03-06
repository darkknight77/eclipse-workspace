package com.testing.org;

import java.util.ArrayList;

public class EvenOdd {

	private static ArrayList<Integer> evenOdd(String mode, int count) {

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 1; i <= count; i++) {
			if (i % 2 == 0)
				even.add(i);
			else
				odd.add(i);
		}

		if (mode.contentEquals("even"))
			return even;
		else if (mode.contentEquals("odd"))
			return odd;
		else
			return new ArrayList<Integer>();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(evenOdd("odd", 100));

	}

}
