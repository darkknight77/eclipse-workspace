package com.testing.org;

public class Pattern5 {

	public static void printPattern(int rows, int count, int num) {

		for (int i = 0; i < rows; i++) {

			for (int k = 0; k < count; k++) {
				System.out.print(num);
			}
			System.out.println();
			count++;
			num++;	
		}
	}
	public static void main(String[] args) {		
		printPattern(5,1,1);
		
	}

}
