package com.testing.org;

public class Pattern2 {

	public static void printPattern(int rows, int stars) {

		for (int i = 0; i < rows; i++) {

			for (int k = 0; k < stars; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			stars++;	
		}

	}

	public static void main(String[] args) {		
		printPattern(5, 1);
		
	}

}
