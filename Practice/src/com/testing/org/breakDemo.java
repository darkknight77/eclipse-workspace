package com.testing.org;

public class breakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for  (int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
			if (i == 3) {
				System.out.println("break i");
				break;

			}
			for (int j = 0; j < 10; j++) {
				System.out.println("j: "+j);
				if (j == 3) {
					System.out.println("break j");
					break ;

				}
			}

			
		}

	}

}
