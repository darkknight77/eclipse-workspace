package com.night.org;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "TOKYO";
		String reverse ="";
		char[] c= s.toCharArray();
		for (int i = c.length-1; i >=0; i--) {
			//reverse += s.charAt(i);
			reverse += c[i];
		}	
		System.out.println(reverse);
	}

	
	
	
}
