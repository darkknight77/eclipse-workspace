package com.testing.org;

public class Find2ndLargeNumInArr {

	private static int secondLargestNum(int arr[]) {

		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {

			if (largest < arr[i]) {

				secondLargest = largest;
				largest = arr[i];

			}

		}

		return secondLargest;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 10, 22, 33, 44, 70, 55, 66, 77 };

		System.out.println(secondLargestNum(arr));

	}

}
