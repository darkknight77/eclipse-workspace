package com.night.org;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "This is the power of bucky";
		String[] arr= s.split(" ");
		String reverse="";
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = arr[i].length()-1; j >= 0; j--) {
				
				reverse+= arr[i].charAt(j);
			}
			
			reverse+=" ";
		}
		
		System.out.println(reverse);
	}

}
