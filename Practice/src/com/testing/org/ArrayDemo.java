package com.testing.org;

public class ArrayDemo {

	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	public static void print2dArray(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+"  ");	
			}
			System.out.println();
		}
		
	}
	
	public static void insertValueInArray(int[] arr,int index,int newValue) {
		arr[index] = newValue;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[] = new int[5];
	int arr2[] = {10,20,30,40,50,60};
	int arr3[][] = {{100,200,300},{500,600}};
	int arr4[][] = new int[5][3];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i;
	}
	for (int row = 0; row < arr4.length; row++) {
		for (int col = 0; col < arr4[row].length; col++) {
			arr4[row][col] = 100 + col+row+ + 5; 
		}
	}
	
	printArray(arr);
	printArray(arr2);
	insertValueInArray(arr2, 2, 55);	
	printArray(arr2);
	
	print2dArray(arr3);
	print2dArray(arr4);
	}

}
