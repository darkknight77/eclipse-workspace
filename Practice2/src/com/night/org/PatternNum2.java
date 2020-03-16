package com.night.org;

public class PatternNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int num = 1;
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j < count; j++) {
				
				System.out.print(num+" ");
				num++;
				
			}
			
			count++;
			System.out.println();
		}
		
		
		
	}

}
