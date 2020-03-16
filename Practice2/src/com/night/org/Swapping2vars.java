package com.night.org;

public class Swapping2vars {

	
	private static void swap(int a,int b) {
	
		System.out.println("Before Swap " +a +" "+b );
		int c= 0;
		c=b;
		b=a;
		a=c;
		System.out.println("After Swap " +a +" "+b );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		swap(5, 15);
		
	}

}
