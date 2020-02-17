package com.testing.org;

public class SwappingTwoNumWoThirdVar {

	private static void swap(int a,int b) {
		System.out.println("Before Swap : a = "+a+" b = "+b );
		//5 10
	a = a+b;
	b = a - b; //5
	a = a - b; 
	
		
		System.out.println("After Swap : a = "+a+" b = "+b );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
swap(15, 10);
	}

}
