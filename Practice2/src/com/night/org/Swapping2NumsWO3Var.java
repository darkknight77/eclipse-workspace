package com.night.org;

public class Swapping2NumsWO3Var {

	private static void swap(int a,int b) {
		
		System.out.println("Before Swap " + a +" "+ b );
		
		a = a+b;
		b = a-b;
		a = a-b;
		 
		
		System.out.println("After Swap " +a +" "+b );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swap(5, 15);
		
	}

}
