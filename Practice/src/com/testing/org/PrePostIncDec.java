package com.testing.org;

public class PrePostIncDec {

	private static void preInc(int num) {
		System.out.println("Given num " + num);
		System.out.println("Given num before pre increment " + num);
		int a = ++num;
		System.out.println("Given num after pre increment " + a);

	}

	private static void preDec(int num) {
		System.out.println("Given num " + num);
		System.out.println("Given num before pre decrement " + num);
		int a = --num;
		System.out.println("Given num after pre decrement " + a);

	}

	private static void postInc(int num) {
		System.out.println("Given num " + num);
		System.out.println("Given num before post increment " + num);
		int a = num++;
		System.out.println("Given num after post increment " + a);

	}

	private static void postDec(int num) {
		System.out.println("Given num " + num);
		System.out.println("Given num before post decrement " + num);
		int a = num--;
		System.out.println("Given num after post decrement " + a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		 * int a=5;
		 * 
		 * 
		 * int temp; temp = a; a++; a=temp;
		 * 
		 * 
		 * int j= ++a;
		 * 
		 * a= a++; System.out.println(a+" "+" "+a);
		 */

		
		  preInc(5); 
		  preDec(5); 
		  postInc(5); 
		  postDec(5);
		 

		
	}

}
