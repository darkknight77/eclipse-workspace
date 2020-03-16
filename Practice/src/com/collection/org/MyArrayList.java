package com.collection.org;

import java.util.ArrayList;
import java.util.Iterator;


public class MyArrayList {

	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		//The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.
		
		ArrayList<String> movies = new ArrayList<String>();
		
		String arr[]= {"Dil","Avengers","Joker","Thor","Predator","Fast and Furious","Into the wild"};
		
		for (int i = 0; i < arr.length; i++) {
			
			movies.add(arr[i]);
		}
		
		
		Iterator<String> itr = movies.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
