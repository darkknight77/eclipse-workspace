package com.night.org;

public class StringPalindrome {

	public static String isPalindrome(String s) {

		String reverse = "";
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			reverse += c[i];
		}
		if (s.equals(reverse)) {
			return s + " is a palindrome";
		} else {
			return s + " is not a palindrome";
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("otto"));
	}

}
