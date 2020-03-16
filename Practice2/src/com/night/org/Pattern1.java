package com.night.org;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count = 1 ;
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < count; j++) {
				System.out.print("*");	
			}
			count++;
			System.out.println();
		}
		
	}

}
