package com.testing.org;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for  (int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
			if (i == 3) {
				System.out.println("continue %%%%%%%%%%%%%%%%%%%%%%%%% i");
				continue ;

			}
			for (int j = 0; j < 10; j++) {
				System.out.println("j: "+j);
				if (j == 3) {
					System.out.println("continue-------------------- j");
					continue ;
				}
				System.out.println("Shit");
				
				
			}

			System.out.println("Shit******");
		}
	}

}
