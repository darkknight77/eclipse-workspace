package com.night.org;

public class PalindromeNum {

	private static void palindrome(int num) {
		
		int r=1,s=0,temp=num;
		while(num>0) {
			
			r = num%10;
			num=num/10;
			s= s*10 + r; 
			
		}
		
		if(temp == s)  System.out.println(temp +" is a palindrome");
		else System.out.println(temp +" is not a palindrome");
			
		
	}
	
	public static void main(String[] args) {

		palindrome(53235);
		
	}

}
