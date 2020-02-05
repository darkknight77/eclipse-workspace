package com.testing.org;

public class Pattern1 {
	
	public static void printPattern(int rows, int spaces, int stars) {

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < stars; k++) {
				System.out.print("* ");
			}
			System.out.println();
			spaces--;
			stars++;	
		}

	}

	public static void main(String[] args) {		
		printPattern(5, 4, 1);
		
	}

}
