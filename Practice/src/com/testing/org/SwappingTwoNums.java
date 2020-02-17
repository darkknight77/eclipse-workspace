package com.testing.org;

public class SwappingTwoNums {

	private static void swap(int a,int b) {
		System.out.println("Before Swap : a = "+a+" b = "+b );
		
		int c=0;
		
		c=b;
		b=a;
		a=c;
		
		
		System.out.println("After Swap : a = "+a+" b = "+b );
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
swap(5, 10);
	}

}
