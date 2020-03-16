package com.collection.org;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Vector<String> movies = new Vector<String>();
		
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
