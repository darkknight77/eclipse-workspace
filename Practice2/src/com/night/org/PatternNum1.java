package com.night.org;

public class PatternNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1,num =1;
		for (int i = 0; i < 5; i++) {
			 num=1;
			for (int j = 0; j < count; j++) {
				
				System.out.print(num+" ");
				num++;
				
			}
			
			count++;
			System.out.println();
		}
		
	}

}
