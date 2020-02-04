package com.testing.org;

import java.util.ArrayList;

public class RemoveDupFromArray {

	public static int[] arrListToArr(ArrayList<Integer> list) {
		
		int[] newArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newArray[i]= list.get(i);
		}
		return newArray;
	}
	
	
	
	public static int[] removeDups(int[] array) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		boolean isDup = false;
		
		for (int i = 0; i < array.length; i++) {
			isDup = false;
			for (int j = i+1; j < array.length; j++) {
				
		       if(array[i]==array[j]) isDup = true;             			
			}
			if(!isDup) list.add(array[i]); 	   
		}
		
		int newArray[] = arrListToArr(list); 
		return newArray;
		
		
	}
	
	public static void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i == array.length-1)continue;
			System.out.print(" , ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,22,334,4,5675,905,6,7,8,88,23,34,645,67,78,4,22,7,9};
		printArray(array);
		System.out.println();
		int[] newArray = removeDups(array);
		printArray(newArray);
	}


	
}
