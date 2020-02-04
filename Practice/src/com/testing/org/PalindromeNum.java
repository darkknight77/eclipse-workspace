package com.testing.org;

public class PalindromeNum {

	public static String isPalindrome(int num) {

		int temp = num;
		int r = 0, s = 0;
		while (temp > 0) {
			r = temp % 10;
			temp = temp / 10;
			s = s * 10 + r;
		}

		if (num == s)
			return num + " is a palindrome number";

		return num + " is not a palindrome number";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(131));

	}

}
