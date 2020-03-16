package com.night.org;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 4, 7, 9, 12, 15, 7, 36, 5, 4, 36 };

		for (int i = 0; i < arr.length; i++) {
			
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;

				}

			}
			System.out.println(arr[i] + " - " + count);

		}

	}

}
