package com.testing.org;

public class ReverseWordsInSentence {

	private static String ReverseWords(String s) {
		StringBuilder newString = new StringBuilder();
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char c[] = arr[i].toCharArray();
			for (int j = c.length - 1; j >= 0; j--) {

				newString.append(c[j]);
			}
			newString.append(" ");

		}

		return newString.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello Im Anubhav from Quora";
		System.out.println(ReverseWords(s));
	}

}
