package com.testing.org;

public class StringReverse {

	private static String reverseString(String s) {

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			reverse += s.charAt(i);
		}

		return reverse;
	}
	
	
	private static String reverseStringCharArray(String s) {

		String reverse = "";

		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {

			reverse += c[i];

		}

		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseString("Denmark"));
		System.out.println(reverseStringCharArray("Newyork"));
	}

}
