package com.night.org;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 5;
		int space = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < count; j++) {
				System.out.print("* ");
			}

			count--;
			space++;
			System.out.println();
		}
		
		
	}

}